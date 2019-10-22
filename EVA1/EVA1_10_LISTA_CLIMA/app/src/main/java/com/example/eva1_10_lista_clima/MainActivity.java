package com.example.eva1_10_lista_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    Clima[] cCiudades = {
            new Clima(),
            new Clima(R.drawable.atmospher, "Aldama", 40, "Chido"),
            new Clima(R.drawable.sunny, "Chihuahua", 25, "Lluvioso"),
            new Clima(R.drawable.cloudy, "Delicias", 36, "Nevado"),
            new Clima(R.drawable.snow, "Parral", 13, "Calor"),
            new Clima(R.drawable.rainy, "Juarez", 22, "Nublado"),
            new Clima(R.drawable.thunderstorm, "Pto. Vallarta", 12, "Tormenta"),
            new Clima(R.drawable.tornado, "Cancun", 17, "Trueno"),
            new Clima(R.drawable.light_rain, "Camargo", 25, "Lluvio intensa"),
    };

    ListView lstClima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstClima = findViewById(R.id.lstView);
        lstClima.setAdapter(new weather_adapter(
                this,
                R.layout.layout_clima,
                cCiudades));
        lstClima.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, cCiudades[i].getCiudad(), Toast.LENGTH_LONG).show();
    }
}
