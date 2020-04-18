package Parcial;

public class Inquilino extends Clientes {

	private Integer edadI;
	
	public Inquilino() {
		
	}
	public Inquilino(String nombre, Integer id, Integer edadI, Integer numeroTelefonico) {
		super(nombre, id, numeroTelefonico);
		this.edadI = edadI;
	}

	public Integer getEdad() {
		return edadI;
	}

	public void setEdad(Integer edad) {
		this.edadI = edad;
	}

}