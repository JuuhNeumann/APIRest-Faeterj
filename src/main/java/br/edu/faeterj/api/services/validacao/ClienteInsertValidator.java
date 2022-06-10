package br.edu.faeterj.api.services.validacao;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.faeterj.api.controller.exception.FieldMessage;
import br.edu.faeterj.api.dto.NewAlunoDTO;
import br.edu.faeterj.api.entity.Aluno;
import br.edu.faeterj.api.repositories.AlunoRepository;

public class ClienteInsertValidator implements ConstraintValidator<ClienteInsert2, NewAlunoDTO> {

	@Autowired
	private AlunoRepository repo;

	@Override
	public void initialize(ClienteInsert2 ann) {
	}

	@Override
	public boolean isValid(NewAlunoDTO objDto, ConstraintValidatorContext context) {

		List<FieldMessage> list = new ArrayList<>();

		Aluno aux = repo.findByEmail(objDto.getEmail());
		if (aux != null) {
			list.add(new FieldMessage("email", "Email já existente"));
		}

		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}