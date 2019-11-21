/**
 * 
 */
package com.nevent.model.dao;

import org.springframework.stereotype.Component;

import com.nevent.model.entitie.Pedido;

/**
 *
 * @author Ruizhe Date: 21 nov. 2019
 *
 */
@Component
public class PedidoDAO {

	public void insertOrUpdate(Pedido pedido) {
		System.out.println("Se guardo el pedido");
	}

	public void delete(Pedido pedido) {
		System.out.println("Se borro el pedido");
	}

	public Pedido select(Integer idPedido) {

		System.out.println("se busca un pedido por ID :" + idPedido);
		return null;
	}
}
