class ColaCircular {

//ATRIBUTOS
	private int T;
	private int H;
	private Trabajo []colacir;

//CONSTRUCTOR
	public ColaCircular(int max) {
		colacir = new Trabajo [max];
		H = T = -1;
	}

//METODOS
	public boolean ValidaEspacio() {
		return !((H == 0 && T == colacir.length-1) || (T+1 == H));
	}
//********************************************************************************************
	public void Insertar(Trabajo dato) {

		if (T == -1)
			H++;
		else

			if (T == colacir.length-1)
				T = -1;
		
		T++;
		colacir[T] = dato;	
	}
//********************************************************************************************
	public void Listar() {
		int i;

		if (H <= T)
			for(i = H; i <= T; i++)
				System.out.println ("Id: "+colacir[i].GetID()+"\tNombre: "+colacir[i].GetNombre()+"\t||\t#Hojas: "+colacir[i].GetHojas());
		else{
			for (i = H; i < colacir.length; i++)
				System.out.println ("Id: "+colacir[i].GetID()+"\tNombre: "+colacir[i].GetNombre()+"\t||\t#Hojas: "+colacir[i].GetHojas());
			for(i = 0; i <= T; i++)
				System.out.println ("Id: "+colacir[i].GetID()+"\tNombre: "+colacir[i].GetNombre()+"\t||\t#Hojas: "+colacir[i].GetHojas());
		}	
	}
//********************************************************************************************
	public boolean ValidaVacio() {
		return (H == -1);
	}
//********************************************************************************************
	public Trabajo Borrar() {
		Trabajo aux = colacir[H];

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