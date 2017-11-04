class Pila{
	//ATRIBUTOS
	private char []pila;
	private int tope;

	//CONSTRUCTORES
	public Pila (int max){
		pila = new char [max];
		tope = -1;
	}

	//METODOS
	public boolean ValidaEspacio(){
		if (tope < pila.length-1)
			return true;
		else
			return false;
	}

	public void Push(char dato){
		tope++;
		pila[tope]=dato;
	}

	public boolean ValidaVacio(){
		if (tope<0)
			return true;
		else
			return false;
	}

	public char Pop(){
		tope--;
		return pila[tope+1];
	}

	public void Listar(){
		int i;
		for (i=tope ; i>=0 ; i--)
			System.out.println("["+i+"] "+pila[i]);
	}

	public char ValorTope(){
		//System.out.println(pila.length);
		return pila[tope];
	}

	public void VaciarPila(){
		if (ValidaVacio()==false)
			tope=-1;
	}

//Los Gets *************************************************

	public int GetTope(){
		return tope;
	}

	public int GetPila(int pos){
		return pila[pos];
	}

}	