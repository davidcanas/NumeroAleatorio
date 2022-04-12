package com.davidcanas.numeroaleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView numberText;
    private Button numberButton;
    private EditText min;
    private EditText max;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText = findViewById(R.id.TextNumber);
        numberButton = findViewById(R.id.TextButton);
        min = findViewById(R.id.min);
        max = findViewById(R.id.max);

        numberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minInt = Integer.parseInt(min.getText().toString());
                int maxInt = Integer.parseInt(max.getText().toString());
                int NumeroAleatorio = new Random().nextInt(maxInt - minInt + 1) + minInt;

                numberText.setText(String.valueOf(NumeroAleatorio));
            }
        });

    }
}