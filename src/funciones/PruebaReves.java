package funciones;

public class PruebaReves {

	public static void main(String[] args) {
		String texto="palabra mágica";
		String reves=delReves(texto);
		String reves2=delReves2(texto);
		System.out.println(reves);
		System.out.println(reves2);

	}//main
	public static String delReves(String txt) {
		String res="";
		//de izquierda a derecha.
		/*for(int pos=txt.length()-1;pos>=0;pos--) {
			res+=txt.charAt(pos);
		}*/
		//tambien puedes hacerlo pegando a la derecha(de derecha a izquierda)
		for(int pos=0;pos<txt.length();pos++) {
			res=txt.charAt(pos)+res;
			System.out.println(res);
		}
		return res;
	}
	public static String delReves2(String txt) {
		String res="";
		//de izquierda a derecha va pegando por lo que recorro al reves el string y lo pego normal.
		for(int pos=txt.length()-1;pos>=0;pos--) {
			res+=txt.charAt(pos);
			System.out.println(res);
		}
		//tambien puedes hacerlo pegando a la derecha(de derecha a izquierda)
		/*for(int pos=0;pos<txt.length();pos++) {
			res=txt.charAt(pos)+res;
			System.out.println(res);
		}*/
		return res;
	}
}//class
