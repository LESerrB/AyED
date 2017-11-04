class Generacion {

//ATRIBUTOS
      private int ingreso;
  
//CONSTRUCTORES

//METODOS
    	public void Listar() {		
		System.out.println("Generacion: "+ingreso);
	}

		public void LeeGeneracion(){
			ingreso = Teclado.LeeEntero("Año de ingreso: ");
	}

		public int GetIngreso(){
			return ingreso;
	}
}