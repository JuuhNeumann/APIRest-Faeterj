package br.edu.faeterj.api.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.faeterj.api.entity.Disciplinas;

//Faz a intermediaççao com o banco de dados

@Repository
public interface DisciplinasRepository extends JpaRepository<Disciplinas, Long> {

	@Transactional
	Disciplinas findByDisciplinas(String nome);

}
