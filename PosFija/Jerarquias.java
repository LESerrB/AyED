// PARA REALIZAR LAS Jerarquias NECESITAMOS RECIBIR 
// LAS PILAS DE simbolos Y LA posfija

	//ATRIBUTOS
class Jerarquias{
	Pila pilaSim;
	Pila pilaPost;
	
	// CONSTRUCTOR
	public Jerarquias (Pila simbolos, Pila posfija){
		pilaSim = simbolos;
		pilaPost = posfija;
	}


	//METODOS

	public void SumaResta(char c){	//<----	El metodo recibe un char '+' o '-' (se valido desde el main) 
									//		para validar su jerarquia con los simbolos que ya existen en la pilaSim
		
		if (pilaSim.ValidaVacio()!=true){	//<---- Si la pila de simbolos esta vacia, metemos el simbolo sin mas...

			// SI EN LA PILA EXISTE CUALQUIERA DE ESTOS SIMBOLOS + - * / ^ SACA DE LA pilaSim Y LO METE A LA pilaPost
			if (pilaSim.ValorTope()=='+' || pilaSim.ValorTope()=='-' || pilaSim.ValorTope()=='*' || pilaSim.ValorTope()=='/' || pilaSim.ValorTope()=='^'){
				pilaPost.Push(pilaSim.Pop());	
			}
		}
		pilaSim.Push(c); //<-------	Se mete el simbolo que se recibio...
	}

	// ESTE METODO FUNCIONA IGUAL QUE EL ANTERIOR SOLO QUE COMPARA LA JERARQUIA CON '*' Y '/'
	public void DivMulti(char c){
		if (pilaSim.ValidaVacio()!=true){
			if (pilaSim.ValorTope()=='*' || pilaSim.ValorTope()=='/' || pilaSim.ValorTope()=='^'){
				pilaPost.Push(pilaSim.Pop());	
			}
		}

		pilaSim.Push(c);
	}

	// METODO QUE EMPIEZA A METER TODOS LOS SIMBOLOS DE LA pilaSim A LA pilaPost 
	// HASTA QUE ENCUENTRA UN PARENTESIS QUE HABRA.
	public void Cierre(){
		while(pilaSim.ValorTope()!='('){	   //<----	Mientras que en el tope de la pila exista un '(' seguira metiendo
				pilaPost.Push(pilaSim.Pop());  //		los simbolos a la pilaPost
			}

		if (pilaSim.ValidaVacio()!=true)	//<---- Si la pilaSim no esta vacia, va a sacar el ultimo elemento de la pila,
			pilaSim.Pop();					//		esto para asegurarse de sacar el parentesis '(' y dejarlo perder porque 
											//		ya no es necesario.
	}
}