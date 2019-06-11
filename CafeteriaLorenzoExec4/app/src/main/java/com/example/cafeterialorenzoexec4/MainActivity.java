package com.example.cafeterialorenzoexec4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int quant = 0;
    double valor = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendEmail = new Intent(Intent.ACTION_SEND);
                sendEmail.setType("*/*");
                sendEmail.putExtra(Intent.EXTRA_EMAIL, "cafe.do.ifc.concordia@gmail.com");
                if (quant == 1) {
                    sendEmail.putExtra(Intent.EXTRA_TEXT, "Eu gostaria de pedir " +quant+ " café. O valor total será de R$" +valor);
                }else{
                    sendEmail.putExtra(Intent.EXTRA_TEXT, "Eu gostaria de pedir " +quant+ " cafés. O valor total será de R$" +valor);
                }
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, "BATATA");

                if (sendEmail.resolveActivity(getPackageManager()) != null) {
                    startActivity(sendEmail);
                }
            }
        });
    }

    public void cafe_mais(View view) {
        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);
        TextView q = findViewById(R.id.pedidoQuant);
        TextView v = findViewById(R.id.pedidoValor);

        quant++;
        x.setText("Quantidade: " + quant);
        valor = valor + 4;
        y.setText("Valor Total: R$" + valor);
        q.setText("Gostaria de " +quant+ " cafés, por favor.");
        v.setText("O valor total será de R$" +valor+ ". Obrigado!");
    }

    public void cafe_menos(View view) {

        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);
        TextView q = findViewById(R.id.pedidoQuant);
        TextView v = findViewById(R.id.pedidoValor);

        if (quant > 0 && valor > 0) {
            quant--;
            x.setText("Quantidade: " + quant);
            valor = valor - 4;
            y.setText("Valor Total: R$" + valor);
            q.setText("Gostaria de " +quant+ " cafés, por favor.");
            v.setText("O valor total será de R$" +valor+ ". Obrigado!");
        }
    }



    public void cafeLeite_mais(View view) {
        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);
        TextView q = findViewById(R.id.pedidoQuant);
        TextView v = findViewById(R.id.pedidoValor);

        quant++;
        x.setText("Quantidade: " + quant);
        valor = valor + 5;
        y.setText("Valor Total: R$" + valor);
        q.setText("Gostaria de " +quant+ " cafés, por favor.");
        v.setText("O valor total será de R$" +valor+ ". Obrigado!");
    }

    public void cafeLeite_menos(View view) {

        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);
        TextView q = findViewById(R.id.pedidoQuant);
        TextView v = findViewById(R.id.pedidoValor);

        if (quant > 0 && valor > 0) {
            quant--;
            x.setText("Quantidade: " + quant);
            valor = valor - 5;
            y.setText("Valor Total: R$" + valor);
            q.setText("Gostaria de " +quant+ " cafés, por favor.");
            v.setText("O valor total será de R$" +valor+ ". Obrigado!");
        }
    }



    public void cafeNewba_mais(View view) {
        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);
        TextView q = findViewById(R.id.pedidoQuant);
        TextView v = findViewById(R.id.pedidoValor);

        quant++;
        x.setText("Quantidade: " + quant);
        valor = valor + 10;
        y.setText("Valor Total: R$" + valor);
        q.setText("Gostaria de " +quant+ " cafés, por favor.");
        v.setText("O valor total será de R$" +valor+ ". Obrigado!");
    }

    public void cafeNewba_menos(View view) {

        TextView x = findViewById(R.id.quantEscrita);
        TextView y = findViewById(R.id.valorTotal);
        TextView q = findViewById(R.id.pedidoQuant);
        TextView v = findViewById(R.id.pedidoValor);

        if (quant > 0 && valor > 0) {
            quant--;
            x.setText("Quantidade: " + quant);
            valor = valor - 10;
            y.setText("Valor Total: R$" + valor);
            q.setText("Gostaria de " +quant+ " cafés, por favor.");
            v.setText("O valor total será de R$" +valor+ ". Obrigado!");
        }
    }

}
