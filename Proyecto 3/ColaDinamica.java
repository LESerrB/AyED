class ColaDinamica{

//ATRIBUTOS
	private Nodo H;
	private Nodo T;

	public void Insertar(Trabajo dato) {
		Nodo Q = new Nodo(dato, null);

		if (T == null)
			H = Q;
		else
			T.SetSig(Q);

		T = Q;
	}

	public Nodo Borrar() {
		Nodo aux = H;

		if (H == null)
			System.out.println("Error: Cola Vacia");
		else if (H == T)
				 H = T = null;
			else
				H = H.GetSig();

		return aux;
	}

	public void Listar() {
		Nodo i = H;

		do{
			i.GetInfo().Listar();
			i = i.GetSig();
		} while (i != null);

	}

	public Trabajo GetH() {
		return H.GetInfo();
	}
}