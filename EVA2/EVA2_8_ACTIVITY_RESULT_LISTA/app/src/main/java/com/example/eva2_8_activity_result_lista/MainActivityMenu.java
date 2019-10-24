package com.example.eva2_8_activity_result_lista;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivityMenu extends AppCompatActivity implements ListView.OnItemClickListener {

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
        setContentView(R.layout.activity_main_menu);
        lstMenu = findViewById(R.id.lstView);
        lstMenu.setAdapter(new menu_adapter(
                this,
                R.layout.activity_menu_adapter,
                mMenu));
        lstMenu.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        // Toast.makeText(this, mMenu[i].getTxtUp(), Toast.LENGTH_LONG).show();
        Intent inDatos = new Intent();
        inDatos.putExtra("txt1", mMenu[i].getTxtUp());
        inDatos.putExtra("txt2", mMenu[i].getTxtDown());
        inDatos.putExtra("img", mMenu[i].getImg());
        setResult(Activity.RESULT_OK, inDatos);
        finish();
    }
}
