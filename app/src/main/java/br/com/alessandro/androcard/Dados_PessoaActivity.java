package br.com.alessandro.androcard;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.time.Instant;

public class Dados_PessoaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados__pessoa);

        Button eu = (Button) findViewById(R.id.bntEu);
        eu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent eu = new Intent(Dados_PessoaActivity.this, EuActivity.class);
                startActivity(eu);

            }
        });

        Button dados_fisico = (Button) findViewById(R.id.bntDadosFisicos);
        dados_fisico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dados_fisico = new Intent(Dados_PessoaActivity.this, DadosFisicosActivity.class);
                startActivity(dados_fisico);
            }
        });


        Button sair = (Button) findViewById(R.id.sair);
        sair.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                AlertDialog.Builder alerta = new AlertDialog.Builder(Dados_PessoaActivity.this);
                alerta.setMessage("Tem certeza que deseja sair?")
                        .setCancelable(true)
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "Cancelado", Toast.LENGTH_SHORT).show();
                            }
                        })

                        .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "Confirmado", Toast.LENGTH_SHORT).show();

                                Intent sair = new Intent(Dados_PessoaActivity.this, LoginActivity.class);
                                startActivity(sair);
                            }
                        });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();
            }
        });


    }
}