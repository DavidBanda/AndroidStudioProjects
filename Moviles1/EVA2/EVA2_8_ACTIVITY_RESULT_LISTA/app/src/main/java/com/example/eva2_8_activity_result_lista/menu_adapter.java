package com.example.eva2_8_activity_result_lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class menu_adapter extends ArrayAdapter<Menu> {

    Context context;
    int resource;
    Menu[] mMenu;


    public menu_adapter(Context context, int resource, Menu[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.mMenu = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgComida;
        TextView txtVwUp, txtVwDown;

        //convertview es el layou que respresenta una fila en la lista
        if(convertView == null) {
            //Crear nuestro layout
            //Inflater
            LayoutInflater llInflator = ((Activity)context).getLayoutInflater();
            convertView = llInflator.inflate(resource, parent, false);
        }

        imgComida = convertView.findViewById(R.id.imageView4);
        txtVwUp = convertView.findViewById(R.id.textView8);
        txtVwDown = convertView.findViewById(R.id.textView6);

        imgComida.setImageResource(mMenu[position].getImg());
        txtVwUp.setText(mMenu[position].getTxtUp());
        txtVwDown.setText(mMenu[position].getTxtDown());


        return convertView;
    }
}
