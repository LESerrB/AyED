import java.util.Vector;
class EjemploVector_c {
    //2.e crear el método Listar()
    public static void Listar(Vector v){
        int i;
        for (i=0;i <v.size(); i++)
            System.out.println(v.elementAt(i)); //extrae el elemento de la i-esima posición
      
    }

       public static int SumarElementos(Vector v3){
    int suma=0;
    for (int i=0; i<=(v3.size()-1);i++)
        suma=(suma + (Integer)v3.elementAt(i));
    return suma;
   }

  public static void main(String[] args) {
              //dimensión inicial = 20, si se llena el arreglo se duplica el tamaño automáticamente, crecimiento de 20 en 20
        Vector v1 = new Vector(20); 
        //dimensión inicial por DEFAULT= 10, si se llena el arreglo se duplica el tamaño automáticamente, crecimiento de 10 en 10      
        Vector v2 = new Vector(); 
        //dimensión inicial = 5, incrementos automático de tamaño de 3 en 3
        Vector<Integer> v3 = new Vector<Integer>(5,3);     

        System.out.println("\nnº de elementos capturados: "+v1.size());
        System.out.println("dimensión (tamaño) "+v1.capacity());

        System.out.println("\nnº de elementos capturados: "+v2.size());
        System.out.println("dimensión (tamaño) "+v2.capacity());

        System.out.println("\nnº de elementos capturados: "+v3.size());
        System.out.println("dimensión (tamaño) "+v3.capacity());


        int i;
        for (i=0; i<5 ; i++)
            v3.addElement(i);                
        System.out.println("\n============================================");
        System.out.println("VECTOR3:\nnº de elementos capturados: "+v3.size());
        System.out.println("Tamaño del vector3:  "+v3.capacity());

        v3.addElement(i);
        System.out.println("\n=== SE AUTODIMENSIONA DE 3 EN 3 ============");
        System.out.println("VECTOR3:\nnº de elementos capturados: "+v3.size());
        System.out.println("Tamaño del vector3:  "+v3.capacity());      //2.c insertar 5 elementos al final del vector v3
           
      System.out.println("\n============================================");
      for (i=0; i<5 ; i++)
        v3.addElement(i);
      
      System.out.println("VECTOR3:\nnº de elementos capturados: "+v3.size());
  Listar(v3);         
      System.out.println("Tamaño del vector3:  "+v3.capacity());
     
      //2.d insertar elemento al final del vector
      
      v3.addElement(i);
      System.out.println("\n=== SE AUTODIMENSIONA DE 3 EN 3 ============");
      System.out.println("VECTOR3:\nnº de elementos capturados: "+v3.size());
      Listar(v3);
      System.out.println("Tamaño del vector3:  "+v3.capacity());

      System.out.println("\n=== Insertar 10 en la posicion 2 ===");
      v3.insertElementAt(10,2);
      Listar(v3);
      System.out.println("\n=== Insertar -1 en la posicion 0 ===");
      v3.insertElementAt(-1,0);
      Listar(v3);

      System.out.println("\n=== cambia el valor en la posición 2, por el número 4 ===");
      v3.setElementAt(4,2);
      Listar(v3);

      System.out.println("\n=== elimina el elemento de la posición 5 ===");
      v3.removeElementAt(5);
      Listar(v3);      

      System.out.println("\n=== El dato de la posición 0 ===");
      System.out.println(v3.elementAt(0));

      System.out.println("\n=== Borrar el número de la posición 3  ===");
      v3.removeElementAt(3);
      Listar(v3);      

      System.out.println("La suma es: "+SumarElementos(v3));
   }
}
