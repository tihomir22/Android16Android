package com.simarro.practica.aplicacion16;

public class Tarea {

    private String nombre;
    private String hora;

    public Tarea(String nombre, String hora) {
        this.nombre = nombre;
        this.hora = hora;
    }

    public Tarea(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return this.nombre+","+this.hora;
    }
}
