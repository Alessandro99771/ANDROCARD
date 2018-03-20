package br.com.alessandro.androcard;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cadastrar2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar2);

        Button cancelar = (Button) findViewById(R.id.bntCancelar2);
        cancelar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                AlertDialog.Builder cancelar = new AlertDialog.Builder(Cadastrar2Activity.this);
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

                                Intent cancelar2 = new Intent(Cadastrar2Activity.this, LoginActivity.class);
                                startActivity(cancelar2);
                            }
                        });
                AlertDialog alertDialog = cancelar.create();
                alertDialog.show();


            }
        });

        Button confirmar = (Button) findViewById(R.id.bntConfirmar);
        confirmar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                AlertDialog.Builder confirmar = new AlertDialog.Builder(Cadastrar2Activity.this);
                confirmar.setMessage("Tem certeza que deseja confirmar?")
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

                                Intent confirmar =  new Intent(Cadastrar2Activity.this, LoginActivity.class);
                                startActivity(confirmar);
                            }
                        });
                AlertDialog alertDialog = confirmar.create();
                alertDialog.show();


            }
        });

    }

}
