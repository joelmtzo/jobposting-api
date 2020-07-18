package com.fwtec.joblisting.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.Data;

/**
 *
 * @author flexware
 */
@Entity
@Table(name = "estado")
@Data
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idestado")
	private Integer idestado;

	@Column(name = "nombre")
	private String nombre;

//    @OneToMany(mappedBy = "estadoId")
//    private List<Municipio> municipioList;

}
