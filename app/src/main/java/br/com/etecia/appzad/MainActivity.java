package br.com.etecia.appzad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.janela_dois_layout);

        btnEntrar = (Button) findViewById(R.id.btnEntrarJanela2);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Caiu nu Beiti gueguegue", Toast.LENGTH_SHORT) .show();

                startActivity(new Intent(getApplicationContext(), JanelaDois_Activity.class));
            }
        });



    }
}
