package Arreglo;

class Direccion{
//Atributos
    private int Num;
    private String Calle;
    private int CP;
    private String Colonia;
//Metodos
public void CapturaDireccion(){
    LeeNumero();
    LeeCalle();
    LeeCP();
    LeeColonia();}

public void LeeNumero(){    
    Num=Teclado.LeeEntero("Numero: ");}

public void LeeCalle(){    
    Calle=Teclado.LeeCadena("Calle: ");}

public void LeeColonia(){    
    Colonia=Teclado.LeeCadena("Colonia: ");}

public void LeeCP(){    
    CP=Teclado.LeeEntero("CP: ");}

public void Listar(){    
    System.out.println(Calle+"\t"+Num+"\t"+Colonia+"\t"+CP);}

public void Actualizar(){
    int opcion;
    Menu menu= new Menu();
        do{
            opcion=menu.ListaMenu("1)Calle\n2)Numero\n3)Colonia\n4)CP\n5)Salir\nOpcion: ", 5);
            switch(opcion){
                case 1:
                    LeeCalle();
                break;
                
                case 2:
                    LeeNumero();
                break;
                
                case 3:
                    LeeColonia();
                break;
                
                case 4:
                    LeeCP();
                break;
            }
        }while(opcion!=5);
    }
}
