class Empleado {
	//ATRIBUTOS
	private int clave;
	private String nom;	
	private String genero;	
   	private Arreglo sueldo;
	private Arreglo tels;
	private Direccion dir;
	
	//CONSTRUCTORES
	public Empleado(int max_s, int max_t) {
	   sueldo= new Arreglo(max_s); //se crea al objeto
		tels = new Arreglo(max_t); //se crea el objeto
		dir = new Direccion(); //se crea el objeto 
	}
	
	//METODOS
	public void CapturaEmpleado() {
		System.out.println("Captura de Datos Personales:\n");
		LeeClave();
		LeeNom();
		LeeGenero();
		CapturaTels();
		CapturaSueldos();
		dir.CapturaDireccion();
	}
	
	public void LeeClave() {
		clave = Teclado.LeeEntero("ID: ");
	}
	public void LeeNom() {
		nom = Teclado.LeeCadena("Nombre: ");
	}
	public void LeeGenero() {
		genero = Teclado.LeeCadena("Genero: ");
	}
	public void CapturaTels() {
	  int dato;
	  if (tels.ValidaEspacio()){ 
			dato = Teclado.LeeEntero("Telefono: ");
			tels.Insertar(dato);
		}
		else
		   System.out.println("No existe espacio en el arreglo...");
	
	}
	public void CapturaSueldos() {
	  int dato;
	  if (sueldo.ValidaEspacio()){ 
			dato = Teclado.LeeEntero("Sueldo: ");
			sueldo.Insertar(dato);
		}
		else
		   System.out.println("No existe espacio en el arreglo...");
	
	}
	public void Listar() {
		System.out.print("\n"+clave+"\t"+nom+"\tGenero: "+genero);
		System.out.println("\nTelefonos: ");
		tels.Listar();
		System.out.println("Sueldos: ");
		sueldo.Listar();
		System.out.println("Direccion: ");
		dir.Listar();
	}
	public void Actualizar(){
		int opcion;
		Menu menu= new Menu();
		
		do {
			opcion = menu.ListaMenu("1)Nombre\n2)Genero\n3)Sueldos\n4)Telefonos\n5)Direccion\n6)Salir\nOpcion: ",6);
		   switch (opcion) {
				case 1:LeeNom();
						break;
				case 2:LeeGenero();
						break;
				case 3: ActualizaSueldos();
						break;
				case 4: ActualizaTels();
						break;
				case 5: dir.Actualizar();
						break;		
			}
		} while (opcion != 6);
	}

	public void ActualizaSueldos() {
		int opcion, dato, pos;
		Menu menu= new Menu();
		
		do {
			opcion = menu.ListaMenu("1)Insertar\n2)Modificar\n3)Borrar\n4)Salir\nOpcion: ",4);
		   switch (opcion) {
				case 1:CapturaSueldos();
						break;
				case 2: dato = Teclado.LeeEntero("Dame el sueldo del empleado para actualizar: ");
						  pos = sueldo.Buscar(dato);
						  if (pos !=-1)
						  		sueldo.Actualizar(pos);
						break;
				case 3: dato = Teclado.LeeEntero("Dame el sueldo a borrar: ");
						  pos = sueldo.Buscar(dato);
						  if (pos !=-1){
						  		dato = sueldo.Borrar(pos);
								System.out.println("El dato eliminado es: " + dato);
								}
						break;
			}
		} while (opcion != 4);

	}
	public void ActualizaTels() {
		int opcion, dato, pos;
		Menu menu= new Menu();
		
		do {
			opcion = menu.ListaMenu("1)Insertar\n2)Modificar\n3)Borrar\n4)Salir\nOpcion: ",4);
		   switch (opcion) {
				case 1:CapturaTels();
						break;
				case 2: dato = Teclado.LeeEntero("Dame el telefono del empleado para actualizar: ");
						  pos = tels.Buscar(dato);
						  if (pos !=-1)
						  		tels.Actualizar(pos);
						break;
				case 3: dato = Teclado.LeeEntero("Dame el telefono a borrar: ");
						  pos = tels.Buscar(dato);
						  if (pos !=-1){
						  		dato = tels.Borrar(pos);
								System.out.println("El dato eliminado es: " + dato);
								}
						break;
			}
		} while (opcion != 4);
	}

	public int GetClave(){
		return clave;
	}
}
