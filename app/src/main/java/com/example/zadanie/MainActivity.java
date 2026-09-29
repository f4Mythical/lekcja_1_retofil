package com.example.zadanie;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView tvTitle;
    private RadioGroup radioGroupPytania;
    private RadioButton A, B, C, D;
    private MaterialButton btnSend;
    List<Pytanie>  pytaniaZInternetu;
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
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/f4Mythical/json/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<List<Pytanie>> call = jsonPlaceHolderApi.getPytania();
        // powinno byc execute
        call.enqueue(
                new Callback<List<Pytanie>>() {
                    @Override
                    public void onResponse(Call<List<Pytanie>> call, Response<List<Pytanie>> response) {
                        if(!response.isSuccessful()){
                            Toast.makeText(MainActivity.this, response.code(),
                                    Toast.LENGTH_SHORT).show();
                            return;
                        }
                        pytaniaZInternetu = response.body();
                        tvTitle.setText(pytaniaZInternetu.get(0).getTresc());
                    }

                    @Override
                    public void onFailure(Call<List<Pytanie>> call, Throwable t) {

                    }
                }
        );
    }
    private void ini(){
         tvTitle = findViewById(R.id.tvTitle);
         A = findViewById(R.id.rBAnswerA);
         B = findViewById(R.id.rBAnswerB);
         C = findViewById(R.id.rBAnswerC);
         D = findViewById(R.id.rBAnswerD);
         btnSend = findViewById(R.id.btnSend);
        radioGroupPytania = findViewById(R.id.radioGroupPytania);
    }
}
// https://my-json-server.typicode.com/f4Mythical/json