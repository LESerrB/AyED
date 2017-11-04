class test {
	public static void main(String []args) {
		Empleado obj = new Empleado(1000,1000);
		int opcion;
		Menu menu= new Menu();
		
		do {
			opcion = menu.ListaMenu("1)Captura\n2)Listar",2);
		   switch (opcion) {
				case 1:obj.CapturaEmpleado();
						break;
				case 2:obj.Listar();
						break;
			}
		}while (opcion != 6);
		
	}
}