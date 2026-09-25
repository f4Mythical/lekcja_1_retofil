package com.example.zadanie;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
        TextView title = findViewById(R.id.tvTitle);
        RadioButton A = findViewById(R.id.rBAnswerA);
        RadioButton B = findViewById(R.id.rBAnswerB);
        RadioButton C = findViewById(R.id.rBAnswerC);
        RadioButton D = findViewById(R.id.rBAnswerD);
        Button send = findViewById(R.id.btnSend);
    }
}
// https://my-json-server.typicode.com/f4Mythical/json