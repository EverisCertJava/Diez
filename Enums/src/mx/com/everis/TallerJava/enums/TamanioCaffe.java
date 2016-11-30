package mx.com.everis.TallerJava.enums;

public enum TamanioCaffe {
	
	/*	*/
	CHICO("Vaso Chico"), 
	/*	*/
	MEDIANO("Vaso Mediano"), 
	/*	*/
	GRANDE("Vaso Grande");
	
	private String mensaje;
	
	private TamanioCaffe(String tamanio){
		this.mensaje = tamanio;
	}
	
	public String getValue(){
		return this.mensaje;
	}

}
