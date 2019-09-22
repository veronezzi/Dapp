package com.veronezzi.guilherme.dapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calculate(View button) {
        EditText total = findViewById(R.id.totalAmountText);
        EditText tip = findViewById(R.id.tipText);
        EditText totalPeopleAmount = findViewById(R.id.qtdPeopleText);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        if (totalPeopleAmount.getText().toString().trim().length() > 0 && tip.getText().toString().trim().length() > 0 && total.getText().toString().trim().length() > 0) {
            double result = (Double.parseDouble(total.getText().toString()) * (1 + (Double.parseDouble(tip.getText().toString()) / 100))) / Double.parseDouble(totalPeopleAmount.getText().toString());


            alert.setTitle("Cada um Vai pagar");
            alert.setMessage(Double.toString(result));



        }
        else {
            alert.setTitle("Erro");
            alert.setMessage("Voce deve digitar algo antes de tentar calcular");

        }
        alert.create().show();
    }


}
