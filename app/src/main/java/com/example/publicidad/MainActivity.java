package com.example.publicidad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnOpenSecondActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PermisosGPS.class);
                startActivity(intent);
            }
        });
        LinearLayout linearLayout = findViewById(R.id.interno);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes agregar el código que deseas ejecutar cuando se hace clic en el LinearLayout.
                // Por ejemplo, puedes iniciar una nueva actividad o mostrar un mensaje.
                Toast.makeText(getApplicationContext(), "¡Haz hecho clic en el LinearLayout!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
