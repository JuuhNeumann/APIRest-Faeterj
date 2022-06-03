package cpti.faeterj.api.entity.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cpti.faeterj.api.entity.Aluno;

//Faz a intermediaççao com o banco de dados

@Repository
public interface AlunoRepository  extends JpaRepository<Aluno, Long> {

}
