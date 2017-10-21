package com.macode.tarjetero.ui.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.macode.tarjetero.R;
import com.macode.tarjetero.ui.adapters.RecyclerViewAdapter;
import com.macode.tarjetero.model.CreditCard;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList results = new ArrayList<>();

    //fields for pass the credit card between activities
    public static final String PARCEL_CARD="PARCEL_CARD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        adapter = new RecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(adapter);



        // Listener
        adapter.setOnItemClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SingleCardActivity.class);
                intent.putExtra(PARCEL_CARD, Parcels.wrap(adapter.getCardSelected(mRecyclerView.getChildAdapterPosition(view))));
                startActivityForResult(intent, 0);
            }
        });
        mRecyclerView.setVisibility(View.VISIBLE);

    }




    @Override
    protected void onResume() {
        super.onResume();
        mRecyclerView.setAdapter(adapter);


    }

    private List<CreditCard> getDataSet() {

        String names[] = getResources().getStringArray(R.array.credit_card_names);
        String banks[] = getResources().getStringArray(R.array.credit_card_banks);
        String numbers[] = getResources().getStringArray(R.array.credit_card_numbers);
        String cad[] = getResources().getStringArray(R.array.credit_card_cadu);
        int[] balances = getResources().getIntArray(R.array.credit_card_balances);

        for (int i = 0; i < 5; i++) {
            CreditCard obj = new CreditCard(names[i],banks[i],numbers[i],cad[i],balances[i]);
            results.add(i, obj);
        }
        return results;
    }
}
