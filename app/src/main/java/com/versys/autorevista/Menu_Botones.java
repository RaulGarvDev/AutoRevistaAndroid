package com.versys.autorevista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Botones extends AppCompatActivity {

   private Button boton_web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_botones);

        boton_web = findViewById(R.id.boton_web);


        boton_web.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(Menu_Botones.this, WebView.class);
                startActivity(intent);
                finish();
            }
        });


    }
}