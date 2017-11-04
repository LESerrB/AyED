package OrdenamientosAleatorios;

public class NewMain {

    public static int Menu() {
        int opcion;
        do{
            opcion=Teclado.LeeEntero("\n1)Mostrar Arreglo\n2)Ordenar arreglos\n");
            if(opcion>2||opcion<1)
                System.out.println("Opcion no valida.");
        }while(opcion>2||opcion<1);
        return opcion;
    }
    public static void main (String []args){
        int opcion, tam; //Variables Locales
        Aleatorios vector;//Aqui se crea la variable de tipo arreglo
        tam=Teclado.LeeEntero("Dame el tamaño del arreglo: ");
        vector=new Aleatorios(tam);//Aqui se crea el objeto arreglo
    
        do{
            opcion=Menu();
            switch(opcion){
                
            case 1:
            	vector.Listar();

            break;

            case 2:
            	vector.OrdenarArreglos(tam-1);
            break;

        	}
    	}while (opcion!=7);
        
    }
}
