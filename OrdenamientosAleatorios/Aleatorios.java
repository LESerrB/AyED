package OrdenamientosAleatorios;

class Aleatorios{
    private int vector[];
    private int vector2[];
    private int vector3[];
    private int tam;
    private int i;


    public Aleatorios(int tam){
        vector=new int[tam];
        vector2=new int[tam];
        vector3=new int[tam];
        for (i=0; i<vector.length; i++)
            vector[i]=(int)(Math.random()*100);
        System.arraycopy(vector,0,vector2,0,vector.length);  
        System.arraycopy(vector,0,vector3,0,vector.length);
    }
    
    public void Listar(){
        int i;
        System.out.println("\n[Vector 1]\n");
        for(i=0; i<vector.length; i++){
            System.out.println("[" + i + "]" + vector[i]);
        }
        System.out.println("\n[Vector 2]\n");
        for(i=0; i<vector2.length; i++){
            System.out.println("[" + i + "]" + vector2[i]);
        }
        System.out.println("\n[Vector 3]\n");
        for(i=0; i<vector3.length; i++){
            System.out.println("[" + i + "]" + vector3[i]);
        }
    }

    public void OrdenarArreglos (int tam){
    	Ordenamientos ordena;
            	ordena=new Ordenamientos();
            	ordena.SortIntercambio(vector, tam);
            	ordena.SortSeleccion(vector2, tam);
            	ordena.SortInsercion(vector3, tam);

    }
}
