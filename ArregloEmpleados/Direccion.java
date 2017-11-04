class Direccion {
   //ATRIBUTOS
      private int numero;
      private String calle;
      private String colonia;
      private int cp;	
   
   //CONSTRUCTORES

   //METODOS
       public void CapturaDireccion() {
         LeeNumero();
         LeeCalle();
         LeeColonia();
         LeeCP();
      }	

      public void LeeNumero() {
         numero = Teclado.LeeEntero("Numero: ");
      }
      public void LeeCalle() {
         calle = Teclado.LeeCadena("Calle: ");
      }
      public void LeeColonia() {
         colonia = Teclado.LeeCadena("Colonia: ");
      }
      public void LeeCP() {
         cp = Teclado.LeeEntero("CP: ");
      }
	public void Listar() {		
		System.out.println(calle+"\t"+numero+"\t"+colonia+"\t"+cp);
	}
	public void Actualizar() {
		int opcion;
		Menu menu= new Menu();//creo el objeto menu
		do {
			opcion = menu.ListaMenu("1)Calle\n2)Numero\n3)Colonia\n4)Cp\n5)Salir\nOpcion: ",5);
		   switch (opcion) {
				case 1:LeeCalle();
						break;
				case 2:LeeNumero();
						break;
				case 3:LeeColonia();
						break;
				case 4: LeeCP();
						break;
			}
		} while (opcion != 5);
	}
}