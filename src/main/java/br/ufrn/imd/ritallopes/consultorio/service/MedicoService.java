package br.ufrn.imd.ritallopes.consultorio.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.ufrn.imd.ritallopes.consultorio.model.Medico;
import br.ufrn.imd.ritallopes.consultorio.repository.MedicoRepository;
import lombok.Getter;
import reactor.core.publisher.Mono;

@Getter
@Service
public class MedicoService {
	@Autowired
	private MedicoRepository medicoRepository;
	
	public Mono<Medico> getMedicoByCpf(String cpf){
		return medicoRepository.findById(cpf);
	}
	
	public Flux<Medico> getMedicos(){
		ArrayList<Medico> m = new ArrayList();
		m.add(new Medico("sfsdf", "sfsdf","sfsdf","sfsdf","sfsdf", "sfsdf"));
		m.add(new Medico("asfasf", "sfsdf","sfsdf","sfsdf","sfsdf", "sfsdf"));

		return Flux.fromIterable(m);
	}
	
	public Mono<Medico> addMedico(Medico medico){
		
		return Mono.empty();
	}
	
	public Mono<Medico> updateMedicos(String cpf, Medico medicoAtualizado){
		/*Optional <Medico> p = medicoRepository.findById(cpf);
		if(!p.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Medico medico  = p.get();
		medico.setDataContratacao(medicoAtualizado.getDataContratacao());
		medico.setEspecialidade(medicoAtualizado.getEspecialidade());
		medico.setNome(medicoAtualizado.getNome());
		medico.setCrm(medicoAtualizado.getCrm());
		medico.setTelefone(medicoAtualizado.getTelefone());
		medicoRepository.save(medico);*/
		return getMedicoByCpf(cpf);
	}
	
	public Mono<Void> deleteMedico(String cpf){
		return medicoRepository.deleteById(cpf);
	}

}
