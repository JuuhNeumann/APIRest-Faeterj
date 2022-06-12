package br.edu.faeterj.api.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.edu.faeterj.api.entity.Disciplinas;
import br.edu.faeterj.api.services.DisciplinasService;

@RestController
@RequestMapping("/disciplina")
public class DisciplinasController {

	@Autowired
	DisciplinasService service;
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/DisciplinasController.java
	
	//Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public 	ResponseEntity<?> Disciplinas() {
		List<Disciplinas> obj = service.findAllObj();
=======

	// Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public ResponseEntity<?> Disciplinas() {

		List<Disciplinas> obj = service.findAllObj();

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/DisciplinasController.java
		return ResponseEntity.ok(obj);
	}

	@GetMapping("/{id}")
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/DisciplinasController.java
	public ResponseEntity<?>  ProcurarDisciplinasPorId(@PathVariable Long id) {
=======
	public ResponseEntity<?> ProcurarDisciplinasPorId(@PathVariable Long id) {

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/DisciplinasController.java
		Disciplinas obj = service.FindByIdObj(id);
		return ResponseEntity.ok(obj);
	}
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/DisciplinasController.java
	
	@PostMapping()
	public ResponseEntity<?> PublicarDisciplinas(@RequestBody Disciplinas obj ) { //Vai receber uma req com um json no corpo e converte para um obj
		service.InserirObj(obj);
		//obtem o retorno da url do objeto
=======

	@PostMapping()
	public ResponseEntity<?> PublicarDisciplinas(@RequestBody Disciplinas obj) { // Vai receber uma req com um json no
																					// corpo e converte para um obj

		service.InserirObj(obj);

		// obtem o retorno da url do objeto
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/DisciplinasController.java
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@DeleteMapping("/{id}")
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/DisciplinasController.java
	public ResponseEntity<?> DeletarDisciplinas(@PathVariable Long id  ) {
			service.DeleteObj(id);
			return ResponseEntity.noContent().build();
=======
	public ResponseEntity<?> DeletarDisciplinas(@PathVariable Long id) {

		service.DeleteObj(id);
		return ResponseEntity.noContent().build();
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/DisciplinasController.java
	}

	@PutMapping("/{id}")
	public void AtualizarDisciplinas(@PathVariable Long id, @RequestBody Disciplinas obj) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/DisciplinasController.java
		obj.setId(id);
		service.UpdateObj(obj);
	}
=======

		obj.setId(id);
		service.UpdateObj(obj);

	}

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/DisciplinasController.java
}
