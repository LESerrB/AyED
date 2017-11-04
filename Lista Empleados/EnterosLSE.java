class EnterosLSE {

//ATRIBUTOS
	private boolean existe;
	private Nodo H;
	private Nodo T;

//METODOS
	public void InsertaFinal (Empleados dato) {
		Nodo q = new Nodo (dato, null);
		
		if (T == null)
			H = T = null;
		else{
			T.SetSig (q);
			T = q;
		}
	}
//********************************************************************************************
	public void InsertaPrinc (Empleados dato) {
		Nodo q = new Nodo (dato, H);

		if (H == null)
			T = q;

		H = q;
	}
//********************************************************************************************
	public void Listar() {
		Nodo i = H;

		do{
			i.GetInfo().Listar();
			i = i.GetSig();
		} while (i != null);

	}
//********************************************************************************************
	public void Listar (Nodo pos){
		pos.GetInfo().Listar();
	}
//********************************************************************************************
	public Nodo Buscar (int clave) {
		Nodo q;

		for (q = H; q != null; q = q.GetSig()) {
			
			if (clave == q.GetInfo().GetClave())
				return q;
		}

		System.out.println ("No existe el dato");
		return null;
	}
//********************************************************************************************
	public Nodo Borrar (int clave) {
		Nodo aux, anterior = BuscaNodoAnt (clave);
		
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
//********************************************************************************************
	public Nodo BuscaNodoAnt (int clave) {
		Nodo q, ant = null;
		existe = false;

		for (q = H; q != null; q = q.GetSig()) {

			if (existe = clave == q.GetInfo().GetClave())
				return ant;

			ant = q;
		}

		System.out.println ("No existe el dato");
		return null;
	}
//********************************************************************************************
	public void InsertaDesp (Nodo q, Empleados dato) {
		Nodo aux;

		if (q == T)
			InsertaFinal(dato);
		else {
			aux = new Nodo (dato, q.GetSig());
			q.SetSig(aux);
		}

	}
//********************************************************************************************
	public void InsertaAnt (Nodo q, Empleados dato) {
		Nodo aux;

		if (q == null)
			InsertaPrinc(dato);
		else {
			aux = new Nodo (dato, q.GetSig());
			q.SetSig(aux);
		}

	}
//********************************************************************************************
	public void Actualizar (Nodo pos) {
		pos.GetInfo().Actualizar();
	}
//********************************************************************************************
	public void SortIntercambio() {
		Nodo i, j, im = null;
  
        for (i = H; i != T; i.GetSig())

            for (j = H.GetSig(); j != null; j.GetSig())

            	if (im.GetInfo().GetClave() > j.GetInfo().GetClave())
            		auxcambiaDatos(i, j, im);
    }
//********************************************************************************************
	private void auxcambiaDatos (Nodo i, Nodo j, Nodo im) {
        Empleados aux;
        aux = i.GetInfo();
        i.SetInfo(j.GetInfo());
        j.SetInfo(aux);
    }
}