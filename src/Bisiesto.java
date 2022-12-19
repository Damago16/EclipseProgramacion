
public class Bisiesto {

	public static void main(String[] args) {
		//calcular años bisiestos
		//calculo los restos de division entera entre 4,100 y 400.
		//para poder tomar la desicion de si es bisiesto o no.
		int año=2010;
		if(año%4==0) {
			if(año%400==0) {
				System.out.println("es bisiesto");
			}
			else if(año%100==0) {
				System.out.println("No es bisiesto");
			}
			else {
				System.out.println("Es bisiesto");
			}
		}
		else {
			System.out.println("No es bisiesto");
		}

	}

}
