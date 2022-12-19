
public class DecimalAHex {

	public static void main(String[] args) {
		String cifras="0123456789ABCDEF";
		String hex="";
		int num=3542;
		int resto;
		while(num>0) {
			resto=num%16;
			num=num/16;
			hex=cifras.charAt(resto)+hex;	
		}
		System.out.println("mi solución: "+hex);
		System.out.println("solucion de java:"+String.format("%x",num));

	}

}
