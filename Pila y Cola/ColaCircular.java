class ColaCircular {

//ATRIBUTOS
	private int T;
	private int H;
	private int []colacir;

//CONSTRUCTOR
	public ColaCircular (int max){
		colacir = new int [max];
		H = T = -1;
	}

//METODOS
	public boolean ValidaEspacio () {
		return !((H==0 && T==colacir.length-1) || (T+1==H));
	}
//**************************************************************************
	public void Insertar (int dato) {

		if (T == -1)
			H++;
		else

			if (T == colacir.length-1)
				T = -1;
		
		T++;
		colacir[T] = dato;	
	}
//**************************************************************************
	public void Listar (){
		int i;

		if (H <= T)
			for(i = H; i <= T; i++)
				System.out.println (colacir[i]);
		else{
			for (i = H; i < colacir.length; i++)
				System.out.println (colacir[i]);
			for(i = 0; i <= T; i++)
				System.out.println (colacir[i]);
		}	
	}
//**************************************************************************
	public boolean ValidaVacio (){
		return (H == -1);
	}
//**************************************************************************
	public int Borrar (){
		int aux = colacir[H];

		if (H == T)
			H = T= -1;
		else

			if (H == colacir.length-1)
				H = 0;
			else
				H++;

		return aux;	
	}
}