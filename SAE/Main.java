class Main{
	
	public static void main(String []args){
		int dato, pos, max, max_s, max_t, opcion;
		ArregloAlumno miarreglo;//aqui se declara la variable de tipo arreglo
		Menu menu = new Menu();
		Alumno obj, obj2;
		Estadisticas e;
		
		
		max = Teclado.LeeEntero("Dame el tamano del arreglo: ");
		miarreglo= new ArregloAlumno(max); //aqui se crea el objeto Arreglo
		e = new Estadisticas(miarreglo);


		do {
			opcion = menu.ListaMenu("\n1)Agregar Alumno\n2)Listar Base\n3)Actualizar\n4)Buscar\n5)Borrar\n6)Ordenar\n7)Estadisticas\n8)Salir\nOpcion: ",8);			switch (opcion) {
				case 1: if (miarreglo.ValidaEspacio()){
								obj = new Alumno();
								obj.CapturaAlumno();
								miarreglo.Insertar(obj);
							}
							else
								System.out.println("No existe espacio en el arreglo...");
						break;
				case 2: miarreglo.Listar();			
						break;
						
			    case 3: dato = Teclado.LeeEntero("Dame la clave del empleado actualizar: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1)
						  		miarreglo.Actualizar(pos);
						  break;	
			    case 4: dato = Teclado.LeeEntero("Dame la clave del empleado: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1)
						  		miarreglo.Listar(pos);
						  break;
				case 5: dato = Teclado.LeeEntero("Dame la clave del empleado borrar: ");
						  pos = miarreglo.Buscar(dato);
						  if (pos !=-1){
						  		obj2 = miarreglo.Borrar(pos);
								System.out.println("Borrado...");
								}
						  break;
			    case 6: miarreglo.Ordenar();
						  break;
				case 7: e.CalcularEstadisticas();
						break;

			}
		}while (opcion != 8);


	}
}