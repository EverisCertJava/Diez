package mx.com.everis.certjava.clases;

import mx.com.everis.certjava.interfaces.Athlete;
import mx.com.everis.certjava.interfaces.AthleteDos;
import mx.com.everis.certjava.padre.Person;

public class Runner extends Person implements Athlete, AthleteDos{

	/**
	 * Constructor
	 * "public" Modificador de acceso
	 */
	public Runner() {
		super();
		//System.out.println("Clase Hija (Runner)");
	}
	Runner(String nombre) {
		System.out.println("Constructor Runner class "+nombre);
	}
	
	public Runner (String... name){
		//for(int i=0;i < 4;i++)
		//System.out.println(name[i]);
	}
	
	
	/**
	 * Variables de clase o estaticas
	 */
	/**
	 * Variables de Instancia
	 */
	/**
	 * Métodos
	 */
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "Rock X";
	}

}
