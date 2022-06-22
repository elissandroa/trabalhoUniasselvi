package com.uniasselvi.socializacao.CadCli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uniasselvi.socializacao.CadCli.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
