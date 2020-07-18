package com.fwtec.joblisting.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "municipio")
@Data
public class Municipio implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmunicipio")
    private Integer idmunicipio;
    
    @Column(name = "nombre")
    private String nombre;
    
//    @OneToMany(mappedBy = "municipioId")
//    private List<Vacante> vacanteList;
    
    @RestResource(exported = false)
    @JoinColumn(name = "estado_id", referencedColumnName = "idestado")
    @ManyToOne
    private Estado estadoId;
    
//    @RestResource(exported = false)
//    @OneToMany(mappedBy = "municipioId")
//    private List<Direccion> direccionList;
//    
//    @RestResource(exported = false)
//    @OneToMany(mappedBy = "municipioId")
//    private List<Candidato> candidatoList;

}
