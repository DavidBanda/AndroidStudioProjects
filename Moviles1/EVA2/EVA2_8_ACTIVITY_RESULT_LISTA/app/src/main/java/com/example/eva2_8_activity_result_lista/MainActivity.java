package com.example.eva2_8_activity_result_lista;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnClima;
    Intent lanzarClima;
    Button bntRest;
    Intent lanzarRest;
    ImageView imgV;
    TextView txt1, txt2, txt3, txt4;
    private Uri uriContact;
    private String contactID;
    private String phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClima = findViewById(R.id.button);
        lanzarClima = new Intent(this, MainActivityClima.class);
        bntRest = findViewById(R.id.button2);
        lanzarRest = new Intent(this, MainActivityMenu.class);

        imgV = findViewById(R.id.imageView);
        txt1 = findViewById(R.id.textView1);
        txt2 = findViewById(R.id.textView2);
        txt3 = findViewById(R.id.textView3);
        txt4 = findViewById(R.id.textView4);
    }

    public void onClick(View v) {
        ComponentName cn = new ComponentName("com.example.eva1_10_lista_clima", "com.example.eva1_10_lista_clima.MainActivity");
        Intent in = new Intent(Intent.ACTION_MAIN);
        in.setComponent(cn);
        startActivityForResult(in, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000) {
            if (resultCode == Activity.RESULT_OK) {
                //Toast.makeText(this,  data.getStringExtra("ciudad"), Toast.LENGTH_SHORT).show();
                txt1.setText(data.getStringExtra("ciudad"));
                txt2.setText(data.getStringExtra("temp") + "ºC");
                txt3.setText(data.getStringExtra("clima"));
                int intImg = data.getIntExtra("img", R.drawable.cloudy);
                //int intImg = Integer.parseInt(data.getStringExtra("img"));
                imgV.setImageResource(intImg);
            }
        } else if (requestCode == 2000) {
            if (resultCode == Activity.RESULT_OK) {
                // Toast.makeText(this, data.getDataString(), Toast.LENGTH_LONG).show();
                //SE ADQUIERE EL ID DEL CONTACTO
                String datos = data.getDataString();

                //OBTENER EL NUMERO
                uriContact = data.getData();
                phoneNumber = retrieveContactNumber();
                txt4.setText(phoneNumber);

            }
        } else if (requestCode == 1100) {
            if (resultCode == Activity.RESULT_OK) {
                //Toast.makeText(this,  data.getStringExtra("menu"), Toast.LENGTH_SHORT).show();
                txt1.setText(data.getStringExtra("txt1"));
                txt2.setText(data.getStringExtra("txt2"));
                int intImg = data.getIntExtra("img", R.drawable.cloudy);
                imgV.setImageResource(intImg);
            }
        }
    }


    public void onClickCont(View v) {
        Intent in = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        startActivityForResult(in, 2000);
    }

    public void sendRest(View v) {
        startActivityForResult(lanzarRest, 1100);
    }

    public void llamar(View v) {
        String numero = "tel:" + phoneNumber;
        //URI: uniform resource identificator
        Intent marcar = new Intent(Intent.ACTION_CALL, Uri.parse(numero));
        if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    Activity#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for Activity#requestPermissions for more details.
            return;
        }
        startActivity(marcar);
    }

    private String retrieveContactNumber() {

        String contactNumber = null;

        // getting contacts ID
        Cursor cursorID = getContentResolver().query(uriContact,
                new String[]{ContactsContract.Contacts._ID},
                null, null, null);

        if (cursorID.moveToFirst()) {

            contactID = cursorID.getString(cursorID.getColumnIndex(ContactsContract.Contacts._ID));
        }

        cursorID.close();

        // Using the contact ID now we will get contact phone number
        Cursor cursorPhone = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                new String[]{ContactsContract.CommonDataKinds.Phone.NUMBER},

                ContactsContract.CommonDataKinds.Phone.CONTACT_ID + " = ? AND " +
                        ContactsContract.CommonDataKinds.Phone.TYPE + " = " +
                        ContactsContract.CommonDataKinds.Phone.TYPE_MOBILE,

                new String[]{contactID},
                null);

        if (cursorPhone.moveToFirst()) {
            contactNumber = cursorPhone.getString(cursorPhone.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
        }

        cursorPhone.close();
        return contactNumber;
    }
}
