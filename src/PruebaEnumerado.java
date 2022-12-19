
public class PruebaEnumerado {
	public enum Dia {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO};

	public static void main(String[] args) {
		Dia dia1;
		dia1=Dia.LUNES;//1;//"Lunes";
		/*no se puede dia1++;*/
		System.out.println(dia1);
	}

}
