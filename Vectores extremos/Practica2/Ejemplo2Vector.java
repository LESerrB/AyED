
import java.util.Vector;
class Ejemplo2Vector {
public static void Listar(Vector v){
        int i;
        for (i=0;i <v.size(); i++) //v.size es el tamaño del vector
            System.out.println("["+i+"]="+v.elementAt(i)); //extrae el elemento de la i-esima posiciÃ³n
            System.out.println("-----");
    }

    public static void main(String[] args) {
        Vector <Integer> v1 = new Vector <Integer>(5,2); //dimension inicial = 5, incrementos de 2, lee al objeto como entero
         int i;
        for (i=1 ; i<=5; i++)
            v1.addElement((i)); //Agrega elementos a al final del vector        
        System.out.println("nÂº de elementos capturados: "+v1.size()); //Devuelve el numero de elementos en el vector
        System.out.println("dimensiÃ³n (tamaÃ±o) "+v1.capacity()); //Devuelve el tamaño actual del vector
        Listar(v1);
        v1.removeElementAt(2); //Borra elemento en la posicion 2
        Listar(v1);
        v1.removeElement(1); //Borra el  primer elemento que coincida con 1, si no existe devuelve un falso
        Listar(v1);
        v1.add(1,10); //Inserta el numero 10 en la posicion 1
        v1.add(3,10); //Inserta el numero 10 en la posicion 3
        v1.add(5,10); //Inserta el numero 10 en la posicion 5
        Listar(v1);
        Vector  v2 = (Vector) v1.clone(); //se copia el vector v1 en v2
        System.out.println("vector 2:");
        Listar(v2);

        System.out.println("el numero 10 esta en la posicion: "+ v1.indexOf(10)); //regresa un -1 si no lo encuentra
        v1.setElementAt(15, 1); //cambia el elemento en la posicion 1 por un 15
        Listar(v1);
        System.out.println("Estoy cambiando el numero: "+ v1.set(3, 20) + "por el numero 20"); //se cambia el elemento en la pos 3 por un numero 20
        Listar(v1);
        
        if (v1.contains(20)) //Devuelve verdadero si existe el numero 20 en el vector v1 
            System.out.println("Si existe el 20 en la posición " + v1.indexOf(20)); //Devuelve la posicion del numero 20 en el Vector
            }
}
