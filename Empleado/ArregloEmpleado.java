package Empleado;

public class ArregloEmpleado {
//ATRIBUTOS
    private Empleados []arreglo;
    private int indice;
    public int[]v;
    public int i, j;
    private Object miarreglo;
		
//CONSRUCTORES
    public ArregloEmpleado(int max){
        arreglo = new Empleados[max];
        indice = -1;
	}
	
//METODOS
    public boolean ValidaEspacio(){
        return (indice < arreglo.length-1);
    }
	
    public void Insertar(Empleados dato) {
        arreglo[++indice]=dato;
    }

    public void Listar() {
        for (int i=0; i<=indice; i++)
            arreglo[i].Listar();
	System.out.println();
    }

    public void Listar(int pos) {
        System.out.println("["+pos+"]="+arreglo[pos]);
    }


    public int Buscar(int dato){
        for(int i=0; i<=indice; i++)
            if (dato== arreglo[i].GetClave())
                return i;
        System.out.println("Error: no existe el dato");
        return -1;
    }
    
    public void Actualizar(int pos) {
        arreglo[pos].Actualizar();
    }
    
    public Empleados Borrar(int pos){
        Empleados aux = arreglo[pos];
        arreglo[pos] = arreglo[indice];
        indice--;
        return aux;
	}
    
    public void Ordenar(int indice){
        int im, i, j;
        for (i=0; i<indice; i++){
            im=i;
            for(j=i+1; j<=indice; j++)
                if(v[im].GetClave()>v[j].GetClave())
                    im=j;
            if(i!=im)
                auxcambiaDatos(v, i, im);
        }
    }
    
    private void auxcambiaDatos( int[]v, int i, int j){
        int aux;
        aux = v[i];
        v[i] = v [j];
        v[j] = aux;
    }    
}

