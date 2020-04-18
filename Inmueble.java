package Parcial;

public  class Inmueble extends Inmobilaria{
	private Integer tiempo;
	
	public Inmueble(Integer precio, String tamaño, Integer tiempo) {
		super(precio, tamaño);
		this.tiempo = tiempo;
	}
	public Integer getTiempo() {
		return tiempo;
	}
	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}
	
}
