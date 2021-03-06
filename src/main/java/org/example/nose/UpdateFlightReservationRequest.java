//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.10 at 05:46:26 PM CDT 
//


package org.example.nose;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_vuelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre_cliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="num_tarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fecha_vencimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_cvc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idVuelo",
    "nombreCliente",
    "numTarjeta",
    "fechaVencimiento",
    "codigoCvc",
    "cantidad"
})
@XmlRootElement(name = "UpdateFlightReservationRequest")
public class UpdateFlightReservationRequest {

    @XmlElement(name = "id_vuelo")
    protected int idVuelo;
    @XmlElement(name = "nombre_cliente", required = true)
    protected String nombreCliente;
    @XmlElement(name = "num_tarjeta", required = true)
    protected String numTarjeta;
    @XmlElement(name = "fecha_vencimiento", required = true)
    protected String fechaVencimiento;
    @XmlElement(name = "codigo_cvc")
    protected int codigoCvc;
    protected int cantidad;

    /**
     * Gets the value of the idVuelo property.
     * 
     */
    public int getIdVuelo() {
        return idVuelo;
    }

    /**
     * Sets the value of the idVuelo property.
     * 
     */
    public void setIdVuelo(int value) {
        this.idVuelo = value;
    }

    /**
     * Gets the value of the nombreCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Sets the value of the nombreCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
    }

    /**
     * Gets the value of the numTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Sets the value of the numTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTarjeta(String value) {
        this.numTarjeta = value;
    }

    /**
     * Gets the value of the fechaVencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Sets the value of the fechaVencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVencimiento(String value) {
        this.fechaVencimiento = value;
    }

    /**
     * Gets the value of the codigoCvc property.
     * 
     */
    public int getCodigoCvc() {
        return codigoCvc;
    }

    /**
     * Sets the value of the codigoCvc property.
     * 
     */
    public void setCodigoCvc(int value) {
        this.codigoCvc = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

}
