package Arreglo;

class Arreglo {
    //Atributos
    private int []arreglo;
    private int indice;

    //Constructores
    public Arreglo (int max){
        arreglo=new int [max];
	indice=-1;
    }    
	
    //Metodos
    public boolean ValidaEspacio(){
        if (indice+1<arreglo.length)
        return true;
        else
        return false;
    }
    
    public void Insertar(int dato){
        indice++;
        arreglo[indice]=dato;
    }
    
    public void Listar(){
        int i;
        for(i=0; i<=indice; i++){
            System.out.println("[" + i + "]" + arreglo[i]);}
    }
    
    public int Buscar(int dato, int aux){
        if (aux<arreglo.length&&indice!=-1){
            if (dato==arreglo[aux]){
                return aux;}
        }
            return -1;
    }
    
    public void Actualizar(int pos){
        arreglo[pos]=Teclado.LeeEntero("Dame el nuevo dato: ");
    } 
    
    public int Borrar(int pos){
        int aux=arreglo[pos];
        arreglo[pos]=arreglo[indice];
        indice--;
        return aux;
    }
    
    public void Listar(int pos){
        System.out.println("[" + pos + "]" + arreglo[pos]);
    }
}
