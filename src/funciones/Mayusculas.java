package funciones;

public class Mayusculas {

	public static void main(String[] args) {
		String texto = "Hola, ¿Qué tal estaís?";
		String texto2 = aMayusculas(texto);
		System.out.println(texto2);

	}
	public static String aMayusculas(String texto) {
		String resultado="";
		int diff = 'a'-'A';
		for(int pos=0;pos<texto.length();pos++) {
			char letra = texto.charAt(pos);
			if (letra>='a'&&letra<='z') {
				char mayus=(char)(letra-diff);
				resultado=resultado+mayus;
				
			}
			else {
				resultado+=letra;
			}
		}
		return resultado;
	}

}
