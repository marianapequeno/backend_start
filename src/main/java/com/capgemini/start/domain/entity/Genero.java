package com.capgemini.start.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_genero")
public class Genero {
	
	@EqualsAndHashCode.Include
	@Id
	@Column(name="ID_GENERO")
	private Long id;
	
	@Column(name="DS_GENERO", nullable = false)
	private String descricao;
	
	@Column(name="DT_INCLUSAO", nullable = false)
	private Date dataInclusao;
	
	@Column(name="DT_ALTERACAO", nullable = false)
	private Date dataAlteracao;
	
}
