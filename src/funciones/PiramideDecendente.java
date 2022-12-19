package funciones;

public class PiramideDecendente {

	public static void main(String[] args) {
		int num=10;
		for(int i =num;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		String r1=piramideDeNV1(num);
		String r2=piramideDeNV2(num);
		System.out.println(r1);
		System.out.print(r2);
	}
	public static String piramideDeNV1(int n) {
		String res="";
		for(int i =n;i>0;i--) {
			for(int j=i;j>0;j--) {
				res+=j+" ";
			}
			res+="\n";
		}
		
		return res;
	}
	public static String piramideDeNV2(int n) {
		String res="";
		for(int i =n;i>0;i--) {
			res+=cuentaAtrás(i);
			/*for(int j=i;j>0;j--) {
				res+=j+" ";
			}*/
			res+="\n";
		}
		
		return res;
	}
	public static String cuentaAtrás(int n) {
		String res="";
		for(int r=n;r>0;r--) {
			res+=r+" ";
		}
		
		return res;
	}

}
