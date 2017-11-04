class Nodo {

	//ATRIBUTOS
	private Trabajo info;
	private Nodo sig;//Apunta al siguiente nodo

	//CONSTRUCTORES
	public Nodo(Trabajo dato, Nodo sig) {
		info = dato;
		this.sig = sig;
	}

	//METODOS
	public void SetInfo(Trabajo dato) {
		info = dato;
	}

	public void SetSig(Nodo sig) {
		this.sig = sig;
	}

	public Trabajo GetInfo() {
		return info;
	}

	public Nodo GetSig() {
		return sig;
	}
}
