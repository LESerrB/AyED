class Estadisticas{
	
	//ATRIBUTOS
	private ArregloEmpleado obj;

	//CONSTRUCTORES
	public Estadisticas(ArregloEmpleado a){
		obj=a;
	}

	//METODOS
	public void CalcularEstadisticas(){
		//...menu y los case}
		PromEdad();

	}

	public void PromEdad(){
		float totaledad=0.0f;
		float promedad=0.0f;
		int i, indice;

		indice=obj.GetIndice();
		for(i=0; i<=indice; i++)
			totaledad=totaledad+obj.GetEmpleado(i).GetEmpleado.GetEdad();
		promedad = totaledad/(indice+1);
		System.out.println("La edad promedio es: " + promedad);
	}
}