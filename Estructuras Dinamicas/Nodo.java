class Nodo {

//ATRIBUTOS
	private int info;
	private Nodo sig;//Apunta al siguiente nodo

//CONSTRUCTORES
	public Nodo (int dato, Nodo sig){
		info = dato;
		this.sig = sig;
	}

//METODOS
	public void SetInfo (int dato){
		info = dato;
	}
//**************************************************************************
	public void SetSig (Nodo sig){
		this.sig = sig;
	}
//**************************************************************************
	public int GetInfo (){
		return info;
	}
//**************************************************************************
	public Nodo GetSig (){
		return sig;
	}
}