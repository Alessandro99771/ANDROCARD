package br.com.alessandro.androcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eu);

        TextView data_nascimento = (TextView) findViewById(R.id.data_nascimento);

        Calendar c = Calendar.getInstance();
        int ano = c.get(Calendar.YEAR);
        int mes = c.get(Calendar.MONTH) + 1;
        int dia = c.get(Calendar.DAY_OF_MONTH);

        String stDia, stMes, stAno;
        stDia = String.valueOf(dia);
        stMes = String.valueOf(mes);
        stAno = String.valueOf(ano);

        data_nascimento.setText("  " + stDia + "/" + stMes + "/" + stAno );




    }
}
