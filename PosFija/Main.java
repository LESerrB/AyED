class Main{


	public static void main(String[] args) {
		String operacion="";
        char a; 
        Pila simbolos;
        Pila posfija;
        Pila op;

        //SE PIDE LA OPERACION A REALIZAR *****************************************************
        operacion = Teclado.LeeCadena("Ingresa la operacion a realizar: ");		

        // SE CONTRUYEN LAS PILAS *************************************************************
        simbolos = new Pila(operacion.length()); 	//<----- pila para meter los simbolos
        posfija = new Pila(operacion.length());		//<----- pila para meter la operacion postfija 
        op = new Pila(operacion.length());			//<----- pila donde se mete la operacion

        // LLENAMOS LA PILA CON LA EXPRESION CAPTURADA ****************************************
        for (int i=(operacion.length()-1); i>=0; i--) {
            op.Push(operacion.charAt(i));               
        }

        // LISTAMOS LA PILA *******************************************************************
        System.out.println("\nPila con la operacion a realizar: ");
        op.Listar();

        // COMENZAMOS A CLASIFICAR LOS CARACTERES Y NO PARARA HASTA QUE LA PILA op ESTE VACIA *
        while(op.ValidaVacio()!=true){

	        //OBTENEMOS EL PRIMER DATO DE LA PILA
	        a = op.Pop();

	        //SI NO ES NINGUN SIGNO ENTONCES ES UN NUMERO Y SE METE A LA PILA *****************
	        if (a!='*' && a!='/' && a!='+' && a!='-' && a!='^' && a!='(' && a!=')')
	        	posfija.Push(a);

	        //SI ES UN PARENTESIS QUE ABRE LO METE A LA PILA SIN PREGUNTAR ********************
	        if (a=='(')
	        	simbolos.Push(a);

	        //SI ES UN EXPONENCIAL COMO ES LA MAYOR JERARQUIA LO METE SIN PREGUNTAR ***********
	        if (a=='^')
	        	simbolos.Push(a);

	        //SI ES UNA SUMA O RESTA LLAMA AL METODO SUMARESTA Y HACE LO CORRESPONDIENTE ******
	        if (a=='+' || a=='-'){
	        	Jerarquias operar = new Jerarquias(simbolos,posfija);
	        	operar.SumaResta(a);
	        }

	        //SI ES UNA DIVISION O MULTIPLICACION LLAMA AL METODO Y HACER LO CORRESPONDIENTE **
	        if (a=='*' || a=='/'){
	        	Jerarquias operar = new Jerarquias(simbolos,posfija);
	        	operar.DivMulti(a);	
	        }

	        //SI ES UN PARENTESIS QUE CIERRA LLAMA AL METODO PARA HACER LO QUE CORRESPONDE ****
	        if (a==')'){
	        	Jerarquias operar = new Jerarquias(simbolos,posfija);
	        	operar.Cierre();
	        }
	    }

	    // COMO YA TERMINO DE CLASIFICAR LOS SIGNOS HASTA QUE LA PILA op QUEDO VACIA, SOLO FALTA
	    // METER LOS SIMBOLOS QUE SE QUEDARON EN LA PILA simbolos EN LA PILA postfija **********
	    while(simbolos.ValidaVacio()!=true){
	    	posfija.Push(simbolos.Pop());
	    }

	    // LISTAMOS LA PILA postfija PARA VER LA OPERACION EN NOTACION POSFIJA *****************
	    System.out.println("\nPila con la operacion en notacion posfija: ");
	    posfija.Listar();
	}
		
}