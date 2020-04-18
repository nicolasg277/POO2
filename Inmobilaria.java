package Parcial;

public abstract class Inmobilaria {
	private Integer precio;
	private String tamaño;

	
	public Inmobilaria(Integer precio, String tamaño) {
		this.precio = precio;
		this.tamaño = tamaño;
	}
	public 	Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	
}
