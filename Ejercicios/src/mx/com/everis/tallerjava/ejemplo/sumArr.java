package mx.com.everis.tallerjava.ejemplo;

public class sumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short[] i0 = {1,2,3,4};
		int sum = 0;
		
		System.out.println("Indice: "+(i0[0]-1));
		for(int i=0;i< i0.length; i++ ){
			sum=sum+i0[i];
			System.err.println("Suma Acumulada: "+sum);
		}
		System.err.println("### Suma Final: "+sum+" ###\n\n\n");
		
		sum=0;
		System.out.println("//Cambio de Indice**");
		System.out.println("Indice: "+(i0[3]-1));
		for(int i=(i0.length-1);i>=0; i-- ){
			sum=sum+i0[i];
			System.err.println("Suma Acumulada: "+sum);
		}
		System.err.println("### Suma Final: "+sum+" ###");
		

	}

}
