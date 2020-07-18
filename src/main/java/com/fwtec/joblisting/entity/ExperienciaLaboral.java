package com.fwtec.joblisting.entity;

import java.io.Serializable;
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
@Table(name = "experiencia_laboral")
@Data
public class ExperienciaLaboral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idexperiencia_laboral")
    private Integer idexperienciaLaboral;
    @Column(name = "puesto")
    private String puesto;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "periodo_mes_inicio")
    private String periodoMesInicio;
    @Column(name = "periodo_anio_inicio")
    @Temporal(TemporalType.DATE)
    private Date periodoAnioInicio;
    @Column(name = "periodo_mes_fin")
    private String periodoMesFin;
    @Column(name = "periodo_anio_fin")
    @Temporal(TemporalType.DATE)
    private Date periodoAnioFin;
    @Lob
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "candidato_id", referencedColumnName = "idcandidato")
    @ManyToOne
    private Candidato candidatoId;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Integer idexperienciaLaboral) {
        this.idexperienciaLaboral = idexperienciaLaboral;
    }

    public Integer getIdexperienciaLaboral() {
        return idexperienciaLaboral;
    }

    public void setIdexperienciaLaboral(Integer idexperienciaLaboral) {
        this.idexperienciaLaboral = idexperienciaLaboral;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPeriodoMesInicio() {
        return periodoMesInicio;
    }

    public void setPeriodoMesInicio(String periodoMesInicio) {
        this.periodoMesInicio = periodoMesInicio;
    }

    public Date getPeriodoAnioInicio() {
        return periodoAnioInicio;
    }

    public void setPeriodoAnioInicio(Date periodoAnioInicio) {
        this.periodoAnioInicio = periodoAnioInicio;
    }

    public String getPeriodoMesFin() {
        return periodoMesFin;
    }

    public void setPeriodoMesFin(String periodoMesFin) {
        this.periodoMesFin = periodoMesFin;
    }

    public Date getPeriodoAnioFin() {
        return periodoAnioFin;
    }

    public void setPeriodoAnioFin(Date periodoAnioFin) {
        this.periodoAnioFin = periodoAnioFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Candidato getCandidatoId() {
        return candidatoId;
    }

    public void setCandidatoId(Candidato candidatoId) {
        this.candidatoId = candidatoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idexperienciaLaboral != null ? idexperienciaLaboral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExperienciaLaboral)) {
            return false;
        }
        ExperienciaLaboral other = (ExperienciaLaboral) object;
        if ((this.idexperienciaLaboral == null && other.idexperienciaLaboral != null) || (this.idexperienciaLaboral != null && !this.idexperienciaLaboral.equals(other.idexperienciaLaboral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ExperienciaLaboral[ idexperienciaLaboral=" + idexperienciaLaboral + " ]";
    }
    
}
