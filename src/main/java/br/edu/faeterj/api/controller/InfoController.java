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

import br.edu.faeterj.api.entity.Info;
import br.edu.faeterj.api.services.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	InfoService service;

<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/InfoController.java
	//Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public 	ResponseEntity<?> Info() {
		List<Info> obj = service.findAllObj();
=======
	// Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public ResponseEntity<?> Info() {

		List<Info> obj = service.findAllObj();

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/InfoController.java
		return ResponseEntity.ok(obj);
	}

	@GetMapping("/{id}")
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/InfoController.java
	public ResponseEntity<?>  ProcurarInfoPorId(@PathVariable Long id) {
=======
	public ResponseEntity<?> ProcurarInfoPorId(@PathVariable Long id) {

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/InfoController.java
		Info obj = service.FindByIdObj(id);
		return ResponseEntity.ok(obj);
	}
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/InfoController.java
	
	@PostMapping()
	public ResponseEntity<?> PublicarInfo(@RequestBody Info obj ) { //Vai receber uma req com um json no corpo e converte para um obj
		service.InserirObj(obj);
		//obtem o retorno da url do objeto
=======

	@PostMapping()
	public ResponseEntity<?> PublicarInfo(@RequestBody Info obj) { // Vai receber uma req com um json no corpo e
																	// converte para um obj

		service.InserirObj(obj);

		// obtem o retorno da url do objeto
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/InfoController.java
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@DeleteMapping("/{id}")
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/InfoController.java
	public ResponseEntity<?> DeletarInfo(@PathVariable Long id  ) {
			service.DeleteObj(id);
			return ResponseEntity.noContent().build();
=======
	public ResponseEntity<?> DeletarInfo(@PathVariable Long id) {

		service.DeleteObj(id);
		return ResponseEntity.noContent().build();
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/InfoController.java
	}

	@PutMapping("/{id}")
	public void AtualizarInfo(@PathVariable Long id, @RequestBody Info obj) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/InfoController.java
		obj.setId(id);
		service.UpdateObj(obj);
	}
=======

		obj.setId(id);
		service.UpdateObj(obj);

	}

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/InfoController.java
}
