package Arreglo;

class Main {
    public static int ListaMenu(){
        int opcion;
        do{
            opcion=Teclado.LeeEntero("1)Insertar\n2)Listar\n3)Actualizar\n"
                    + "4)Buscar\n5)Borrar\n6)Ordenar\n7)Salir\nOpcion: ");
            if(opcion>7||opcion<1)
                System.out.println("Opcion no valida. Seleccione una opcion valida");
        }while(opcion>7||opcion<1);
        return opcion;
    }
    
    public static void main (String []args){
        //Variables Locales
        int dato, pos, max, opcion, aux, cont, nuevo;
        Arreglo miarreglo;//Aqui se crea la variable de tipo arreglo
        max=Teclado.LeeEntero("Dame el tamaño del arreglo: ");
        miarreglo=new Arreglo(max);//Aqui se crea el objeto arreglo
    
        do{
    
            opcion=ListaMenu();
            switch(opcion){
            case 1:
                if(miarreglo.ValidaEspacio()){                              //Se necesita miarreglo para poder llamar a la clase ValidaEspacio por que no pertnece a esta clase
                    miarreglo.Insertar(Teclado.LeeEntero("Dame el dato: "));
                    }
                else
                    System.out.println("No existe espacio en el arreglo");
            break;
        
            case 2:
                miarreglo.Listar();
            break;
            
            case 3:
                dato=Teclado.LeeEntero("Dame el dato para actualizar: ");
                pos= miarreglo.Buscar(dato);
                if (pos!=-1)
                    miarreglo.Actualizar(pos);
            break;
            
            case 4:
                aux=0;
                cont=0;
                dato=Teclado.LeeEntero("Dame el dato a buscar: ");
                pos=miarreglo.Buscar(dato,aux);
                do{
                    if(pos!=-1){
                        cont++;
                        miarreglo.Listar(pos);
                        aux++;
                        pos=miarreglo.Buscar(dato,aux);
                        }
                    else{
                        aux++;
                        pos=miarreglo.Buscar(dato,aux);}
                    }while(aux!=max);
                if (cont==0)
                    System.out.println("No existe el dato: "+ dato);
            break;
            
            case 5:
                dato=Teclado.LeeEntero("Dame el dato a borrar: ");
                pos=miarreglo.Buscar(dato);
                if (pos!=-1){
                    dato=miarreglo.Borrar(pos);
                    System.out.println("Dato borrado");
                }
            break;
                
          /*case 6:
                int eleccion;
                eleccion=Teclado.LeeEntero("¿Por cual metodo desea hacer el " 
                        + "ordenamiento?\n1)Intercambio\n2)Seleccion\n3)Insercion\nMetodo: ");
                switch (eleccion){
                    case 1:
                       
                    break;
                    
                    case 2:
                        
                    break;
                        
                    case 3:
                       
                    break;    
                }
            break;*/
            }
        }while(opcion!=7);
    }
}