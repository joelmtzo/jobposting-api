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
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

/**
 *
 * @author flexware
 */
@Entity
@Table(name = "publicante")
@Data
public class Publicante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpublicante")
    private Integer idpublicante;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "telefono")
    private String telefono;
    
//    @OneToMany(mappedBy = "publicanteId")
//    private List<Vacante> vacanteList;
    
    @JoinColumn(name = "tipopublicante_id", referencedColumnName = "idtipo_publicante")
    @ManyToOne
    private TipoPublicante tipopublicanteId;
    
    @JoinColumn(name = "usuario_id", referencedColumnName = "idusuario")
    @ManyToOne
    private Usuario usuarioId;

    
}
