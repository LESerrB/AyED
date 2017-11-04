class Pila {
//ATRIBUTOS
	private char []pila;
	private int tope;

//CONSTRUCTORES
	public Pila (int max){
		pila = new char [max];
		tope = -1;
	}

//METODOS
	public boolean ValidaEspacio (){
		if (tope < pila.length-1)
			return true;
		else
			return false;
	}

	public void Push (char dato){
	
	tope++;
	pila[tope] = dato;
	
	}

	public boolean ValidaVacio (){
		if (tope<0)
			return true;
		else
			return false;
	}

	public char Pop (){
		return pila[tope--];
	}

	public void Listar (){
		for (int i=tope ; i>=0 ; i--)
			System.out.println("["+i+"] "+pila[i]);
	}
        
        public char Tope (){
            return pila[tope];
        }

}