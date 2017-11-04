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

	public void Push(char []dato){
		tope=dato.length-1;
		pila=dato;
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
		for (int i=tope ; i>=0 ; i--)
			System.out.println("["+i+"] "+pila[i]);
	}

	public boolean VerPal(){
		for (int i=0; i<=tope; i++)
			if (pila[i]!=Pop())
				return false;
		return true;
	}
}
