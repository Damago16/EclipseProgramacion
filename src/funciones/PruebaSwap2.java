package funciones;

public class PruebaSwap2 {

	public static void main(String[] args) {
		int[]nums= {3,5};
		swap(nums,0,1);
		String texto= arrayATexto(nums);
		System.out.println(texto);
		
		
		int[] nums2= {3,6,9,10,3,8,5};
		String text=arrayATexto(nums2);
		System.out.println(text);
	}
	public static void swap(int[] arr,int i, int j) {
		if(arr==null||i<0||j<0||i>=arr.length||j>=arr.length) {
			System.out.println();
		}
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static String arrayATexto(int[] arr) {
		String res ="[";
		for(int pos=0;pos<arr.length;pos++) {
			res=res+arr[pos]+",";
		}
		res +="]";
		return res;
		
	}

}
