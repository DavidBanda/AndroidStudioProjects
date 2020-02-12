package com.example.eva1_4_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MieventoClick implements View.OnClickListener {

    private Context context;

    @Override
    public void onClick(View view) {
        Toast.makeText(context, "Evento por clase externa",
                Toast.LENGTH_LONG).show();
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
