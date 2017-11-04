  import java.util.Vector;
  class Main {

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
        System.out.println("Tamaño del vector3:  "+v3.capacity());

   }
}
