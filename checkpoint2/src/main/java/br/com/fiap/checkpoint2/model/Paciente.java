package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente extends AbstractEntity<Long> {
	
	@Column(name = "nome", nullable = false, length = 60)
	private String nome;
	
	@Column(name = "endereco", nullable = false, length = 30)
	private String endereco;
	
	@Column(name = "bairro", nullable = false, length = 60)
	private String bairro;
	
	@Column(name = "email", nullable = false, length = 30)
	private String email;
	
	@Column(columnDefinition = "DATE")
	private LocalDate data_nascimento;
	
	@Column(name = "telefone", nullable = false, length = 8)
	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
