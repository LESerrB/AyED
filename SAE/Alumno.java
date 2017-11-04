class Alumno {
	
//ATRIBUTOS
	private int clave;
	private int edad;
	private String nom;		
	private Calificaciones calif;
	private Carrera carr;
	private Genero genero;
	private Generacion gen;
	private Localidad localidad;
	
//CONSTRUCTORES
	public Alumno(){
		calif = new Calificaciones(); //se crea el objeto
		carr = new Carrera();
		genero = new Genero();
		gen = new Generacion();
		localidad = new Localidad();
	}
	
//METODOS
	public void CapturaAlumno(){
		System.out.println("Captura de Datos Personales:\n");
		LeeClave();
		LeeNom();
		LeeEdad();
		localidad.ElegirLocalidad();
		gen.LeeGeneracion();
		genero.ElegirGenero();
		carr.ElegirCarrera();
		calif.CapturaCalificaciones();
		
	}
	
	public void LeeClave(){
		clave = Teclado.LeeEntero("# de cuenta: ");
	}

	public void LeeEdad(){
		edad = Teclado.LeeEntero("Edad: ");
	}

	public void LeeNom(){
		nom = Teclado.LeeCadena("Nombre: ");
	}

	public void Listar(){
        System.out.print("============================================================"+
        				"\nCta: "+clave+"\t"+nom+"\tEdad: "+edad);
        localidad.Listar();
        genero.Listar();
        carr.Listar();
        gen.Listar();
        calif.Listar();
        System.out.print("============================================================");
    }
	
	public void Actualizar(){
		int opcion;
		Menu menu = new Menu();
		
		do{
			opcion = menu.ListaMenu("1)Nombre\n2)Genero\n3)Calificaciones\n4)Salir\nOpcion: ",4);
		   	switch (opcion) {
				case 1:
					LeeNom();
				break;

				case 2:
				 	//LeeGenero();
				break;

				case 3:
					calif.Actualizar();
				break;
			}
		} while (opcion !=4);
	}



	public int GetClave(){
		return clave;
	}

	public Genero GetGenero(){
		return genero;
	}

	public Calificaciones GetPromedio(){
		return calif;
	}

	public Carrera GetCarrera(){
		return carr;
	}	

	public int GetEdad(){
		return edad;
	}

	public Generacion GetGeneracion(){
		return gen;
	}

	public Localidad GetRegion(){
		return localidad;
	}

}