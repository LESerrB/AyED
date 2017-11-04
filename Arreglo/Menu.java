package Arreglo;

class Menu {
    
    public int ListaMenu(String texto, int opc_max){
        int opcion;
        do{
            opcion=Teclado.LeeEntero(texto);
            if (opcion>opc_max || opcion<1)
                System.out.println("Opcion no Valida");
        }while(opcion>opc_max || opcion<1);
    return opcion;
  } 
}

class Empleado{
//Atributos
    private int Clave;
    private String Nombre;
    private String Genero;
    private Arreglo Sueldo;
    private Direccion Dir;
    private Arreglo Tel;
    
//Constructores
    public Empleado(int max_s, int max_t){
        Sueldo=new Arreglo(max_s);  //Se crea el objeto Sueldo
        Tel=new Arreglo(max_t);     //Se crea el objeto Tel
        Dir=new Direccion();        //Se crea el objeto Dir
    }
    
//Metodos
    public void CapturaEmpleado(){
        LeeClave();
        LeeNombre();
        LeeGenero();
        CapturaTels();
        CapturaSueldo();
        Dir.CapturaDireccion();
    }
    
    public void LeeClave(){
        Clave=Teclado.LeeEntero("Clave: ");
    }
    
    public void LeeNombre(){
        Nombre=Teclado.LeeCadena("Nombre: ");
    }
    
    public void LeeGenero(){
        Genero=Teclado.LeeCadena("Genero: ");
    }
    
    public void CapturaTels(){
        int dato;
        if(Tel.ValidaEspacio()){
            dato= Teclado.LeeEntero("Ingresa el Numero Telefonico: ");
            Tel.Insertar(dato);
        }
        else
            System.out.println("No existe espacio en el arreglo");
    }
    
    public void CapturaSueldo(){
        int dato;
        if(Sueldo.ValidaEspacio()){
            dato= Teclado.LeeEntero("Ingresa el Sueldo: ");
            Sueldo.Insertar(dato);
        }
        else
            System.out.println("No existe espacio en el arreglo");
    }
    
    public void Listar(){
        System.out.print(Clave+"\t"+Nombre+"\t"+Genero"\t");
        Sueldo.Listar();
        Tel.Listar();
        Dir.Listar();
    }
    
    public void ActualizarDatos(){
        int opcion;
        Menu menu= new Menu();
        do{
            opcion= menu.ListaMenu("1)Nombre\n2)Genero\n3)Sueldos\n4)Telefono\n5)Direccion\n6)Salir\nOpcion: ",6);
            switch(opcion){
                
                case 1:
                    LeeNombre();
                break;
                
                case 2:
                    LeeGenero();
                break;
                    
                case 3:
                    ActualizaSueldo();
                break;
                
                case 4:
                    ActualizaTels();
                break;
                
                case 5:
                    Dir.Actualizar();
                break;    
            }
        }while(opcion!=6);
    }
    
    public void ActualizaSueldo(){
        Menu menu=new Menu();
        int opcion, dato, pos;
                    
        do{
            opcion=menu.ListaMenu("1)Insertar\n2)Modificar\n3)Borrar\n4)Salir\nOpcion: ", 4);
            switch (opcion){
                case 1:
                    CapturaSueldo();
                break;
                
                case 2:
                    dato=Teclado.LeeEntero("Dame el sueldo del empleado: ");
                    pos=Sueldo.Buscar(dato);
                    if(pos!=1)
                        Sueldo.Actualizar(pos);
                break;
                
                case 3:
                    dato=Teclado.LeeEntero("Dame el suledo a borrar: ");
                    pos=Sueldo.Buscar(dato);
                    if(pos!=-1)
                        Sueldo.Borrar(pos);
                break;    
            }
        }while(opcion!=4);
    }
    
    public void ActualizaTels(){
        Menu menu=new Menu();
        int opcion, dato, pos;
                    
        do{
            opcion=menu.ListaMenu("1)Insertar\n2)Modificar\n3)Borrar\n4)Salir\nOpcion: ", 4);
            switch (opcion){
                case 1:
                    CapturaTels();
                break;
                
                case 2:
                    dato=Teclado.LeeEntero("Dame el telefono del empleado: ");
                    pos=Tel.Buscar(dato);
                    if(pos!=1)
                        Tel.Actualizar(pos);
                break;
                
                case 3:
                    dato=Teclado.LeeEntero("Dame el telefono a borrar: ");
                    pos=Tel.Buscar(dato);
                    if(pos!=-1)
                        Tel.Borrar(pos);
                break;    
            }
        }while(opcion!=4);
    }
}
