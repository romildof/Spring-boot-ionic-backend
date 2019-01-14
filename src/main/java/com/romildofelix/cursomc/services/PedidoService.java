package com.romildofelix.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romildofelix.cursomc.domain.Pedido;
import com.romildofelix.cursomc.repositories.PedidoRepository;
import com.romildofelix.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer Id) {
		Optional<Pedido> obj = repo.findById(Id);  
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
				"Objeto não encontrado! Id: " + Id + ", Tipo: " + Pedido.class.getName()));  
		
	}

}
