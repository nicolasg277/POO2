package Parcial;

public class Propietario extends Clientes {
	
	private Integer edadP;
	
	public Propietario() {
		
	}
	public Propietario(String nombre, Integer id, Integer edadP, Integer numeroTelefonico) {
		super(nombre, id, numeroTelefonico);
		this.edadP = edadP;
	}
	
	
	public Integer getEdad() {
		return edadP;
	}


	public void setEdad(Integer edad) {
		this.edadP = edad;
	}
}