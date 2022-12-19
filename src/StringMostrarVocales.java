
public class StringMostrarVocales {

	public static void main(String[] args) {
		//4.Muestra solo sus letras vocales en el mismo orden que aparezcan en el texto (Para el ejemplo sería: eeuoouauiea . Crea un método boolean esVocal(char letra) que te diga si una letra es vocal o no.
		String texto= "este u otro cualquiera";
		int cursor=0;
		while(cursor<texto.length()) {
			boolean r= esVocal(texto.charAt(cursor));
			if(r) {
			System.out.print(texto.charAt(cursor));
			}//if
			cursor++;
		}//while
	}//main
	public static boolean esVocal (char letra) {
		boolean resultado;
		char vocal1= 'a', vocal2='e', vocal3='i', vocal4='o', vocal5='u';
		if(letra==vocal1||letra==vocal2||letra==vocal3||letra==vocal4||letra==vocal5) {
			resultado=true;
		}//if
		else {
			resultado=false;
		}//else
		return resultado;
	}//esVocal
	
}//class
