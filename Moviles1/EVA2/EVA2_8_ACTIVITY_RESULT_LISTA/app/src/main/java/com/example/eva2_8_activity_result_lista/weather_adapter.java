package com.example.eva2_8_activity_result_lista;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class weather_adapter extends ArrayAdapter<Clima> {

    Context context;
    int resource;
    Clima[] cCiudades;

    public weather_adapter(Context context, int resource, Clima[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.cCiudades = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgClima;
        TextView txtVwCiudad, txtVwTemp, txtVwClima;

        //convertview es el layou que respresenta una fila en la lista
        if (convertView == null) {
            //Crear nuestro layout
            //Inflater
            LayoutInflater llInflator = ((Activity) context).getLayoutInflater();
            convertView = llInflator.inflate(resource, parent, false);
        }

        imgClima = convertView.findViewById(R.id.imageView);
        txtVwCiudad = convertView.findViewById(R.id.textView1);
        txtVwTemp = convertView.findViewById(R.id.textView2);
        txtVwClima = convertView.findViewById(R.id.textView3);

        imgClima.setImageResource(cCiudades[position].getImagen());
        txtVwCiudad.setText(cCiudades[position].getCiudad());
        txtVwTemp.setText(cCiudades[position].getTemp() + "ºC");
        txtVwClima.setText(cCiudades[position].getClima());


        return convertView;
    }
}
