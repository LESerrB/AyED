package OrdenamientosAleatorios;

public class Ordenamientos{
    public int[]v;
    public int i, j;
    
    private void auxcambiaDatos( int[]v, int i, int j){
        int aux;
        aux = v[i];
        v[i] = v [j];
        v[j] = aux;
    }
    
    public void SortIntercambio(int[]v, int indice){
        for (i=0;i<indice;i++)
            for (j=i+1;j<=indice;j++)
                if (v[i]>v[j]){
                    auxcambiaDatos(v,i,j);
                }
        }
    
    public void SortSeleccion(int[]v, int indice){
        int im, i ,j;
        for (i=0; i<indice; i++){
            im=i;
            for(j=i+1; j<=indice; j++)
                if(v[im]>v[j])
                    im=j;
            if(i!=im)
                auxcambiaDatos(v, i, im);
        }
    }
    
    public void SortInsercion(int []v, int indice){
        int aux=0, i, j;
        for(i=1; i<=indice; i++){
            aux=v[i];
            for(j=i; j>0; j--)
                if(j>0 && v[j-1]>aux)
                    v[j]=v[j-1];
        }
        v[j]=aux;
    }
}