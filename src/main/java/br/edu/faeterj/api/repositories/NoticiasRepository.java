package br.edu.faeterj.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.faeterj.api.entity.Noticias;

//Faz a intermediaççao com o banco de dados

@Repository
public interface NoticiasRepository extends JpaRepository<Noticias, Long> {

}
