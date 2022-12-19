package funciones;

public class ReferenciasString {

	public static void main(String[] args) {
		String s1="hola";
		String s2="hola";
		String s3="hol";
		s3+="a";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		/*el hol se queda solo en el heap 
		 * ya que ninguno lo toma de referencia 
		 * y es borrado por el GC(gabage collector)(recolector de basura)*/

	}

}
