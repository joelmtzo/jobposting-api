package com.fwtec.joblisting.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.Data;

/**
 *
 * @author flexware
 */

@Entity
@Table(name = "candidato")
@Data
public class Candidato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idcandidato")
	private Integer idcandidato;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "expectativa_salarial")
	private BigDecimal expectativaSalarial;
	
	@OneToMany(mappedBy = "candidatoId")
	private List<ExperienciaLaboral> experienciaLaboralList;
	
	@JoinColumn(name = "nivelacademico_id", referencedColumnName = "idnivel_academico")
	@ManyToOne
	private NivelAcademico nivelacademicoId;
	
	@JoinColumn(name = "municipio_id", referencedColumnName = "idmunicipio")
	@ManyToOne
	private Municipio municipioId;
	
	@JoinColumn(name = "usuario_id", referencedColumnName = "idusuario")
	@ManyToOne
	private Usuario usuarioId;
	
	@JoinColumn(name = "categoria_id", referencedColumnName = "idcategoria")
	@ManyToOne
	private Categoria categoriaId;
	
}
