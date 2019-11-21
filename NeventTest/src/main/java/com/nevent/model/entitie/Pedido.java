/**
 * 
 */
package com.nevent.model.entitie;

import java.math.BigDecimal;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * @author Ruizhe Date: 19 nov. 2019
 *
 */

@EntityScan
public class Pedido {

	private Integer idPedido;
	private String nombre;
	private BigDecimal monto;
	private Integer descuento;

	public Pedido() {
		super();

	}

	public Pedido(Integer idPedido, String nombre, BigDecimal monto, Integer descuento) {
		super();
		this.idPedido = idPedido;
		this.nombre = nombre;
		this.monto = monto;
		this.descuento = descuento;
	}

	/**
	 * @return the idPedido
	 */
	public Integer getIdPedido() {
		return idPedido;
	}

	/**
	 * @param idPedido the idPedido to set
	 */
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the monto
	 */
	public BigDecimal getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	/**
	 * @return the descuento
	 */
	public Integer getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", nombre=" + nombre + ", monto=" + monto + ", descuento=" + descuento
				+ "]";
	}

}
