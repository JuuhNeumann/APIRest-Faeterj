package br.edu.faeterj.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.faeterj.api.entity.GradeMateria;

//Faz a intermediaççao com o banco de dados

@Repository
public interface GradeMateriaRepository extends JpaRepository<GradeMateria, Long> {

}
