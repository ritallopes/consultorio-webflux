package br.ufrn.imd.ritallopes.consultorio.model;

/**
 * 
 */

import lombok.*;

/**
 * @author Rita Lopes
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Paciente{
	
	
	private String cpf;
	private String nome;
	private String telefone;	
	private String convenio;
	private String dataCadastro;
	
	public String toString() {
		return ("CPF:"+this.cpf+", Nome: "+this.nome+", Telefone:"+this.telefone+","+" Convenio: "+this.convenio+", data de Cadastro: "+this.dataCadastro);
	}
}