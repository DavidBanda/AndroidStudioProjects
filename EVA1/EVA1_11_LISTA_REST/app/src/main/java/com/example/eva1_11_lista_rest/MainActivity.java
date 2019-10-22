package com.example.eva1_11_lista_rest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    Menu[] mMenu = {
            new Menu(),
            new Menu("Pizzas Italianissimo", "Pizzas Tradicionales", R.drawable.f2),
            new Menu("Cubano", "Tortas El Cubano", R.drawable.f1),
            new Menu("Pizza Hot", "Pizzas Caseras", R.drawable.f2),
            new Menu("Hamburguesas", "Clasicas", R.drawable.f3),
            new Menu("Hot Dogs", "Hot Dogs Gourmet", R.drawable.f1),
    };

    ListView lstMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstMenu = findViewById(R.id.lstview);
        lstMenu.setAdapter(new menu_adapter(
                this,
                R.layout.layout_rest,
                mMenu));
        lstMenu.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, mMenu[i].getTxtUp(), Toast.LENGTH_LONG).show();
    }
}
