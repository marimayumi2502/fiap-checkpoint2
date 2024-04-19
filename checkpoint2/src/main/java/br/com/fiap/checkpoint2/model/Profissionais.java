package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "profissionais")
public class Profissionais extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, length = 30)
	private String nome;
	
	@Column(name = "especialidade", nullable = false, length = 30)
	private String especialidade;
	
	@Column(name = "valor_hora", columnDefinition = "NUMERIC(15, 2)")
	private BigDecimal valorHora;
	
}
