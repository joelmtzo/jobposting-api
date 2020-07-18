package com.fwtec.joblisting.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 *
 * @author flexware
 */
@Entity
@Table(name = "vacante")
@Data
public class Vacante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvacante")
    private Integer idvacante;
    @Lob
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "salario")
    private BigDecimal salario;
    @Column(name = "periodo_salario")
    private String periodoSalario;
    @Column(name = "fecha_publicacion")
    @Temporal(TemporalType.DATE)
    private Date fechaPublicacion;
    @Column(name = "fecha_contratacion")
    @Temporal(TemporalType.DATE)
    private Date fechaContratacion;
    @Column(name = "experiencia")
    private Integer experiencia;
    @Column(name = "rango_edad")
    private String rangoEdad;
    @Column(name = "cambio_residencia")
    private Boolean cambioResidencia;
    @Column(name = "puesto_remoto")
    private Boolean puestoRemoto;
    @Column(name = "vacante_destacada")
    private Boolean vacanteDestacada;
    @Column(name = "estatus")
    private Boolean estatus;
    @Column(name = "contador_visitas")
    private Integer contadorVisitas;
    @Column(name = "numero_vacantes")
    private Integer numeroVacantes;
    @Column(name = "adm_estatus")
    private Boolean admEstatus;
    @JoinColumn(name = "publicante_id", referencedColumnName = "idpublicante")
    @ManyToOne
    private Publicante publicanteId;
    @JoinColumn(name = "municipio_id", referencedColumnName = "idmunicipio")
    @ManyToOne
    private Municipio municipioId;
    @JoinColumn(name = "categoria_id", referencedColumnName = "idcategoria")
    @ManyToOne
    private Categoria categoriaId;
    @JoinColumn(name = "nivelacademico_id", referencedColumnName = "idnivel_academico")
    @ManyToOne
    private NivelAcademico nivelacademicoId;
    @JoinColumn(name = "tipocontrato_id", referencedColumnName = "idtipo_contrato")
    @ManyToOne
    private TipoContrato tipocontratoId;

    }
