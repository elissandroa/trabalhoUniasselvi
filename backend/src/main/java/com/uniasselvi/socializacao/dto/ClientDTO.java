package com.uniasselvi.socializacao.dto;

import com.uniasselvi.socializacao.CadCli.entities.Client;

public class ClientDTO {

	
	private Long id;
	private String name;
	private String email;
	private String duvida;
	private String mensagem;
	
	
	public ClientDTO() {
	}


	public ClientDTO(Long id, String name, String email, String duvida, String mensagem) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.duvida = duvida;
		this.mensagem = mensagem;
	}
	
	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.duvida = entity.getDuvida();
		this.mensagem = entity.getMensagem();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDuvida() {
		return duvida;
	}


	public void setDuvida(String duvida) {
		this.duvida = duvida;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}