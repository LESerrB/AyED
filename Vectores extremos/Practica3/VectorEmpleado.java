import java.util.Vector;

class VectorEmpleado {

   public static void Listar(Vector v){
      int i;
      EmpleadoCorto aux;
      for (i=0;i <v.size(); i++){
         //extrae el elemento de la i-esima posición
         aux= (EmpleadoCorto)v.elementAt(i);
         aux.Listar();
      }
   }
   public static void main(String[] args) {
      int opcion;
      int clave;
      Vector <EmpleadoCorto>v1 = new Vector(5,2); //dimension inicial = 5, incrementos de 2
      int i;
      EmpleadoCorto aux;
      for (i=1 ; i<=2; i++) {      
         aux = new EmpleadoCorto();
         aux.Capturar();
         v1.addElement(aux);  
      }
      System.out.println("-------------\nelementos capturados: "+v1.size());
      System.out.println("dimension (tamaño) "+v1.capacity());
      System.out.println("-------------\n");
      Listar(v1);

            do {
               EmpleadoCorto empleado = new EmpleadoCorto();
               Menu menu = new Menu();
               int pos;
         opcion = menu.DespliegaMenu("\n1)Insertar\n2)Extraer\n3)Actualizar\n4)Buscar\n5)Borrar\n6)Listar\n7)Salir\nOpcion: ",7);
         switch (opcion) {
            
            case 1:
                  empleado.Capturar();
                  v1.addElement(empleado); 

                  break;
            case 2:
                  clave = Teclado.entero("\nDame la clave a del empleado a mostrar: ");
                  Extraer(v1,clave);
                  break;
                  
            case 3:
                  clave = Teclado.entero("\nDame la clave a Actualizar: ");
                  Actualizar(v1,clave);
                  break;   

            case 4:
                  clave = Teclado.entero("\nDame la clave a Buscar: ");
                     if (Buscar(v1,clave)<0)
                        System.out.println("No se encontro la clave...");
                     else
                        System.out.println("Se encontro en la posición: "+ Buscar(v1,clave));
                  break;
            
            case 5:
                  clave = Teclado.entero("\nDame la clave del empleado a Borrar: ");
                  Borrar(v1,clave);
                  break;

            case 6: Listar(v1);
                  break;

         }
      }while (opcion != 7);

   }

   public static void Actualizar(Vector v,int clave){
      EmpleadoCorto aux;
      for (int i=0;i <v.size(); i++){
         aux= (EmpleadoCorto)v.elementAt(i);
         if (aux.GetClave()==clave){
            aux.Capturar();
            v.setElementAt(aux,i);}
      }
   }

   public static int Buscar(Vector v,int clave){
      int pos=-1;
      EmpleadoCorto aux;
      for (int i=0;i <v.size(); i++){
         aux= (EmpleadoCorto)v.elementAt(i);
         if (aux.GetClave()==clave)
            pos = i;
      }
      return pos;
   }

   public static void Extraer(Vector v,int clave){
      EmpleadoCorto aux;
      for (int i=0;i <v.size(); i++){
         aux= (EmpleadoCorto)v.elementAt(i);
         if (aux.GetClave()==clave)
            aux.Listar();
      }
   }

   public static void Borrar(Vector v,int clave){
      EmpleadoCorto aux;
      for (int i=0;i <v.size(); i++){
         aux= (EmpleadoCorto)v.elementAt(i);
         if (aux.GetClave()==clave)
            v.removeElementAt(i);
      }
   }   
}