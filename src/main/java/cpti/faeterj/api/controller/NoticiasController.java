package cpti.faeterj.api.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cpti.faeterj.api.entity.Noticias;
import cpti.faeterj.api.entity.service.repository.NoticiasRepository;
import cpti.faeterj.api.services.NoticiasService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/noticias")
public class NoticiasController {

	@Autowired
	NoticiasService service;

	
	//Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public 	ResponseEntity<?> Noticias() {
	
		List<Noticias> obj = service.findAllObj();
		
		return ResponseEntity.ok(obj);
	}
	
	@PostMapping()
	public ResponseEntity<?> PublicarNotica(@RequestBody Noticias obj ) { //Vai receber uma req com um json no corpo e converte para um obj
	
		service.InserirObj(obj);	

		//obtem o retorno da url do objeto
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping
	public ResponseEntity<?> DeletarNoticia() {
		
		
	}
	
}
