package mx.uv.servicio.soap.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vuelo
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String aerolinea;
	private String codigo_avion;
	private String fecha_salida;
	private String hora_salida;
	private String hora_llegada;
	private String pais_origen;
	private String pais_destino;
	private String ciudad_origen;
	private String ciudad_destino;
	private double precio_tarifa_basica;
	private double precio_tarifa_clasica;
	private double precio_tarifa_amplus;
	private double precio_tarifa_flexible;
	private double precio_tarifa_premier;
	private String beneficios_tarifa_basica;
	private String beneficios_tarifa_clasica;
	private String beneficios_tarifa_amplus;
	private String beneficios_tarifa_flexible;
	private String beneficios_tarifa_premier;
	private int num_asientos_tarifa_basica;
	private int num_asientos_tarifa_clasica;
	private int num_asientos_tarifa_amplus;
	private int num_asientos_tarifa_flexible;
	private int num_asientos_tarifa_premier;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	public String getCodigo_avion() {
		return codigo_avion;
	}
	public void setCodigo_avion(String codigo_avion) {
		this.codigo_avion = codigo_avion;
	}
	public String getFecha_salida() {
		return fecha_salida;
	}
	public void setFecha_salida(String fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	public String getHora_salida() {
		return hora_salida;
	}
	public void setHora_salida(String hora_salida) {
		this.hora_salida = hora_salida;
	}
	public String getHora_llegada() {
		return hora_llegada;
	}
	public void setHora_llegada(String hora_llegada) {
		this.hora_llegada = hora_llegada;
	}
	public String getPais_origen() {
		return pais_origen;
	}
	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}
	public String getPais_destino() {
		return pais_destino;
	}
	public void setPais_destino(String pais_destino) {
		this.pais_destino = pais_destino;
	}
	public String getCiudad_origen() {
		return ciudad_origen;
	}
	public void setCiudad_origen(String ciudad_origen) {
		this.ciudad_origen = ciudad_origen;
	}
	public String getCiudad_destino() {
		return ciudad_destino;
	}
	public void setCiudad_destino(String ciudad_destino) {
		this.ciudad_destino = ciudad_destino;
	}
	public double getPrecio_tarifa_basica() {
		return precio_tarifa_basica;
	}
	public void setPrecio_tarifa_basica(double precio_tarifa_basica) {
		this.precio_tarifa_basica = precio_tarifa_basica;
	}
	public double getPrecio_tarifa_clasica() {
		return precio_tarifa_clasica;
	}
	public void setPrecio_tarifa_clasica(double precio_tarifa_clasica) {
		this.precio_tarifa_clasica = precio_tarifa_clasica;
	}
	public double getPrecio_tarifa_amplus() {
		return precio_tarifa_amplus;
	}
	public void setPrecio_tarifa_amplus(double precio_tarifa_amplus) {
		this.precio_tarifa_amplus = precio_tarifa_amplus;
	}
	public double getPrecio_tarifa_flexible() {
		return precio_tarifa_flexible;
	}
	public void setPrecio_tarifa_flexible(double precio_tarifa_flexible) {
		this.precio_tarifa_flexible = precio_tarifa_flexible;
	}
	public double getPrecio_tarifa_premier() {
		return precio_tarifa_premier;
	}
	public void setPrecio_tarifa_premier(double precio_tarifa_premier) {
		this.precio_tarifa_premier = precio_tarifa_premier;
	}
	public String getBeneficios_tarifa_basica() {
		return beneficios_tarifa_basica;
	}
	public void setBeneficios_tarifa_basica(String beneficios_tarifa_basica) {
		this.beneficios_tarifa_basica = beneficios_tarifa_basica;
	}
	public String getBeneficios_tarifa_clasica() {
		return beneficios_tarifa_clasica;
	}
	public void setBeneficios_tarifa_clasica(String beneficios_tarifa_clasica) {
		this.beneficios_tarifa_clasica = beneficios_tarifa_clasica;
	}
	public String getBeneficios_tarifa_amplus() {
		return beneficios_tarifa_amplus;
	}
	public void setBeneficios_tarifa_amplus(String beneficios_tarifa_amplus) {
		this.beneficios_tarifa_amplus = beneficios_tarifa_amplus;
	}
	public String getBeneficios_tarifa_flexible() {
		return beneficios_tarifa_flexible;
	}
	public void setBeneficios_tarifa_flexible(String beneficios_tarifa_flexible) {
		this.beneficios_tarifa_flexible = beneficios_tarifa_flexible;
	}
	public String getBeneficios_tarifa_premier() {
		return beneficios_tarifa_premier;
	}
	public void setBeneficios_tarifa_premier(String beneficios_tarifa_premier) {
		this.beneficios_tarifa_premier = beneficios_tarifa_premier;
	}
	public int getNum_asientos_tarifa_basica() {
		return num_asientos_tarifa_basica;
	}
	public void setNum_asientos_tarifa_basica(int num_asientos_tarifa_basica) {
		this.num_asientos_tarifa_basica = num_asientos_tarifa_basica;
	}
	public int getNum_asientos_tarifa_clasica() {
		return num_asientos_tarifa_clasica;
	}
	public void setNum_asientos_tarifa_clasica(int num_asientos_tarifa_clasica) {
		this.num_asientos_tarifa_clasica = num_asientos_tarifa_clasica;
	}
	public int getNum_asientos_tarifa_amplus() {
		return num_asientos_tarifa_amplus;
	}
	public void setNum_asientos_tarifa_amplus(int num_asientos_tarifa_amplus) {
		this.num_asientos_tarifa_amplus = num_asientos_tarifa_amplus;
	}
	public int getNum_asientos_tarifa_flexible() {
		return num_asientos_tarifa_flexible;
	}
	public void setNum_asientos_tarifa_flexible(int num_asientos_tarifa_flexible) {
		this.num_asientos_tarifa_flexible = num_asientos_tarifa_flexible;
	}
	public int getNum_asientos_tarifa_premier() {
		return num_asientos_tarifa_premier;
	}
	public void setNum_asientos_tarifa_premier(int num_asientos_tarifa_premier) {
		this.num_asientos_tarifa_premier = num_asientos_tarifa_premier;
	}
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", aerolinea=" + aerolinea + ", codigo_avion=" + codigo_avion + ", fecha_salida="
				+ fecha_salida + ", hora_salida=" + hora_salida + ", hora_llegada=" + hora_llegada + ", pais_origen="
				+ pais_origen + ", pais_destino=" + pais_destino + ", ciudad_origen=" + ciudad_origen
				+ ", ciudad_destino=" + ciudad_destino + ", precio_tarifa_basica=" + precio_tarifa_basica
				+ ", precio_tarifa_clasica=" + precio_tarifa_clasica + ", precio_tarifa_amplus=" + precio_tarifa_amplus
				+ ", precio_tarifa_flexible=" + precio_tarifa_flexible + ", precio_tarifa_premier="
				+ precio_tarifa_premier + ", beneficios_tarifa_basica=" + beneficios_tarifa_basica
				+ ", beneficios_tarifa_clasica=" + beneficios_tarifa_clasica + ", beneficios_tarifa_amplus="
				+ beneficios_tarifa_amplus + ", beneficios_tarifa_flexible=" + beneficios_tarifa_flexible
				+ ", beneficios_tarifa_premier=" + beneficios_tarifa_premier + ", num_asientos_tarifa_basica="
				+ num_asientos_tarifa_basica + ", num_asientos_tarifa_clasica=" + num_asientos_tarifa_clasica
				+ ", num_asientos_tarifa_amplus=" + num_asientos_tarifa_amplus + ", num_asientos_tarifa_flexible="
				+ num_asientos_tarifa_flexible + ", num_asientos_tarifa_premier=" + num_asientos_tarifa_premier + "]";
	}
}
