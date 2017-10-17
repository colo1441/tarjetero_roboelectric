package com.macode.tarjetero;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

/**
 * Created by macod on 17/10/2017.
 */

public class SingleCardActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlecard);

        //Importamos La posicion que es para saber que tarjeta es
        Bundle bundle = getIntent().getExtras();
        Gson gson = new Gson();
        String card = getIntent().getStringExtra("card");
        DataObject cardObj = gson.fromJson(card, DataObject.class);

        TextView outName = findViewById(R.id.tvNameSingle);
        TextView outBank = findViewById(R.id.tvBankSingle);
        TextView outNumber = findViewById(R.id.tvNumberSingle);
        TextView outCaducity = findViewById(R.id.tvCaducitySingle);
        TextView outBalance = findViewById(R.id.tvBalanceSingle);

        outName.setText(cardObj.getName());
        outName.setText(cardObj.getBank());
        outName.setText(cardObj.getNumber());
        outName.setText(cardObj.getCaducity());
        outName.setText(cardObj.getBalance()+"€");



    }
}
