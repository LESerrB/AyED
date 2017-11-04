class Carrera {

//ATRIBUTOS
      private int clave;
      private String carrera;
      private int inscritos;
  
//CONSTRUCTORES

//METODOS
    	public void Listar() {		
		System.out.println("\nCarrera: "+carrera);
	}

	public void ElegirCarrera() {
		int opcion;
		Menu menu = new Menu();//creo el objeto menu
		//do {
			opcion = menu.ListaMenu("\nElija la Carrera a la que pertenece:"+
            "\n1)Ingenieria en Computacion\n2)Ingenieria Civil\n3)Ingenieria Petrolera\nOpcion: ",3);
		   switch (opcion) {
				case 1:
               clave = 1000;
               carrera = "Ingenieria en Computacion";
				break;

				case 2:
               clave = 2000;
               carrera = "Ingenieria Civil";
				break;

				case 3:
               clave = 3000;
               carrera = "Ingenieria Petrolera";
				break;
		} 
	}

	public int GetClave(){
		return clave;
	}
}