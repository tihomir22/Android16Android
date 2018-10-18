package com.simarro.practica.aplicacion16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    MiArrayAdapter<Tarea>adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=findViewById(R.id.lista);

        adaptador=new MiArrayAdapter<Tarea>(this,DatosTareas.LISTATAREAS);
        lista.setAdapter(adaptador);
    }
}
