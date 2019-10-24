package com.example.eva2_9_dialogos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEstandar(View v) {
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de dialogo estandar")
                .setMessage("Hola mundo curel")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),
                                        "Boton OK", Toast.LENGTH_LONG).show();
                            }
                        })
                .setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),
                                        "Boton NO", Toast.LENGTH_LONG).show();
                            }
                        })
                .setNeutralButton("CANCELAR",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),
                                        "Boton Cancelar", Toast.LENGTH_LONG).show();
                            }
                        })
                .create().show();
    }

    public void clickPropio(View v) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.layout_propio);

        //vincular los widgets del cuadro de texto

        final EditText edtTxtCaptu;
        Button btnok;

        edtTxtCaptu = dialog.findViewById(R.id.editText);
        btnok = dialog.findViewById(R.id.button3);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sCade = edtTxtCaptu.getText().toString();
                Toast.makeText(getApplicationContext(),
                        sCade, Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });
        dialog.show();
    }

}
