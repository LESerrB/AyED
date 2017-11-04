class Trabajo {

//ATRIBUTOS
	private int id;
	private int hojas;
	private String nom;	
	
//METODOS
	public void CapturaTrabajo() {
		System.out.println("\nDatos del documento:");
		LeeID();
		LeeNom();
		LeeHojas();
	}
//********************************************************************************************
	public void LeeID() {
		id = Teclado.LeeEntero("\tID: ");
	}
//********************************************************************************************
	public void LeeNom() {
		nom = Teclado.LeeCadena("\tNombre: ");
	}
//********************************************************************************************
	public void LeeHojas() {
		hojas = Teclado.LeeEntero("\t#Hojas: ");
	}
//********************************************************************************************
	public void Listar() {
		System.out.print("\nID: T"+id+"\t||\tNombre: "+nom+"\t||\t#Hojas: "+hojas);
	}
//********************************************************************************************
	public int RestaHoja() {
		hojas = --hojas;
		return hojas;
	}
//********************************************************************************************
	public int GetHojas() {
		return hojas;
	}
//********************************************************************************************
	public String GetID() {
		return ("T"+id+"\t||");
	}
//********************************************************************************************
	public String GetNombre() {
		return nom;
	}
}