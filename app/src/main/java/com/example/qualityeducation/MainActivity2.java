package com.example.qualityeducation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonNext = findViewById(R.id.button);
        buttonNext.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
        });

        Button buttonNext1 = findViewById(R.id.button3);
        buttonNext1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
            startActivity(intent);
        });

        TextView textNext = findViewById(R.id.textView2); // Use TextView here
        textNext.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
            startActivity(intent);
        });


    }
}