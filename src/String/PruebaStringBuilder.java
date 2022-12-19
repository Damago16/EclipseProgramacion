package String;

public class PruebaStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb1= new StringBuilder("hola");
		StringBuilder sb2= new StringBuilder("pepa");
		
		/*sb1.append(" ");//.append(sb2);
		sb1.append(sb2);
		System.out.println(sb1);*/
		
		swap(sb1, sb2);
		System.out.println(sb1);
		System.out.println(sb2);
		
	}
	//no funciona¿pq? noooo porque no puedes cambiar referencias de memoria desde una funcion.
	public static void swapMal(StringBuilder s1,StringBuilder s2) {
		StringBuilder aux= s1;
		s1=s2;
		s2=aux;
		
	}
	//tienes que copiar y borrar contenido, o sobreescribir.
	public static void swap(StringBuilder s1,StringBuilder s2) {
		StringBuilder aux= new StringBuilder(s1);
		s1.delete(0, s1.length());
		s1.append(s2);
		s2.delete(0, s2.length());
		s2.append(aux);
		
		
		
	}
}
