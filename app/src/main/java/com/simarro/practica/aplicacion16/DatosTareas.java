package com.simarro.practica.aplicacion16;

import java.util.ArrayList;

public class DatosTareas {
    static ArrayList<Tarea>LISTATAREAS=new ArrayList<>();
    static{
        LISTATAREAS.add(new Tarea("Correr 30 minutos en las sabanas","08:00"));
        LISTATAREAS.add(new Tarea("Programar para pmm","08:30"));;
        LISTATAREAS.add(new Tarea("Hackiar redes wifi de los vecinos","10:30"));
        LISTATAREAS.add(new Tarea("Entrar en la deep web","11:30"));
        LISTATAREAS.add(new Tarea("Correr de la policia","13:30"));
    }

}
