package com.aluracurosos.desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class Libro {
    private String tiutlo;
    private List<Autor> autores;
    private List<String> idiomas;
    private Integer descargas;

    public String getTiutlo() {
        return tiutlo;
    }

    public void setTiutlo(String tiutlo) {
        this.tiutlo = tiutlo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getDescargas() {
        return descargas;
    }

    public void setDescargas(Integer descargas) {
        this.descargas = descargas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "tiutlo='" + tiutlo + '\'' +
                ", autores=" + autores +
                ", idiomas=" + idiomas +
                ", descargas=" + descargas +
                '}';
    }
}
