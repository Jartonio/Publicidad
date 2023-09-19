package com.example.publicidad;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.LinearLayout;
import android.widget.Toast;

public class PermisosGPS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.permisos_gps);

        findViewById(R.id.btnCloseSecondActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra la actividad actual y vuelve a la pantalla principal.
            }
        });



    }
}
