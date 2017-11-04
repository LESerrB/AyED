class ArregloEmpleado{
	//ATRIBUTOS
	private Empleado []arreglo;
	private int indice;
		
	//CONSRUCTORES
	public ArregloEmpleado(int max){
		arreglo = new Empleado[max];
		indice = -1;
	}
	
	//METODOS
	public boolean ValidaEspacio(){
		return (indice < arreglo.length-1);
	}
	
	public void Insertar(Empleado dato) {
		arreglo[++indice]=dato;
	}

	public void Listar() {
		for (int i=0; i<=indice; i++)
			arreglo[i].Listar();
	   //System.out.println();
	}

	public void Listar(int pos) {
		System.out.println("["+pos+"]="+arreglo[pos]);
	}


	public int Buscar(int dato){
		for(int i=0; i<=indice; i++)
			if (dato== arreglo[i].GetClave())
				return i;
		System.out.println("Error: no existe el dato...");
		return -1;
	}
	public void Actualizar(int pos) {
		arreglo[pos].Actualizar();
	}
	public Empleado Borrar(int pos){
		Empleado aux= arreglo[pos];
		arreglo[pos] = arreglo[indice];
		indice--;
		return aux;
	}
	public void Ordenar(){
		Ordenamientos ordenar;
            	ordenar = new Ordenamientos();
            	ordenar.SortSeleccion(arreglo,indice);
	}

	public int GetIndice(){
		return indice;
	}

	public Empleado GetEmpleado(int pos){
		return arreglo[pos];
	}
}