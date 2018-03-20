package br.com.alessandro.androcard;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cadastrar1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar1);

        Button Cancelar = (Button) findViewById(R.id.bntCancelar);
        Cancelar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                AlertDialog.Builder cancelar = new AlertDialog.Builder(Cadastrar1Activity.this);
                cancelar.setMessage("Tem certeza que deseja cancelar?")
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

                                Intent cancelar1 =  new Intent(Cadastrar1Activity.this, LoginActivity.class);
                                startActivity(cancelar1);
                            }
                        });
                AlertDialog alertDialog = cancelar.create();
                alertDialog.show();



            }
        });

        Button proximo = (Button) findViewById(R.id.Proximo);
        proximo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent proximo = new Intent(Cadastrar1Activity.this, Cadastrar2Activity.class);
                startActivity(proximo);
            }
        });

    }

}

