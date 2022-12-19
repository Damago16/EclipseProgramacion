package funciones;

public class EjemplosIniciales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Si se ve más claro se puede poner asi:
		 *String texto= nVeces("",40);
		 *syso(texto);
		 */
		final int NUM_VECES=40;
		saludar();
		System.out.println(nVeces("",NUM_VECES));
		System.out.println("*");

	}//main
	//funcion que duplica un string n veces y devuelve el string resultado. 
	public static void saludar() {
		System.out.println("holaa");
	}
	public static String nVeces(String orig,int veces) {
		String resultado="";
		while(veces>0) {
			//concatena resultado con el string original recibido.
			resultado=resultado+orig;
			veces--;
		}
		return resultado;
	}
}
