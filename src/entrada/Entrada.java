package entrada;

import java.io.*;
public class Entrada {
    static String inicializar() {
        String buzon = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try {
            buzon = teclado.readLine();
        } catch (Exception e) {
            System.out.append("Entrada incorrecta");
        }
        return buzon;
    }
    //mejora para quitar espacios de delante y detras.
    /*public static int entero() {
    	String txt= inicializar();
    	txt.trim();
    	int=valor;
    	try{
        int valor = Integer.parseInt(inicializar());
        }
        catch(Exception e){
        }
        return valor;
    }*/
   public static int entero() {
        int valor = Integer.parseInt(inicializar());
        return valor;
    }

   public static double real() {
        double valor = Double.parseDouble(inicializar());
        return valor;
    }

   public static String cadena() {
        String valor = inicializar();
        return valor;
    }

    public static char caracter() {
        String valor = inicializar();
        return valor.charAt(0);
    }
    public static int enteroEnRango(int min,int max,String txt) {
    	int num;
    	System.out.println("dame un numero entre "+min+" y "+max+" :");
    	num=Entrada.entero();
    	while(num<min||num>max) {
    		System.out.println("Entrada no valida");
    		System.out.println("dame un numero entre "+min+" y "+max+" :");
    		num=Entrada.entero();
    	}
    	return num;	
    }

} // class Entrada
