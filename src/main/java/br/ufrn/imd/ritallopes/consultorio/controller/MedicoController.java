package br.ufrn.imd.ritallopes.consultorio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufrn.imd.ritallopes.consultorio.model.Medico;
import br.ufrn.imd.ritallopes.consultorio.service.MedicoService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/medico")
public class MedicoController {
	
	@Autowired
	private MedicoService service;
	
	@GetMapping
	public Flux<Medico> getMedicos() {
		return service.getMedicos();
	}
	@GetMapping("{cpf}")
	public Mono<Medico> getMedicoByCpf(@PathVariable String cpf) {
		return service.getMedicoByCpf(cpf);
	}
	
	@PostMapping
	public Mono<Medico> addMedico(@RequestBody Medico medico) {
		return service.addMedico(medico);
	}
	
	@PutMapping("{cpf}")
	public Mono<Medico> updateMedico(@PathVariable String cpf, @RequestBody Medico medico) {
		return service.updateMedicos(cpf, medico);
	}
	
	
	@DeleteMapping("{cpf}")
	public Mono<Void> deleteMedico(@PathVariable String cpf) {
		return service.deleteMedico(cpf);
	}
	
	

}