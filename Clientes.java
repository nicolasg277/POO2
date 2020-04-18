package Parcial;

public abstract class Clientes {
	protected String nombre;
	protected Integer id;
	protected Integer numeroTelefonico;
	
	public Clientes() {
		
	}
	public Clientes(String nombre, Integer id, Integer numeroTelefonico) {
		this.nombre = nombre;
		this.id = id;
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(Integer numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	
}

