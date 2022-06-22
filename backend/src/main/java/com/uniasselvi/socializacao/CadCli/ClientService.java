package com.uniasselvi.socializacao.CadCli;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uniasselvi.socializacao.CadCli.entities.Client;
import com.uniasselvi.socializacao.CadCli.repositories.ClientRepository;
import com.uniasselvi.socializacao.dto.ClientDTO;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)	
	public List<ClientDTO> findAll(){
			List<Client> list = repository.findAll();
			return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
		}
	
	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client();
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setBirthDate(dto.getBirthDate());
		entity.setCpf(dto.getCpf());
		entity.setGenre(dto.getGenre());
		entity.setSalario(dto.getSalario());
		entity.setTelefone(dto.getTelefone());
		entity = repository.save(entity);
		
		return new ClientDTO(entity);
  }
	
}
