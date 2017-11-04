class Impresion {

	public static void main(String[] args) {
		int numTrabajos, opcion, maxHojas, auxHojas, buff;
		Nodo pos, q;
		Trabajo t, aux;
		ColaDinamica coladeimpresion = new ColaDinamica();
		ColaCircular buffer;

		numTrabajos = Teclado.LeeEntero("\nNumero de trabajos a simular: ");
		buff = Teclado.LeeEntero("Tamaño del buffer de impresión: ");
		buffer = new ColaCircular(buff);
//********************************************************************************************
		while (numTrabajos > 0) {
			t = new Trabajo();
			t.CapturaTrabajo();
			coladeimpresion.Insertar(t);
			--numTrabajos;
			System.out.println("===========================================================");
		}
//********************************************************************************************
		while (buffer.ValidaEspacio() != false) {
			buffer.Insertar(coladeimpresion.Borrar().GetInfo());
		}
//********************************************************************************************
		System.out.println ();
		System.out.println("Buffer:");
		buffer.Listar();
		System.out.println("=========================================================");
		System.out.println("Cola de impresion:");
		coladeimpresion.Listar();
//********************************************************************************************
		maxHojas = Teclado.LeeEntero("\n\nNumero de maximo de impresiones por turno: ");

		while(buffer.ValidaVacio() != true) {
			auxHojas = maxHojas;
			aux = buffer.Borrar();

			while(auxHojas > 0) {
				if(aux.GetHojas() != 0) {
					System.out.println ("Imprimiendo: Id: "+aux.GetID()+"\tNombre: "+aux.GetNombre()+"\t||\t#Hojas: "+(aux.RestaHoja()+1));
					--auxHojas;
				}
				else
					auxHojas = 0;
			}

			if(aux.GetHojas() != 0) {
				coladeimpresion.Insertar(aux);
				buffer.Insertar(coladeimpresion.Borrar().GetInfo());
				System.out.println(">>>Nuevo archivo agregado al buffer de impresion<<<\n");
			}
			else {
				buffer.Insertar(coladeimpresion.Borrar().GetInfo());
				System.out.println(">>>Nuevo archivo agregado al buffer de impresion<<<\n");
			}
				
		}

	}
}