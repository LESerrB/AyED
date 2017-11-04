
class EmpleadoCorto {
   //ATRIBUTOS
   private int clave;
   private String nombre;
   private int edad;
   
   //CONSTRUCTORES
   public EmpleadoCorto() {
   }
   //METODOS
   public void CapturaClave(){
      clave=Teclado.entero("Clave: ");
   }
   public void CapturaNom(){
      nombre=Teclado.cadena("Nombre: ");
   }
   public void CapturaEdad(){
      edad=Teclado.entero("Edad: ");
   }
   public void Capturar() {
      CapturaClave();
      CapturaNom();
      CapturaEdad();
   }

   
   
   public void Listar(){
      System.out.println(clave+"\t"+nombre+"\t"+edad);
   }
   public void Actualizar() {
      int opcion,opcion2,pos,indice;
      
      Menu m= new Menu();
      do {
         opcion = m.DespliegaMenu("1)Nombre\n2)Edad\n3)Salir\nOpcion: ",3);
         switch(opcion){
            case 1:CapturaNom();
               break;
            case 2:CapturaEdad();
               break;
         }
      
      } while (opcion !=3);
   }
   public int GetClave(){
      return clave;
   }
 
}