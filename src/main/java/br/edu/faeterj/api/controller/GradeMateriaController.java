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

	// Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public ResponseEntity<?> GradeMateria() {

		List<GradeMateria> obj = service.findAllObj();

		return ResponseEntity.ok(obj);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> ProcurarGradeMateriaoPorId(@PathVariable Long id) {

		GradeMateria obj = service.FindByIdObj(id);
		return ResponseEntity.ok(obj);

	}
	

	@ApiOperation(value = "Adiciona imagens no servidor Amazon S3(bucket privado)")
	@PostMapping()
	public ResponseEntity<?> foto(@RequestParam(name = "file") MultipartFile file) {
		URI uri = service.UploadFoto(file);
		service.SaveFoto(uri);	
		// retorna o uri eo codigo http
		return ResponseEntity.created(uri).build();

	}



	@DeleteMapping("/{id}")
	public ResponseEntity<?> DeletarGradeMateria(@PathVariable Long id) {

		service.DeleteObj(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/{id}")
	public void AtualizarGradeMateria(@PathVariable Long id, @RequestBody GradeMateria obj) {

		obj.setId(id);
		service.UpdateObj(obj);

	}

}
