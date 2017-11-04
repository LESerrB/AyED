class PruebaArreglo{

	public static int ListaMenu() {
		int opcion;
		do{	
			opcion = Teclado.LeeEntero("1)Insertar\n2)Listar\n3)Actualizar\n4)Buscar\n5)Borrar\n6)Ordenar\n7)Salir\nOpcion:");
			if (opcion >7 || opcion<1)
				System.out.println("Error: opcion no valida...."); 
		}while(opcion >7 || opcion<1);
		
		return opcion;
	}
	
	
	public static void main(String []args){
		//variables locales
		int dato, pos, max, opcion;
		Arreglo miarreglo;//aqui se declara la variable de tipo arreglo

		max = Teclado.LeeEntero("Dame el tamaño del arreglo: ");
		miarreglo= new Arreglo(max); //aqui se crea el objeto Arreglo

		do {
			opcion = ListaMenu();
			switch (opcion) {
				case 1: if (miarreglo.ValidaEspacio()){ 
								dato = Teclado.LeeEntero("Dame numero: ");
								miarreglo.Insertar(dato);
							}
							else
								System.out.println("No existe espacio en el arreglo...");
						break;
				case 2: miarreglo.Listar();			
						break;
						
			   case 3: dato = Teclado.LeeEntero("Dame el dato para actualizar: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1)
						  		miarreglo.Actualizar(pos);
						  break;	
			   case 4: dato = Teclado.LeeEntero("Dame el dato a buscar: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1)
						  		miarreglo.Listar(pos);
						  break;
				case 5: dato = Teclado.LeeEntero("Dame el dato a borrar: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1){
						  		dato = miarreglo.Borrar(pos);
								System.out.println("El datos eliminado es: " + dato);
								}
						  break;
			   case 6:
						  break;

			}
		}while (opcion != 7);


	}
}