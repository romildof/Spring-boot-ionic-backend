package com.romildofelix.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romildofelix.cursomc.domain.Cliente;
import com.romildofelix.cursomc.repositories.ClienteRepository;
import com.romildofelix.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer Id) {
		Optional<Cliente> obj = repo.findById(Id);  
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
				"Objeto não encontrado! Id: " + Id + ", Tipo: " + Cliente.class.getName()));  
		
	}

}
