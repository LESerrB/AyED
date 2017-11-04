class NodoD {

//ATRIBUTOS
	private int info;
	private NodoD sig;
	private NodoD ant;

//CONSTRUCTOR
	public NodoD(int dato, NodoD sig, NodoD ant){
		info=dato;
		this.sig=sig;
		this.ant=ant;
	}

//METODOS
	public void SetInfo (int dato) {
		info = dato;
	}
//********************************************************************************************
	public int GetInfo() {
		return info;
	}
//********************************************************************************************
	public void SetSig (NodoD sig) {
		this.sig = sig;
	}
//********************************************************************************************
	public NodoD GetSig() {
		return sig;
	}
//********************************************************************************************
	public void SetAnt (NodoD ant) {
		this.ant = ant;
	}
//********************************************************************************************
	public NodoD GetAnt() {
		return ant;
	}
}