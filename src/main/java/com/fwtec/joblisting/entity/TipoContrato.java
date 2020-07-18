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

import lombok.Data;

/**
 *
 * @author flexware
 */
@Entity
@Table(name = "tipo_contrato")
@Data
public class TipoContrato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_contrato")
    private Integer idtipoContrato;
    @Column(name = "descripcion")
    private String descripcion;
    
//    @OneToMany(mappedBy = "tipocontratoId")
//    private List<Vacante> vacanteList;

    }
