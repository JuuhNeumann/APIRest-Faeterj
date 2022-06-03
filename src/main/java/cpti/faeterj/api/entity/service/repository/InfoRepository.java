package cpti.faeterj.api.entity.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cpti.faeterj.api.entity.Info;

//Faz a intermediaççao com o banco de dados

@Repository
public interface InfoRepository  extends JpaRepository<Info, Long> {

}
