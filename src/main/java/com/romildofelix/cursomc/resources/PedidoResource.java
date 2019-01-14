package com.romildofelix.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.romildofelix.cursomc.domain.Pedido;
import com.romildofelix.cursomc.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value = "/{Id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer Id) {
		
		Pedido obj = service.buscar(Id);
		return ResponseEntity.ok().body(obj);
		
	}

}
