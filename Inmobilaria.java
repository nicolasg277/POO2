package Parcial;

public abstract class Inmobilaria {
	private Integer precio;
	private String tama�o;

	
	public Inmobilaria(Integer precio, String tama�o) {
		this.precio = precio;
		this.tama�o = tama�o;
	}
	public 	Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	
}
