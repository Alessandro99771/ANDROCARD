package br.com.alessandro.androcard;

import android.content.DialogInterface;
import android.content.Intent;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button cadastrar = (Button) findViewById(R.id.btnCadastrar);
        cadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View vie) {

                Intent cadastro = new Intent(LoginActivity.this, Cadastrar1Activity.class);
                startActivity(cadastro);

            }

        });

        Button login = (Button) findViewById(R.id.btnEntrar);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent login = new Intent(LoginActivity.this, TelaInicialActivity.class);
                startActivity(login);

            }
        });

        TextView Esqueceu = (TextView) findViewById(R.id.txtEsqueceu);
        Esqueceu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder esqueceu = new AlertDialog.Builder(LoginActivity.this);
                esqueceu.setMessage("Um e-mail será enviado para a sua caixa postal!")
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
                            }
                        });
                AlertDialog alertDialog = esqueceu.create();
                alertDialog.show();


            }
        });

    }


    }

