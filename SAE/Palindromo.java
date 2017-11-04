class Palindromo {

	public static void main(String[] args){

		String palabra;
		Pila cadena; 
		palabra = Teclado.LeeCadena("Ingresa la palabra a verificar: ");
		System.out.println(palabra);
		cadena = new Pila(palabra.length());
		cadena.Push(palabra.toCharArray());

		if (cadena.ValidaVacio()!=true) {
						if (cadena.VerPal()==true) {
							System.out.println("\n"+palabra+" es un palindromo");
						}

						else{
							System.out.println("\n"+palabra+" no es palindromo");
						}
		}
	}
}
