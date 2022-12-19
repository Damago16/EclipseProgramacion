
public class Billetes {

	public static void main(String[] args) {
		int cantidad=5321;
		int[]billetes= {500,200,100,50,20,10,5,2,1};
		int numBilletes;
		for(int pos=0;pos<billetes.length;pos++) {
			numBilletes=cantidad/billetes[pos];
			cantidad=cantidad-(numBilletes*billetes[pos]);
			if(numBilletes>0) {
				System.out.println(numBilletes+" de "+billetes[pos]);
			}
		}

	}

}
