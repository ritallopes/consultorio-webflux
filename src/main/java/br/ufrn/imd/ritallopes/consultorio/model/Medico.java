package br.ufrn.imd.ritallopes.consultorio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

/**
 * @author Rita Lopes
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@With
@Table("medico")
public class Medico{
	
	@Id
	private String cpf;
	private String nome;
	private String telefone;
	private String crm;
	private String especialidade;
	private String dataContratacao;
	
	public String toString() {
		return ("CPF:"+this.cpf+", Nome: "+this.nome+", Telefone:"+this.telefone+" Data Cadastro: "+this.dataContratacao+","+" CRM: "+this.crm+", Especialidade: "+this.especialidade);
	}
}