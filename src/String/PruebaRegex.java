package String;
import java.util.Scanner;
public class PruebaRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("dime tu NIF:");
		String nif=entrada.nextLine();
		//while(!nif.isEmpty()) {
		if(nif.matches("[0-9]{7,9}(|-)?[A-Z]"))
		
		{
			System.out.println("NIF válido");
		}
		else {
			System.out.println("No es válido");
		}
		
	}

}
