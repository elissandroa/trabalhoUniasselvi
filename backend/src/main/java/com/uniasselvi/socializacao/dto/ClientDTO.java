package com.uniasselvi.socializacao.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.uniasselvi.socializacao.CadCli.entities.Client;
import com.uniasselvi.socializacao.CadCli.entities.Genre;

public class ClientDTO {

	
	private Long id;
	@NotBlank(message = "Campo obrigatório")
	private String name;
	@Email(message = "Favor entrar com email válido")
	private String email;
	private Genre genre;
	private String cpf;
	private Double salario;
	private String telefone;
	
	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String email, Genre genre, String cpf, Double salario, String telefone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.genre = genre;
		this.cpf = cpf;
		this.salario = salario;
		this.telefone = telefone;
	}
	
	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.genre = entity.getGenre();
		this.cpf = entity.getCpf();
		this.salario = entity.getSalario();
		this.telefone = entity.getTelefone();
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
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
