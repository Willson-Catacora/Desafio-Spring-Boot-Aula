package com.aluracurosos.desafio.principal;

import com.aluracurosos.desafio.model.Datos;
import com.aluracurosos.desafio.model.DatosLibro;
import com.aluracurosos.desafio.service.ConsumirAPI;
import com.aluracurosos.desafio.service.ConvierteDatos;

import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    private Scanner sc = new Scanner(System.in);
    private String URL_BASE = "http://gutendex.com/books/";

    private ConsumirAPI consumoAPI = new ConsumirAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();
    private boolean sw = true;
    private Integer opcion;

    public void mostrarMenu() {
//        System.out.println("hola mundo desde sprin boot");
        do {
            System.out.println("================================================");
            System.out.println("\t\tIntroduzca una de las opcion");
            System.out.println("================================================");
            System.out.println("1) Top 10 de los libros mas descargados");
            System.out.println("2) Busqueda de libros por titulo");
            System.out.println("3) Busqueda de libros por autor");
            System.out.println("4) Salir");
            System.out.println("================================================");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    top10();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    sw = false;
                    break;
                default:
                    System.out.println("Introduzca una opcion valida por favor.....");
            }
        } while (sw);
    }

    public void top10() {
        var json = consumoAPI.obtenerDatos(URL_BASE);
        var datos = convierteDatos.obtenerDatos(json, Datos.class);

        System.out.println("\n\t\tTOP 10 DE LOS LIBROS MAS DESCARGADOS");
        System.out.println("================================================");
        datos.libros().stream()
                .sorted(Comparator.comparing(DatosLibro::descargas).reversed())
                .limit(10)
                .forEach(e -> {
                    System.out.println("\t" + e.tiutlo() + ",\t Descargados: " + e.descargas());
                });
    }
}
