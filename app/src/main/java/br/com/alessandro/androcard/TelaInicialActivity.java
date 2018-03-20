package br.com.alessandro.androcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class TelaInicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        Button dados = (Button) findViewById(R.id.bntDados);
        dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent dados = new Intent(TelaInicialActivity.this, Dados_PessoaActivity.class);
                startActivity(dados);
            }
        });

        TextView hora = (TextView) findViewById(R.id.hora);

        Calendar calendar = Calendar.getInstance();


        int Hora = calendar.get(Calendar.HOUR) - 4;
        int Minuto = calendar.get(Calendar.MINUTE);
        int pm_am = calendar.get(Calendar.AM_PM);


        if(pm_am == 0) {

            hora.setText("Horário " + " " + Hora + ":" + Minuto + " am ");

            if(Minuto<10){

                hora.setText("Horário " + " " + Hora + ":0" + Minuto + " am ");
            }if(Minuto>=10){

                hora.setText("Horário " + " " + Hora + ":" + Minuto + " am ");
            }


        }else{

            hora.setText("Horário " + " " + Hora + ":" + Minuto + " pm ");

            if(Minuto<10){

                hora.setText("Horário " + " " + Hora + ":0" + Minuto + " pm ");
            }if(Minuto>=10){

                hora.setText("Horário " + " " + Hora + ":" + Minuto + " pm ");
            }
        }


        TextView data_nascimento = (TextView) findViewById(R.id.data);

        Calendar w = Calendar.getInstance();
        int ano = w.get(Calendar.YEAR);
        int mes = w.get(Calendar.MONTH) + 1;
        int dia = w.get(Calendar.DAY_OF_MONTH);

        String stDia, stMes, stAno;
        stDia = String.valueOf(dia);
        stMes = String.valueOf(mes);
        stAno = String.valueOf(ano);

        if(mes<=10){

            data_nascimento.setText("Data"+"  " + stDia + "/0" + stMes + "/" + stAno );
        }else

        data_nascimento.setText("Data"+"  " + stDia + "/" + stMes + "/" + stAno );
    }
}
