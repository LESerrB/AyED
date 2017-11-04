//package factorial;

public class Factorial {

    public static void main(String[] args) {
        int num;
        num = Teclado.LeeEntero("Ingresa el numero del que se desea conocer el factorial: ");
        MultFact(num);
        System.out.println("El factorial es: " +MultFact(num));
        
    }
    
    public static int MultFact(int num){
        if (num==0)
            return 1;
        return num*MultFact(num-1);
            
    }
    
}
