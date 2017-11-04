class CalculadoraPolaca {

    public static void main(String[] args) {
//VARIBLES Y PILAS
        String operacion;
        char c, d;
        int num=0, num2=0;
        Pila op;
        Pila nums;
        Pila sim;

        operacion = Teclado.LeeCadena("Ingresa la operacion a realizar: ");
//CONSTRUCTORES DE LAS PILAS
        sim = new Pila(operacion.length()); //DIMENSIONA LA PILA DE SIMBOLOS
        nums = new Pila(operacion.length());//DIMENSIONA LA PILA DE NUMEROS
        op = new Pila(operacion.length());  //DIMENSIONA LA PILA DE LA OPERACION A REALIZAR
//**********************************************************************************************
        for (int i=(operacion.length()-1); i>=0; i--) { //LLENA LA PILA CON LA OPERACION
            op.Push(operacion.charAt(i));               //INGRESADA
        }
        op.Listar(); //LISTA LA OPERACION COMO UNA PILA DE CARACTERES
//**********************************************************************************************
        do{
            c = op.Pop();   //EXTRAE EL ULTIMO CARACTER DE LA PILA OP
//*********************************************************************************************
            if(c == '*' || c == '/' || c == '+' || c =='-' || c =='^' || c == '(' || c==')'){
                if (c == '('){
                    sim.Push(c);
                }                    
                else {
                    if (c == ')') {
                        do {
                            d = sim.Pop();
                            if (d != '(')
                                nums.Push(d);
                            d = sim.Tope();
                        } while(d != '(');                        
                    }
                    else {
                        if (sim.Tope() == '(') {
                            sim.Push(c);                            
                        }
                        else {
                            if (Jerarquia(c, op.Tope()) != true || sim.ValidaVacio() == true) {
                                sim.Push(c);
                            }
                            else {
                                d = sim.Pop();
                                sim.Push(c);
                                nums.Push(d);
                            }
                        }
                    }
                }
            }
            else{
                nums.Push(c);
            }
//**********************************************************************************************
            System.out.println("=============================================================");
            System.out.println("\nsim"+(++num));
            sim.Listar();   //LISTA LA PILA DE SIMBOLOS EN CADA PASADA

            System.out.println("\nnums"+(++num2));
            nums.Listar();  //LISTA LA PILA DE NUMEROS EN CADA PASADA

        }while(op.ValidaVacio()!=true);
//**********************************************************************************************
//INGRESA LOS ULTIMOS OPERANDOS A LA PILA NUMS            
            do{
                if (sim.ValidaVacio()==false)
                    c = sim.Pop();
                    if (c != '(')
                        nums.Push(c);
            }while(sim.ValidaVacio()==false); 
//**********************************************************************************************
        System.out.println("\n\n\tNumeros");
        nums.Listar();
    }
//**********************************************************************************************
//COMPRUEBA LA JERARQUIA DEL ULTIMO OPERANDO POR INGRESAR Y EL ULTIMO INGRESADO EN LA PILA SIM
    public static boolean Jerarquia(char tope, char n){
        int jtope = 0;
        int jn = 0;
//**********************************************************************************************
//ASIGNACION DE VALORES DE JERARQUIA PARA OP
        if (n == '+' || n == '-')
            jn=1;
        if (n == '*' || n == '/')
            jn=2;
        if (n == '^')
            jn=3;
//**********************************************************************************************
//ASIGNACION DE VALORES DE JERARQUIA PARA TOPE DE SIMBOLOS
        if (tope == '+' || tope == '-')
            jtope=1;
        if (tope == '*' || tope == '/')
            jtope=2;
        if (tope == '^')
            jtope=3;
//**********************************************************************************************
//COMPARACION DE JERARQUIAS        
        if(jn <= jtope) 
            return true;
        else
            return false;
    }
}