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

import cpti.faeterj.api.dto.PeriodoDTO;
import cpti.faeterj.api.entity.Periodo;
import cpti.faeterj.api.services.PeriodoService;

@RestController
@RequestMapping("/periodo")
public class PeriodoController {

	@Autowired
	PeriodoService service;

	
	//Especifica que o seu metodo é um tipo de requisição get
	@GetMapping()
	public 	ResponseEntity<?> Periodo() {
	
		List<Periodo> obj = service.findAllObj();
		
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?>  ProcurarPeriodoPorId(@PathVariable Long id) {
		
		Periodo obj = service.FindByIdObj(id);
		return ResponseEntity.ok(obj);

	}
	
	@PostMapping()
	public ResponseEntity<?> PublicarPeriodo(@RequestBody PeriodoDTO objDTO) { //Vai receber uma req com um json no corpo e converte para um obj
		Periodo obj = service.FromDTO(objDTO);
		service.InserirObj(obj);	

		//obtem o retorno da url do objeto
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@PostMapping("/adicionardisciplina")
	public ResponseEntity<?> PublicarPeriodoDepois(@RequestBody PeriodoDTO objDTO) { //Vai receber uma req com um json no corpo e converte para um obj
		Periodo obj = service.FromDTO(objDTO);
		service.InserirObj(obj);	
		
		//obtem o retorno da url do objeto
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> DeletarPeriodo(@PathVariable Long id  ) {
		
			service.DeleteObj(id);
			return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public void AtualizarPeriodo(@PathVariable Long id, @RequestBody Periodo obj) {
		
		obj.setId(id);
		service.UpdateObj(obj);
		
	}
	
}
