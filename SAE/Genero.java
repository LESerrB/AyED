class Genero {

//ATRIBUTOS
      private int clave=0;
      private String gen;
  
//CONSTRUCTORES

//METODOS

	public void Listar() {		
		System.out.println("Genero: "+gen);
	}

	public void ElegirGenero() {
		int opcion;
		Menu menu = new Menu();//creo el objeto menu
		//do {
			opcion = menu.ListaMenu("\nIngrese su genero: "+
            "\n1)Hombre\n2)Mujer\nOpcion: ",2);
		   switch (opcion) {
				case 1:
               clave = 1;
               gen = "H";
				break;

				case 2:
               clave = 0;
               gen = "M";
				break;
		} 

	}

	public int GetClave(){
		return clave;
	}
}