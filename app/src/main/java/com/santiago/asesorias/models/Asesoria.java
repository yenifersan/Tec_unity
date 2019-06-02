package com.santiago.asesorias.models;

public class Asesoria {

private int idAsesoria;
private String tituloAsesoria;
private String descripcionAsesoria;
private String etiquetaAsesoria;
private String estadoAsesoria;
private String tipoAsesoria;
private String curso;
private String horario;

    public int getIdAsesoria() {
        return idAsesoria;
    }

    public void setIdAsesoria(int idAsesoria) {
        this.idAsesoria = idAsesoria;
    }

    public String getTituloAsesoria() {
        return tituloAsesoria;
    }

    public void setTituloAsesoria(String tituloAsesoria) {
        this.tituloAsesoria = tituloAsesoria;
    }

    public String getDescripcionAsesoria() {
        return descripcionAsesoria;
    }

    public void setDescripcionAsesoria(String descripcionAsesoria) {
        this.descripcionAsesoria = descripcionAsesoria;
    }

    public String getEtiquetaAsesoria() {
        return etiquetaAsesoria;
    }

    public void setEtiquetaAsesoria(String etiquetaAsesoria) {
        this.etiquetaAsesoria = etiquetaAsesoria;
    }

    public String getEstadoAsesoria() {
        return estadoAsesoria;
    }

    public void setEstadoAsesoria(String estadoAsesoria) {
        this.estadoAsesoria = estadoAsesoria;
    }

    public String getTipoAsesoria() {
        return tipoAsesoria;
    }

    public void setTipoAsesoria(String tipoAsesoria) {
        this.tipoAsesoria = tipoAsesoria;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Asesoria{" +
                "idAsesoria=" + idAsesoria +
                ", tituloAsesoria='" + tituloAsesoria + '\'' +
                ", descripcionAsesoria='" + descripcionAsesoria + '\'' +
                ", etiquetaAsesoria='" + etiquetaAsesoria + '\'' +
                ", estadoAsesoria='" + estadoAsesoria + '\'' +
                ", tipoAsesoria='" + tipoAsesoria + '\'' +
                ", curso='" + curso + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
