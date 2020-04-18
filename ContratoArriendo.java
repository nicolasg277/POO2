package Parcial;

public class ContratoArriendo extends Inmobilaria{
	private String tiempoContracto;
	private String disponibilidad;
	
	public ContratoArriendo(Integer precio,String tamaño, String tiempoContracto,String disponibilidad) {
		super(precio, tamaño);
		this.tiempoContracto = tiempoContracto;
		this.disponibilidad = disponibilidad;
	}
	public String getTiempoContracto() {
		return tiempoContracto;
	}
	public void setTiempoContracto(String tiempoContracto) {
		this.tiempoContracto = tiempoContracto;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
}
