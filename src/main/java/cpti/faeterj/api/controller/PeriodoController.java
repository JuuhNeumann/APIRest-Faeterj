package cpti.faeterj.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cpti.faeterj.api.dto.PeriodoDTO;
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
