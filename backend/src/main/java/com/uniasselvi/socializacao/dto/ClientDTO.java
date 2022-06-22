package com.uniasselvi.socializacao.dto;

import java.util.Date;

import com.uniasselvi.socializacao.CadCli.entities.Client;
import com.uniasselvi.socializacao.CadCli.entities.Genre;

public class ClientDTO {

	private Long id;
	private String name;
	private Date birthDate;
	private Genre genre;
	private String cpf;
	private Double salario;
	private String telefone;
	
	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, Date birthDate, Genre genre, String cpf, Double salario, String telefone) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.genre = genre;
		this.cpf = cpf;
		this.salario = salario;
		this.telefone = telefone;
	}
	
	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.birthDate = entity.getBirthDate();
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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
