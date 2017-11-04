class EnterosDSE {

//ATRIBUTOS
  private NodoD H;
  private NodoD T;
  private boolean existe;
    
//METODOS
  public void InsertaFinal (int dato) {
    NodoD q = new NodoD(dato, null,T);
    
    if (T==null) 
      H = T = q;
    else {
      T.SetSig(q);
      T = q;
    }

  }
//********************************************************************************************
  public void Listar() {
    NodoD i = H;

    do{
      System.out.println(i.GetInfo());
      i = i.GetSig();
    } while (i != null);
      
  }
//********************************************************************************************
  public void InsertaPrin (int dato) {
    NodoD q=new NodoD(dato,H, null);
    
    if(H == null)
      T = q;
    else
      H.SetAnt(q);	
    
    H = q;
  }
//********************************************************************************************
  public NodoD Buscar(int dato){
    NodoD q;

    for (q=H; q!=null ; q=q.GetSig()) {
      if(dato==q.GetInfo())
        return q;
    }

    System.out.println("No existe el dato");
    return null;
    }
//********************************************************************************************
  public void Actualizar (NodoD q) {
    q.SetInfo(Teclado. LeeEntero("Ingresé nuevo valor : ")); 
  }
//********************************************************************************************
  public NodoD Borrar (int dato) {
    NodoD aux = Buscar(dato);
    
    if(aux !=null) {

      if(H==T)
        H=T=null;
      else

        if (aux ==H) {
          H = H.GetSig();
          H.SetAnt(null);
        }
        else

          if(aux==T) {
            T=aux.GetAnt();
            T.SetSig(null);
          }
          else {
            aux.GetAnt().SetSig(aux.GetSig());
            aux.GetSig().SetAnt(aux.GetAnt());
          }

    }
    else
      System.out.println("Error no existe el dato...");
    return aux;
  }
//********************************************************************************************
/*  
  public void InsertarDespues (Nodo q,int dato) {
    Nodo aux;

    if(q==T)
      InsertarAlFinal(dato);
    else{
      aux=new Nodo(dato,q.GetSig());
      q.SetSig(aux);
    }
  }
//********************************************************************************************
  public void InsertarAntes (Nodo q,int dato) {
    Nodo aux;

    if(q==null)
      InsertarAlPrincipio(dato);
    else {
      aux=new Nodo(dato,q.GetSig());
      q.SetSig(aux);
    }

  }
//********************************************************************************************
  public NodoD BuscarNodoDAnterior (int dato) {
   	NodoD q, anterior=null;
   	existe=false;
   	
    for (q=H; q!=null ; q=q.GetSig()) {
   		
      if(existe = dato == q.GetInfo())
   			return anterior;
   		
      anterior=q;
   	}

    System.out.println("Error ");
    return null;
  }
//********************************************************************************************
  public void Ordenar() {
    //Ordenamiento orden=new Ordenamiento();
    //orden.SortIntercambio(H);     
  }
*/
}