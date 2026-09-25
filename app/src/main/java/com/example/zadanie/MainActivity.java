package com.example.zadanie;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private TextView tvTitle;
    private RadioButton A, B, C, D;
    private MaterialButton btnSend;
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
        ini();

    }
    private void ini(){
         tvTitle = findViewById(R.id.tvTitle);
         A = findViewById(R.id.rBAnswerA);
         B = findViewById(R.id.rBAnswerB);
         C = findViewById(R.id.rBAnswerC);
         D = findViewById(R.id.rBAnswerD);
         btnSend = findViewById(R.id.btnSend);
    }
}
// https://my-json-server.typicode.com/f4Mythical/json