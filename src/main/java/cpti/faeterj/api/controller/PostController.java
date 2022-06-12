package cpti.faeterj.api.controller;

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

import cpti.faeterj.api.entity.Post;
import cpti.faeterj.api.services.PostService;

@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostService service;

	//Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public 	ResponseEntity<?> Post() {
		List<Post> obj = service.findAllObj();
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?>  ProcurarPostPorId(@PathVariable Long id) {
		Post obj = service.FindByIdObj(id);
		return ResponseEntity.ok(obj);
	}
	
	@PostMapping()
	public ResponseEntity<?> PublicarPost(@RequestBody Post obj ) { //Vai receber uma req com um json no corpo e converte para um obj
		service.InserirObj(obj);	
		//obtem o retorno da url do objeto
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> DeletarPost(@PathVariable Long id  ) {
			service.DeleteObj(id);
			return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public void AtualizarPost(@PathVariable Long id, @RequestBody Post obj) {
		obj.setId(id);
		service.UpdateObj(obj);
	}
}
