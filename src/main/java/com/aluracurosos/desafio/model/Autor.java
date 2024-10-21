package com.aluracurosos.desafio.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Autor {
    private String nombre;
    private Integer fechaDeNacimiento;
    private Integer fechaDeFallecimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Integer fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getFechaDeFallecimiento() {
        return fechaDeFallecimiento;
    }

    public void setFechaDeFallecimiento(Integer fechaDeFallecimiento) {
        this.fechaDeFallecimiento = fechaDeFallecimiento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", fechaDeFallecimiento=" + fechaDeFallecimiento +
                '}';
    }
}
