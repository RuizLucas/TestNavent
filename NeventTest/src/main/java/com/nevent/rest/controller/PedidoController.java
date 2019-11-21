/**
 * 
 */
package com.nevent.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nevent.model.dao.PedidoDAO;
import com.nevent.model.entitie.Pedido;

/**
 *
 * @author Ruizhe Date: 19 nov. 2019
 *
 */
@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoDAO pedidoDAO;

	@PostMapping(path = "/guardar")
	public ResponseEntity<?> guardar(@RequestBody Pedido pedido) {

		ResponseEntity<Object> out = null;

		pedidoDAO.insertOrUpdate(pedido);
		System.out.println(pedido.toString());

		return out;

	}

}
