class Calificaciones {

//ATRIBUTOS
      private int calculo;
      private int geometria;
      private int algebra;
      private int estatica; 
      private float prom;
      private int npcal=0;
      private int npgeo=0;
      private int npalg=0;
      private int npest=0;
   
//CONSTRUCTORES

//METODOS
       public void CapturaCalificaciones() {
         System.out.println("\nCaptura de Calificaciones:\n");
         LeeCalculo();
         LeeGeometria();
         LeeAlgebra();
         LeeEstatica();
      } 

          public void LeeCalculo() {
         calculo = Teclado.LeeEntero("Calculo: ");
         if (calculo<=5)
          npcal=1;
      }

      public void LeeGeometria() {
         geometria = Teclado.LeeEntero("Geometria: ");
         if (geometria<=5)
          npgeo=1;
      }

      public void LeeAlgebra() {
         algebra = Teclado.LeeEntero("Algebra: ");
         if (algebra<=5)
          npalg=1;
      }

      public void LeeEstatica() {
         estatica = Teclado.LeeEntero("Estatica: ");
         if (estatica<=5)
          npest=1;
      }

 public void Listar() {  
  System.out.println("\nCalificaciones: \n"+
         "Calculo:\t"+calculo+"\nGeometria:\t"+geometria+"\nAlgebra:\t"+algebra+"\nEstatica:\t"+estatica);
 }

 public void Actualizar() {
  int opcion;
  Menu menu = new Menu();//creo el objeto menu
  do {
   opcion = menu.ListaMenu("1)Calculo\n2)Geometria\n3)Algebra\n4)Prog. Avanzada\n5)Salir\nOpcion: ",5);
     switch (opcion) {
    case 1:
               LeeCalculo();
    break;

    case 2:
               LeeGeometria();
    break;

    case 3:
               LeeAlgebra();
    break;
    
            case 4:
               LeeEstatica();
    break;
   }
  } while (opcion != 5);
 }
  public float GetProm(){
    prom=(calculo+geometria+algebra+estatica)/4;
    return prom;
  }

    public int GetReproCal(){
      npcal=npcal;
      return npcal; 

  }
  public int GetReproGeo(){
      npgeo=npgeo;
      return npgeo; 

  }
  public int GetReproAlg(){
      npalg=npalg;
      return npalg; 

  }
  public int GetReproEst(){
      npest=npest;
      return npest; 
  }
  

}