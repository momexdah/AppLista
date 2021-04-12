package unc.edu.applista.modelo;

import java.io.Serializable;

public class Facultades implements Serializable {
    private String titulo;
    private int indice;
    private String descripcion;

    public Facultades(String titulo, int indice, String descripcion) {
        this.titulo = titulo;
        this.indice = indice;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
