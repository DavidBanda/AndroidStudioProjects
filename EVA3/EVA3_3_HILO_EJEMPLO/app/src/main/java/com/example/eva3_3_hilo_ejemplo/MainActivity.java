package com.example.eva3_3_hilo_ejemplo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {


    ImageView imgV;
    Bitmap imagen = null;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);

            imgV.setImageBitmap(imagen);
        }
    };

    Thread hilo = new Thread() {
        @Override
        public void run() {
            super.run();

            imagen = cargarImagen("https://i.pinimg.com/originals/84/dd/ee/84ddee6dff0e2af20754826aecbc5c11.jpg");
            Message msg = handler.obtainMessage();
            handler.sendMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgV = findViewById(R.id.imageView);
        hilo.start();
        // Bitmap bitmap = cargarImagen("https://i.pinimg.com/originals/84/dd/ee/84ddee6dff0e2af20754826aecbc5c11.jpg");
        // imgV.setImageBitmap(bitmap);
    }

    private Bitmap cargarImagen(String url) {
        Bitmap imagen = null;
        try {
            InputStream input = (InputStream) new URL(url).getContent();
            imagen = BitmapFactory.decodeStream(input);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return imagen;
    }
}
