package mx.uv.servicio.soap.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservacion 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int id_vuelo;
	private String nombre_cliente;
	private String numero_tarjeta;
	private String fecha_vencimiento;
	private int codigo_cvc;
	private int cantidad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_vuelo() {
		return id_vuelo;
	}
	public void setId_vuelo(int id_vuelo) {
		this.id_vuelo = id_vuelo;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getNumero_tarjeta() {
		return numero_tarjeta;
	}
	public void setNumero_tarjeta(String numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public int getCodigo_cvc() {
		return codigo_cvc;
	}
	public void setCodigo_cvc(int codigo_cvc) {
		this.codigo_cvc = codigo_cvc;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "id=" + id + "<br>id_vuelo:" + id_vuelo + "<br>nombre_cliente:" + nombre_cliente
				+ "<br>numero_tarjeta:" + numero_tarjeta + "<br>fecha_vencimiento:" + fecha_vencimiento + "<br>codigo_cvc:"
				+ codigo_cvc + "<br>cantidad:" + cantidad + "";
	}
}
