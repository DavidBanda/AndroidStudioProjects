package com.example.eva2_3_mensaje_txt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent inSms;
    EditText edtTxtTel, edtTxtMensa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTxtTel = findViewById(R.id.txtNum);
        edtTxtMensa = findViewById(R.id.txtMensaje);
    }

    public void onClick(View v) {
        String sTel = "smsto:" + edtTxtTel.getText().toString();
        inSms = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
        inSms.putExtra("sms_body", edtTxtMensa.getText().toString());
        startActivity(inSms);
    }
}
