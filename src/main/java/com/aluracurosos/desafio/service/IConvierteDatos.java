package com.aluracurosos.desafio.service;

public interface IConvierteDatos {
    <T> T obtenerDatos (String json, Class<T> clase);
}
