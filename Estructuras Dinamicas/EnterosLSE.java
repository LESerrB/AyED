class EnterosLSE{

//ATRIBUTOS
	private boolean existe;
	private Nodo H;
	private Nodo T;

//METODOS
	public void InsertaFinal (int dato) {
		Nodo q = new Nodo (dato, null);
		
		if (T == null)
			H = T = null;
		else{
			T.SetSig (q);
			T = q;
		}
	}
//**************************************************************************
	public void InsertaPrinc (int dato) {
		Nodo q = new Nodo (dato, H);

		if (H == null)
			T = q;

		H = q;
	}
//**************************************************************************
	public void Listar () {
		Nodo i = H;

		do{
			System.out.println(i.GetInfo());
			i = i.GetSig();
		} while (i != null);

	}
//**************************************************************************
	public Nodo Buscar (int dato) {
		Nodo q;

		for (q = H; q != null; q = q.GetSig()) {
			
			if (dato == q.GetInfo())
				return q;
		}

		System.out.println ("No existe el dato");
		return null;
	}
//**************************************************************************
	public Nodo Borrar (int dato) {
		Nodo aux, anterior = BuscaNodoAnt (dato);
		
		if (!existe)
			return null;
		else
			if (anterior == null) {
				aux = H;

				if (H == T)
					H = T = null;
				else
					H = H.GetSig();

			}
			else {
				aux = anterior.GetSig();
				anterior.SetSig(aux.GetSig());

				if (aux == T)
					T = anterior;
			}
			return aux;
	}
//**************************************************************************
	public Nodo BuscaNodoAnt (int dato) {
		Nodo q, ant = null;
		existe = false;

		for (q = H; q != null; q = q.GetSig()) {

			if (existe = dato == q.GetInfo())
				return ant;

			ant = q;
		}

		System.out.println ("No existe el dato");
		return null;
	}
}