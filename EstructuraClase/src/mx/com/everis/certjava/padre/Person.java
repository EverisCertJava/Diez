package mx.com.everis.certjava.padre;

public class Person {

	public Person(){
		System.out.println("Clase Padre (Person)");
	}
	Person(String nombre){
		System.out.println("Clase Padre (Person) "+nombre);
	}
	public static String nombre;
}
