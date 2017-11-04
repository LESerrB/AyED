class Localidad{

//ATRIBUTOS
      private int zipcode=0;
      private String org;
  
//CONSTRUCTORES

//METODOS

	public void Listar() {		
		System.out.println("\nLocalidad: "+org);
	}

	public void ElegirLocalidad() {
		int opcion;
		Menu menu = new Menu();//creo el objeto menu
		
			opcion = menu.ListaMenu("\nIngrese su procedencia: "+
            "\n1)D.F.\n2)Foraneo\nOpcion: ",2);
		   switch (opcion) {
				case 1:
               zipcode = 1;
               org = "DF";
				break;

				case 2:
               zipcode = 0;
               org = "Foraneo";
				break;
		} 

	}

	public int GetZipcode(){
		return zipcode;
	}
}
