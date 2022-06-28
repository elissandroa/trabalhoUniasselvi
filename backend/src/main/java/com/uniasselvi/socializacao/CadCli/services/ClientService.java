package com.uniasselvi.socializacao.CadCli.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uniasselvi.socializacao.CadCli.entities.Client;
import com.uniasselvi.socializacao.CadCli.repositories.ClientRepository;
import com.uniasselvi.socializacao.CadCli.services.exceptions.DatabaseException;
import com.uniasselvi.socializacao.CadCli.services.exceptions.ResourceNotFoundException;
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
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found "));
		
		return new ClientDTO(entity);
	}
	
	
	
		
	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client();
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setDuvida(dto.getDuvida());
		entity.setMensagem(dto.getMensagem());
		entity = repository.save(entity);
		
		return new ClientDTO(entity);
  }
	
	@Transactional
	public ClientDTO update(Long id, ClientDTO dto) {
		try {
			Client entity = repository.getById(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new ClientDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}

	}
	
	private void copyDtoToEntity(ClientDTO dto, Client entity) {
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setDuvida(dto.getDuvida());
		entity.setMensagem(dto.getMensagem());
		entity = repository.save(entity);
	}	
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}

	
}
