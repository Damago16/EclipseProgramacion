package funciones;

public class PruebaSwap {

	public static void main(String[] args) {
		int x=3;
		int y=5;
		swap(x,y);
		System.out.println("x es: "+x+" e y es: "+y);
		

	}//main
	public static void swap(int x,int y) {
		int tmp=x;
		x=y;
		y=tmp;
		System.out.println("En SWAP x es: "+x+" e y es: "+y);
	}
}//class
