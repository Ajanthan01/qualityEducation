package com.example.qualityeducation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imageNext1 = findViewById(R.id.imageView7);
        imageNext1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity5.class);
            startActivity(intent);
        });

        ImageView imageNext2 = findViewById(R.id.imageView14);
        imageNext2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
            startActivity(intent);
        });

        ImageView imageNext3 = findViewById(R.id.imageView21);
        imageNext3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity6.class);
            startActivity(intent);
        });
    }
}