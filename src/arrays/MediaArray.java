package arrays;
import entrada.Entrada;
public class MediaArray {

	public static void main(String[] args) {
		//System.out.println("Dime un número:");
		//int n= Entrada.entero();
		//System.out.println("has dado : "+n);
		int [] arreglo= {1,2,3,4,5};
		double media=media(arreglo);
		System.out.println(media);
	}
	public static double media(int[] arr) {
		return media(arr,arr.length);
	}
	//funcion calcula la media de los nums n primeros elementos y la devuelve 
	public static double media(int[] arr,int numElems) {
		int suma=0;
		for(int pos=0;pos<numElems;pos++) {
			suma+=arr[pos];
		}
		return (double)suma/numElems;
	}
}
