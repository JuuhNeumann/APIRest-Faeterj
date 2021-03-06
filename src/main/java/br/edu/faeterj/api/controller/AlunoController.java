package br.edu.faeterj.api.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

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

import br.edu.faeterj.api.dto.AlunoDTO;
import br.edu.faeterj.api.dto.ListDisciplinasDTO;
import br.edu.faeterj.api.dto.NewAlunoDTO;
import br.edu.faeterj.api.entity.Aluno;
import br.edu.faeterj.api.services.AlunoService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = ("/aluno"))
public class AlunoController {

	@Autowired
	AlunoService service;

	@ApiOperation(value = "Retorna uma Lista de Alunos sem os dados pessoais(Endereço,senha)")
	@GetMapping
	public ResponseEntity<?> listarProdutos() {
		List<AlunoDTO> list = service.clientes();

		return ResponseEntity.ok(list);

	}

	@ApiOperation(value = "Busca por ID")
	@GetMapping("{id}")
	public ResponseEntity<?> buscar(@PathVariable Long id) {
		Aluno obj = service.listar(id);

		return ResponseEntity.ok(obj);

	}

	@ApiOperation(value = "Exclui Aluno")
	@DeleteMapping(value = ("/{id}"))
	public ResponseEntity<Void> delete(@PathVariable Long id) {

		service.delete(id);

		return ResponseEntity.noContent().build();

	}

	@ApiOperation(value = "Insere um novo Aluno")
	@PostMapping
	public ResponseEntity<Void> insert(@Valid @RequestBody NewAlunoDTO objDto) {
		Aluno obj = service.fromDTO(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

		// retorna o uri eo codigo http
		return ResponseEntity.created(uri).build();
	}
	

	@ApiOperation(value = "Insere uma nova disciplina para o aluno")
	@PostMapping(value = ("/{id}"))
	public ResponseEntity<Void> addDisciplina(@PathVariable Long id ,@RequestBody ListDisciplinasDTO objDto) {
		
		Aluno obj = service.inserirDisciplina(objDto,id);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

		// retorna o uri eo codigo http
		return ResponseEntity.created(uri).build();
	}
	
	
	
	
	
	@ApiOperation(value = "Busca por email")
	@GetMapping(value = "/email")
	public ResponseEntity<?> email(@RequestParam(value = "value") String email) {
		Aluno obj = service.findByEmail(email);
		return ResponseEntity.ok(obj);

	}


	
	  @ApiOperation(value = "Atualiza Aluno")
	  
	  @PutMapping("/{id}")
	  public ResponseEntity<Aluno>update(@Valid @RequestBody AlunoDTO objDto, @PathVariable Long id) {
	  
	  Aluno obj = service.fromDTO(objDto);
	  obj.setId(id); 
	  service.update(obj);
	 
	  return ResponseEntity.noContent().build(); }
	 

	@ApiOperation(value = "Retorna a quantidade de Alunos cadastrados")
	@GetMapping("/count")

	public ResponseEntity<?> count() {
		return ResponseEntity.ok(service.count());
	}

	@ApiOperation(value = "Adiciona imagens no servidor Amazon S3(bucket privado)")
	@PostMapping(value = "/imagem/{email}")
	public ResponseEntity<?> foto(@RequestParam(name = "file") MultipartFile file, @PathVariable String email) {
		URI uri = service.FotoPerfil(file, email);
		// retorna o uri eo codigo http
		return ResponseEntity.created(uri).build();

	}

}
