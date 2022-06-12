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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.edu.faeterj.api.entity.GradeMateria;
import br.edu.faeterj.api.services.GradeMateriaService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/gradeMateria")
public class GradeMateriaController {

	@Autowired
	GradeMateriaService service;
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/GradeMateriaController.java
	
	//Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public 	ResponseEntity<?> GradeMateria() {
		List<GradeMateria> obj = service.findAllObj();
=======

	// Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public ResponseEntity<?> GradeMateria() {

		List<GradeMateria> obj = service.findAllObj();

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/GradeMateriaController.java
		return ResponseEntity.ok(obj);
	}

	@GetMapping("/{id}")
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/GradeMateriaController.java
	public ResponseEntity<?>  ProcurarGradeMateriaoPorId(@PathVariable Long id) {
=======
	public ResponseEntity<?> ProcurarGradeMateriaoPorId(@PathVariable Long id) {

>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/GradeMateriaController.java
		GradeMateria obj = service.FindByIdObj(id);
		return ResponseEntity.ok(obj);
	}
	
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/GradeMateriaController.java
	
	@PostMapping()
	public ResponseEntity<?> PublicarGradeMateria(@RequestBody GradeMateria obj ) { //Vai receber uma req com um json no corpo e converte para um obj
		service.InserirObj(obj);	
		//obtem o retorno da url do objeto
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
=======

	@ApiOperation(value = "Adiciona imagens no servidor Amazon S3(bucket privado)")
	@PostMapping()
	public ResponseEntity<?> foto(@RequestParam(name = "file") MultipartFile file) {
		URI uri = service.UploadFoto(file);
		service.SaveFoto(uri);	
		// retorna o uri eo codigo http
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/GradeMateriaController.java
		return ResponseEntity.created(uri).build();

	}



	@DeleteMapping("/{id}")
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/GradeMateriaController.java
	public ResponseEntity<?> DeletarGradeMateria(@PathVariable Long id  ) {
			service.DeleteObj(id);
			return ResponseEntity.noContent().build();
=======
	public ResponseEntity<?> DeletarGradeMateria(@PathVariable Long id) {

		service.DeleteObj(id);
		return ResponseEntity.noContent().build();
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/GradeMateriaController.java
	}

	@PutMapping("/{id}")
	public void AtualizarGradeMateria(@PathVariable Long id, @RequestBody GradeMateria obj) {
<<<<<<< HEAD:src/main/java/cpti/faeterj/api/controller/GradeMateriaController.java
		obj.setId(id);
		service.UpdateObj(obj);
	}
}
=======

		obj.setId(id);
		service.UpdateObj(obj);

	}

}
>>>>>>> bce3d6d4b3aef6446399991552d9ade631c84275:src/main/java/br/edu/faeterj/api/controller/GradeMateriaController.java
