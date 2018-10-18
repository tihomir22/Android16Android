package com.simarro.practica.aplicacion16;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MiArrayAdapter<T> extends ArrayAdapter<T> {

    public MiArrayAdapter(Context context, ArrayList<T> resource) {
        super(context,0,resource);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        //obteniendo una instancia del inflater
        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Salvando la referencia de la fila
        View listaItemView=convertView;
        //Comprobando si el view no existe
        if(null==convertView){
            listaItemView=inflater.inflate(
                    android.R.layout.two_line_list_item,parent,false
            );

        }
        //Obteniendo isntancias de los text views

        TextView titulo=(TextView)listaItemView.findViewById(android.R.id.text1);
        TextView subtitulo=(TextView)listaItemView.findViewById(android.R.id.text2);


        //Obteniendo instancia de la tarea en posicion actual
        T item=(T)getItem(position);

        //Dividir la cadena en Nombre y Hora
        String [] subCadena;
        String delimitador=",";
        String cadenaBruta;

        subCadena=item.toString().split(delimitador,2);

        titulo.setText(subCadena[0]);
        subtitulo.setText(subCadena[1]);

        return listaItemView;
    }
}
