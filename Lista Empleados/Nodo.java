class Nodo {

//ATRIBUTOS
	private Empleados info;
	private Nodo sig;//APUNTA AL NODO SIGUIENTE

//CONSTRUCTORES
	public Nodo (Empleados dato, Nodo sig) {
		info = dato;
		this.sig = sig;
	}

//METODOS
	public void SetInfo (Empleados dato) {
		info = dato;
	}
//**************************************************************************
	public void SetSig (Nodo sig ) {
		this.sig = sig;
	}
//**************************************************************************
	public Empleados GetInfo() {
		return info;
	}
//**************************************************************************
	public Nodo GetSig() {
		return sig;
	}
}