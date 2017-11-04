class PilaLSE {

//ATRIBUTOS
	private Nodo tope;
	
//METODOS
	public void Push (int dato) {
		Nodo q = new Nodo (dato, tope);
		tope = q;
	}
//********************************************************************************************
	public Nodo Pop() {
		Nodo aux = tope;
		if (tope != null)
			tope = tope.GetSig();
		return aux;
	}
//********************************************************************************************
	public void Listar() {
		for (Nodo i = tope; i != null; i.GetSig())
			System.out.println(i.GetInfo());
	}
}