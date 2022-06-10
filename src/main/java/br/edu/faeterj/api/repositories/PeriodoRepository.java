package br.edu.faeterj.api.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.faeterj.api.entity.Periodo;

//Faz a intermediaççao com o banco de dados

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Long> {

	@Transactional
	Periodo findByPeriodo(String nome);

}
