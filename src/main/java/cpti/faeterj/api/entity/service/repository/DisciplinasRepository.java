package cpti.faeterj.api.entity.service.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cpti.faeterj.api.entity.Disciplinas;

//Faz a intermediaççao com o banco de dados

@Repository
public interface DisciplinasRepository  extends JpaRepository<Disciplinas, Long> {

	@Transactional
	Disciplinas findByDisciplinas(String nome);

}
