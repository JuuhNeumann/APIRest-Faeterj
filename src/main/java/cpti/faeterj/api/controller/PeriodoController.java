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
		
		List<PeriodoDTO> obj = service.findAllObj();
		return ResponseEntity.ok(obj);
	}
	

	

	
}
