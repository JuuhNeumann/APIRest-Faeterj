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

import br.edu.faeterj.api.entity.Post;
import br.edu.faeterj.api.services.PostService;

@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostService service;

<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/PostController.java
	//Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public 	ResponseEntity<?> Post() {
		List<Post> obj = service.findAllObj();
=======
	// Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public ResponseEntity<?> Post() {

		List<Post> obj = service.findAllObj();

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/PostController.java
		return ResponseEntity.ok(obj);
	}

	@GetMapping("/{id}")
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/PostController.java
	public ResponseEntity<?>  ProcurarPostPorId(@PathVariable Long id) {
=======
	public ResponseEntity<?> ProcurarPostPorId(@PathVariable Long id) {

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/PostController.java
		Post obj = service.FindByIdObj(id);
		return ResponseEntity.ok(obj);
	}
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/PostController.java
	
	@PostMapping()
	public ResponseEntity<?> PublicarPost(@RequestBody Post obj ) { //Vai receber uma req com um json no corpo e converte para um obj
		service.InserirObj(obj);	
		//obtem o retorno da url do objeto
=======

	@PostMapping()
	public ResponseEntity<?> PublicarPost(@RequestBody Post obj) { // Vai receber uma req com um json no corpo e
																	// converte para um obj

		service.InserirObj(obj);

		// obtem o retorno da url do objeto
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/PostController.java
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@DeleteMapping("/{id}")
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/PostController.java
	public ResponseEntity<?> DeletarPost(@PathVariable Long id  ) {
			service.DeleteObj(id);
			return ResponseEntity.noContent().build();
=======
	public ResponseEntity<?> DeletarPost(@PathVariable Long id) {

		service.DeleteObj(id);
		return ResponseEntity.noContent().build();
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/PostController.java
	}

	@PutMapping("/{id}")
	public void AtualizarPost(@PathVariable Long id, @RequestBody Post obj) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/PostController.java
		obj.setId(id);
		service.UpdateObj(obj);
	}
=======

		obj.setId(id);
		service.UpdateObj(obj);

	}

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/PostController.java
}
