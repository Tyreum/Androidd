package br.com.etecia.appzad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class JanelaDois_Activity extends AppCompatActivity {

    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_dois_layout);
        setContentView(R.layout.activity_main);

        btnVoltar = (Button) findViewById(R.id.btnVoltarJanela1);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ae Lek", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(getApplicationContext(), JanelaDois_Activity.class));
            }
        });
    }
}
