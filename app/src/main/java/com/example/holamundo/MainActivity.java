package com.example.holamundo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextA, editTextB, editTextC, editTextD;
    Button buttonComplejos;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //relacionando parte visual con la clase en JAVA
        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        editTextC = findViewById(R.id.editTextC);
        editTextD = findViewById(R.id.editTextD);
        buttonComplejos = findViewById(R.id.buttonComplejos);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonComplejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(editTextA.getText().toString());
                Double b = Double.parseDouble(editTextB.getText().toString());
                Double c = Double.parseDouble(editTextC.getText().toString());
                Double d = Double.parseDouble(editTextD.getText().toString());

                Complejos complejos = new Complejos(a, b, c, d);

                textViewResultado.setText(
                        complejos.suma() +"\n"+
                        complejos.resta() +"\n"+
                        complejos.multiplicar() +"\n"+
                        complejos.dividir()
                );
            }
        });
    }
}