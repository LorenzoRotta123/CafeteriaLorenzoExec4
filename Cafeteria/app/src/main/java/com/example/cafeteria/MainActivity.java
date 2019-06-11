package com.example.cafeteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cafeteria (View view) {

        TextView precoTotal = findViewById(R.id.precoTotal);
        precoTotal.setText("Não consegui fazer essa parte de pegar os cliques do usuário para saber qual café ele estaria escolhendo, e então calcular quanto seria o preço total");
    }
}
