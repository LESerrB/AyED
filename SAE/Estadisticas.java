class Estadisticas{
    
    //ATRIBUTOS
    private ArregloAlumno obj;

    //CONSTRUCTORES
    public Estadisticas(ArregloAlumno a){
        obj=a;
    }

    //METODOS
    public void CalcularEstadisticas(){
        MenuEstad();
    }

    public void GeneroCarrera(){
        int hcompu=0, mcompu=0, hcivil=0, mcivil=0, hpetro=0, mpetro=0;
        int i, indice;

        indice=obj.GetIndice();
        for(i=0; i<=indice; i++){
            if(obj.GetAlumno(i).GetCarrera().GetClave()==1000){
                if(obj.GetAlumno(i).GetGenero().GetClave()==1){
                    hcompu=hcompu+1;}
                else{
                    mcompu=mcompu+1;}
                    }
            if(obj.GetAlumno(i).GetCarrera().GetClave()==2000){
                if(obj.GetAlumno(i).GetGenero().GetClave()==1){
                    hcivil=hcivil+1;}
                else{
                    mcivil=mcivil+1;}
                    }
            if(obj.GetAlumno(i).GetCarrera().GetClave()==3000){
                if(obj.GetAlumno(i).GetGenero().GetClave()==1){
                    hpetro=hpetro+1;}
                else{
                    mpetro=mpetro+1;}
                    }
        }
        System.out.println("\nIngenieria en Computacion:\nHombres:"+hcompu+"\nMujeres: "+mcompu+
            "\nIngenieria Civil:\nHombres:"+hcivil+"\nMujeres: "+mcivil+
            "\nIngenieria Petrolera:\nHombres:"+hpetro+"\nMujeres: "+mpetro);
    }

    public float PromEdad(){ //promedio Edades        
        float totaledad, sumaedad=0.0f;
        int i, indice;
        indice=obj.GetIndice();

        for(i=0; i<=indice; i++){
            sumaedad = (obj.GetAlumno(i).GetEdad())+sumaedad;
        }
        totaledad = sumaedad/i;
        return totaledad;
    }

    public void EdadArribaAbajo(){
        int edadarriba=0;
        int edadabajo=0;
        int i, indice;

        indice=obj.GetIndice();
        for(i=0; i<=indice; i++){
            if (obj.GetAlumno(i).GetEdad()>PromEdad()){
                edadarriba++;}
            else{
                edadabajo++;
            }
        }
        System.out.println("\nAlumnos arriba de la edad promedio: "+edadarriba+
            "\nAlumnos debajo de la edad promedio: "+edadabajo);
    }

    public void ContarHumanos(){
        int totalhombres=0;
        int totalmujeres=0;
        int i, indice;

        indice=obj.GetIndice();
        for(i=0; i<=indice; i++){
            if (obj.GetAlumno(i).GetGenero().GetClave()==1){
                totalhombres=totalhombres+1;}
            else{
                totalmujeres=totalmujeres+1;
            }
        }
        System.out.println("\nTotal de hombres en sistema: "+totalhombres+
            "\nTotal de mujeres en sistema: "+totalmujeres);
    }

    public void PromArribaAbajo(){
        int alumarriba=0;
        int alumabajo=0;
        int i, indice;

        indice=obj.GetIndice();
        for(i=0; i<=indice; i++){
            if (obj.GetAlumno(i).GetPromedio().GetProm()>TotalProm()){
                alumarriba++;}
            else{
                alumabajo++;}
        }
        System.out.println("\nAlumnos arriba del promedio gral.: "+alumarriba+
            "\nAlumnos debajo del promedio gral.: "+alumabajo);
    }

    public float TotalProm(){ //promedio total de los alumnos
        
        float totalprom, sumaprom=0.0f;
        int i, indice;
        indice=obj.GetIndice();

        for(i=0; i<=indice; i++){
            sumaprom = (obj.GetAlumno(i).GetPromedio().GetProm())+sumaprom;}
        totalprom = sumaprom/i;
        return totalprom;
    }

    public void Reprobadas(){
        int cal=0, geo=0, alg=0, est=0;
        int i,indice;
        indice=obj.GetIndice();
        for (i=0;i<=indice;i++){
            cal=cal+obj.GetAlumno(i).GetPromedio().GetReproCal();
            geo=geo+obj.GetAlumno(i).GetPromedio().GetReproGeo();
            alg=alg+obj.GetAlumno(i).GetPromedio().GetReproAlg();
            est=est+obj.GetAlumno(i).GetPromedio().GetReproEst();
        }
        if (cal>=geo && cal>=alg && cal>=est)
            System.out.println("\nCalculo es la Materia con el indice de reprobacion mas alto \n Alumnos que la reprobaron: "+cal);
        if (geo>=cal && geo>=alg && geo>=est)
            System.out.println("\nGeometria es la Materia con el indice de reprobacion mas alto \n Alumnos que la reprobaron: "+geo);
        if (alg>=cal && alg>=geo && alg>=est)
            System.out.println("\nAlgebra es la Materia con el indice de reprobacion mas alto \n Alumnos que la reprobaron: "+alg);
        if (est>=geo && est>=alg && est>=cal)
            System.out.println("\nEstatica es la Materia con el indice de reprobacion mas alto \n Alumnos que la reprobaron: "+est);
 }

    public void AlumnoxCarrera(){
        int compu=0, civil=0, petro=0;
        int i, indice;
        indice=obj.GetIndice();

        for(i=0; i<=indice; i++){
            if(obj.GetAlumno(i).GetCarrera().GetClave()==1000)
                compu++;
            if(obj.GetAlumno(i).GetCarrera().GetClave()==2000)
                civil++;
            if(obj.GetAlumno(i).GetCarrera().GetClave()==3000)
                petro++;
        }
        System.out.println("\nAlumnos en Computacion"+compu+"\nAlumnos en ing. civil:"
            +civil+"\nAlumnos en ing petrolera"+petro);            
    }

    public void AlumnosxGen(){
        int i, indice;
        int ano, cuentaalu=0;
        ano = Teclado.LeeEntero("Escribe el año a buscar: ");
        indice = obj.GetIndice();
        
        for (i=0; i<=indice; i++){
            if (ano == obj.GetAlumno(i).GetGeneracion().GetIngreso())
                cuentaalu++;
        }
        System.out.println("\nEn la generacion "+ano+" ingresaron "+cuentaalu+" alumnos");
    }

        public void PersonasxRegion(){
        int totalDF=0;
        int totalForaneo=0;
        int i, indice;

        indice=obj.GetIndice();
        for(i=0; i<=indice; i++){
            if (obj.GetAlumno(i).GetRegion().GetZipcode()==1){
                totalDF=totalDF+1;}
            else{
                totalForaneo=totalForaneo+1;
            }
        }
        System.out.println("\nTotal de residentes en el DF: "+totalDF+
            "\nTotal de residentes foraneos: "+totalForaneo);
    }

        public void MenuEstad() {  
            int opcion;
            Menu menu = new Menu();
            do {
                opcion = menu.ListaMenu("\n01)Alumnos Totales\n02)Alumnos por Carrera\n03)Distribucion de Generos"+
                                    "\n04)Alumnos del D.F. o Foraneos\n05)Promedio General\n06)Desempeño Alumnos"+
                                    "\n07)Materias mas Reprobadas\n08)Alumnos por Generacion\n09)Promedio de Edad"+
                                    "\n10)Distribucion de Edades\n11)Salir\nOpcion: ",11);
            switch (opcion) {

                case 1:
                    ContarHumanos();
                break;

                case 2:
                    AlumnoxCarrera();
                break;
                
                case 3:
                    GeneroCarrera();
                break;
                
                case 4:
                    PersonasxRegion();
                break;

                case 5:
                    System.out.println("\nEl promedio total es: " + TotalProm());
                break;

                case 6:
                    PromArribaAbajo();
                break;

                case 7:
                    Reprobadas();
                break;

                case 8:
                    AlumnosxGen();
                break;

                case 9:
                    System.out.println("\nEl promedio de edad total es: " + PromEdad());
                break;

                case 10:
                    EdadArribaAbajo();
                break;
            }
        } while (opcion != 11);
    }
}
    