class Cola {

//ATRIBUTOS
	private int []cola;
	private int H;
	private int T;

//CONSTRUCTOR
	public Cola (int max){
		cola = new int[max];
		H = T = -1;
	}

//METODOS
	public boolean ValidaEspacio () {
		return (T < cola.length-1);
	}
//**************************************************************************
	public void Insertar (int dato) {

		if (T == -1)
			H++;

		T++;
		cola[T] = dato;
	}
//**************************************************************************
	public int Borrar () {
		int aux = cola[H];

		if(H == T)
			H = T = -1;
		else
			H++;
		
		return aux;
	}
//**************************************************************************
	public boolean ValidaVacio () {
		return (H == -1);
	}
//**************************************************************************
	public void Listar () {
		for(int i=H; i<=T; i++)
			System.out.println ("["+i+"]"+cola[i]);
	}
//**************************************************************************
	public void Listar (int H) {
		if (H <= T){
			System.out.println (cola[H]);
			Listar(H+1);
		}
	}
//**************************************************************************
}