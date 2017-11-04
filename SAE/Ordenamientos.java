
//package arreglo;

public class Ordenamientos {
    public long time_start, time_end;
    public Alumno []v;
    public int i, j, m, compara, cont;
    
    private void auxcambiaDatos(Alumno []v, int i, int j){
        Alumno aux;
        aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
    
    public void SortSeleccion(Alumno []v, int indice){
        int im,i,j;
  
        for (i=0;i<indice;i++){
            im=i;
        for (j=i+1 ; j<=indice ; j++)
                    if (v[im].GetClave() > v[j].GetClave())
                    im=j;
        if(i!=im)
            auxcambiaDatos(v,i,im);
            }
        }
}