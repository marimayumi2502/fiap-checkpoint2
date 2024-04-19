package br.com.fiap.checkpoint2.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consultas extends AbstractEntity<Long> {

	@ManyToOne
	@JoinColumn(name = "paciente_id_fk", nullable = false)
	private Paciente paciente_id;
	
	@ManyToOne
	@JoinColumn(name = "endereco_id_fk", nullable = false)
	private Profissionais profissional_id;
	
	@Column (name = "data_consulta", nullable = false, length = 15)
	private LocalDate data_consulta;
	
	@Column(nullable = false, length = 2)
	@Enumerated(EnumType.STRING)
	@JdbcTypeCode(SqlTypes.CHAR)
	private StatusConsulta status_consulta;
	
	@Column(name = "valor_consulta", columnDefinition = "NUMERIC(15, 2)")
	private BigDecimal valorConsulta;
	
	@Column(name = "quantidade_horas", columnDefinition = "NUMERIC(15, 2)")
	private int quantidadeHoras;

}
