package String;
import java.util.Scanner;
public class PruebaSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("dime un texto");
		String txt=entrada.nextLine();
		String [] palabras=txt.split(" ");
		System.out.println(palabras.length);
		//string.format
		System.out.println(String.format("%40s", "*"));
		

	}

}
