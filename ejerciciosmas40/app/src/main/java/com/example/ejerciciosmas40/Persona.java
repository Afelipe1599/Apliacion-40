package com.example.ejerciciosmas40;

public class Persona {
    private int id,altura,frecuencia,edad;
    private String nombre, dificultad, ej_deseado;
    private float peso;
    private boolean equipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getEj_deseado() {
        return ej_deseado;
    }

    public void setEj_deseado(String ej_deseado) {
        this.ej_deseado = ej_deseado;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isEquipo() {
        return equipo;
    }

    public void setEquipo(boolean equipo) {
        this.equipo = equipo;
    }

    public Persona(int id, int altura, int frecuencia, int edad, String nombre, String dificultad, String ej_deseado, float peso, boolean equipo) {
        this.id = id;
        this.altura = altura;
        this.frecuencia = frecuencia;
        this.edad = edad;
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.ej_deseado = ej_deseado;
        this.peso = peso;
        this.equipo = equipo;
    }
}
