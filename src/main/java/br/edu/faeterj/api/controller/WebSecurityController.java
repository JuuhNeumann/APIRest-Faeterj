package br.edu.faeterj.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.faeterj.api.entity.Aluno;
import br.edu.faeterj.api.entity.Endereco;
import br.edu.faeterj.api.services.AlunoService;
import br.edu.faeterj.api.services.EnderecoService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/security")
public class WebSecurityController {

	@Autowired
	AlunoService clienteService;

	@Autowired
	EnderecoService enderecoService;

	@ApiOperation(value = "Retorna todos as info de clientes (voce precisa estar autenticado)")
	@GetMapping("/clientes")
	public ResponseEntity<List<Aluno>> lista() {
		List<Aluno> cli = new ArrayList<Aluno>();

		cli = clienteService.findAll();
		return ResponseEntity.ok(cli);

	}
	// aa




	@ApiOperation(value = "Retorna uma lista com todos os endereços cadastrados(preicsa estar autenticado")
	@GetMapping("/endereco")
	public ResponseEntity<List<Endereco>> findAll() {
		List<Endereco> end = new ArrayList<>();
		end = enderecoService.findAll();

		return ResponseEntity.ok(end);

	}

}
