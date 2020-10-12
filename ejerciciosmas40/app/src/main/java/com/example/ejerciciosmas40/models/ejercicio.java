package com.example.ejerciciosmas40.models;

public class ejercicio {
    private String nombre;
    private String id;
    private String descripcion;
    private String dificultad;
    private String categoria;

    public ejercicio(String nombre, String id, String descripcion, String dificultad, String categoria) {
        this.nombre = nombre;
        this.id = id;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
        this.categoria = categoria;
    }

    public ejercicio(){

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
