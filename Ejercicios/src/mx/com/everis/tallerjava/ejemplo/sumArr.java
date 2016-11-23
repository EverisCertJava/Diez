package mx.com.everis.tallerjava.ejemplo;
/*
 *Author:
 *Mario Diez
 */

public class sumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		short[] i0 = {1,2,3,4,5,6};
=======
		short[] i0 = {1,2,3,4,5};
>>>>>>> 33fbd770a2d1a52e2836c265d5ce8e66583ae0f2
		int sum = 0;
		
		System.out.println("Indice: "+(i0[0]-1));
		for(int i=0;i< i0.length; i++ ){
			sum=sum+i0[i];
			System.err.println("Suma Acumulada: "+sum);
		}
		System.err.println("### Suma Final: "+sum+" ###\n");
		
		sum=0;
		System.out.println("//Cambio de Indice**\n");
		System.out.println("Indice: "+(i0.length-1));
		for(int i=(i0.length-1);i>=0; i-- ){
			sum=sum+i0[i];
			System.err.println("Suma Acumulada: "+sum);
		}
		System.err.println("### Suma Final: "+sum+" ###");

	}

}
