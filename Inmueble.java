package Parcial;

public  class Inmueble extends Inmobilaria{
	private Integer tiempo;
	
	public Inmueble(Integer precio, String tama�o, Integer tiempo) {
		super(precio, tama�o);
		this.tiempo = tiempo;
	}
	public Integer getTiempo() {
		return tiempo;
	}
	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}
	
}
