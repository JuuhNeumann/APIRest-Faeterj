package br.edu.faeterj.api.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD:src/main/java/cpti/faeterj/api/entity/service/repository/PeriodoRepository.java
import cpti.faeterj.api.entity.Periodo;
=======
import br.edu.faeterj.api.entity.Periodo;
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/repositories/PeriodoRepository.java

//Faz a intermediaççao com o banco de dados

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Long> {

	@Transactional
	Periodo findByPeriodo(String nome);

}
