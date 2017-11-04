class Main {
	
	public static void main (String[] args) {

		EnterosLSE lista = new EnterosLSE();
		Empleados e;
		int dato, opc, opc2, max_s = 0, max_t = 0, clave;
		Nodo pos;

		Menu menu = new Menu ();

		do {
			opc = menu.ListaMenu("\n1)ID del Proceso\n2)Nombre del Proceso\n3)Tamaño del Proceso\n4)Tiempo que requiere para su ejecucion\n5)Prioridad\n6)Tiempo que requiere  para operaciones de E/S\n7)Tiempo de llegada del proceso\nOpcion: ",7);
			switch(opc){

				case 1://AGREGAR EMPLEADOS
					max_s = Teclado.LeeEntero("\nNumero de sueldos del empleado: ");
					max_t = Teclado.LeeEntero("Numero de telefonos del empleado: ");
					e = new Empleados (max_s, max_t);
					e.CapturaEmpleado();

						opc2 = menu.ListaMenu("\nDonde desea insertar al empleado:\n1)Inserta al Principio\n2)Inserta al Final\n3)Inserta Antes\n4)Inserta Despues\nOpcion: ",4);
						
						switch (opc2) {
							
							case 1://AGREGA AL PRINCIPIO
								lista.InsertaPrinc(e);
								System.out.println("\n>>>>>>>>>>Empleado agregado<<<<<<<<<<");
							break;

							case 2://AGREGA AL FINAL
								lista.InsertaFinal(e);
								System.out.println("\n>>>>>>>>>>Empleado agregado<<<<<<<<<<");
							break; 

							case 3://AGREGA UN EMPLEADO ANTES
                                clave = Teclado.LeeEntero("Inserta la clave del empleado posterior: ");
                                pos = lista.BuscaNodoAnt(clave);
                                
                                if (pos != null){
                                	lista.InsertaDesp(pos, e);
                                	System.out.println("\n>>>>>>>>>>Empleado agregado<<<<<<<<<<");
                                }

							break;

							case 4://AGREGAR UN EMPLEADO DESPUES
								clave = Teclado.LeeEntero("Inserta la clave del empleado anterior: ");
                                pos = lista.Buscar(clave);
                                
                                if (pos != null){
                                	lista.InsertaAnt(pos, e);
                                	System.out.println("\n>>>>>>>>>>Empleado agregado<<<<<<<<<<");
                                }

							break;

						}
				
				break;

				case 2://LISTA TODOS LOS EMPLEADOS
					lista.Listar();
				break;

				case 3://ACTUALIZA UN EMPLEADO
					clave = Teclado.LeeEntero("Clave: ");
					pos = lista.Buscar(clave);
					if (pos != null){
						lista.Actualizar(pos);
						System.out.println("\n>>>>>>>>>>Empleado Actualizado<<<<<<<<<<");
					}
				break;

				case 4://BUSCA Y MUESTRA UN EMPLEADO
					clave = Teclado.LeeEntero("Ingresa la clave del empleado a buscar: ");
					pos = lista.Buscar(clave);

					if (pos != null)
						lista.Listar(pos);
				break;

				case 5://BORRA UN EMPLEADO
					clave = Teclado.LeeEntero("Ingresa la clave del empleado a borrar: ");
					pos = lista.Buscar(clave);
					if (pos != null){
						lista.Borrar(clave);
						System.out.println("\n>>>>>>>>>>Empleado borrado<<<<<<<<<<");
					}
				break;

				case 6://ORDENA
					lista.SortSeleccion();
				break;

			}

		} while (opc != 6);
		
	}
}