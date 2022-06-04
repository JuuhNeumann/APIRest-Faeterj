package cpti.faeterj.api.entity.service.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cpti.faeterj.api.entity.Disciplinas;
import cpti.faeterj.api.entity.Periodo;

//Faz a intermediaççao com o banco de dados

@Repository
public interface PeriodoRepository  extends JpaRepository<Periodo, Long> {
	
	@Transactional
	Periodo findByPeriodo(String nome);

}
