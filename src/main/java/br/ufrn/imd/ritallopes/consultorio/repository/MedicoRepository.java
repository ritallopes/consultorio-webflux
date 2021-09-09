/**
 * @author Rita Lopes
 */
package br.ufrn.imd.ritallopes.consultorio.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import br.ufrn.imd.ritallopes.consultorio.model.Medico;

@Repository
@EnableR2dbcRepositories
public interface MedicoRepository extends ReactiveCrudRepository<Medico, String>{

}
