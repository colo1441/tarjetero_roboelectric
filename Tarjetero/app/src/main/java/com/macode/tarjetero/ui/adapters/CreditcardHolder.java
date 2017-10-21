package com.macode.tarjetero.ui.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.macode.tarjetero.R;

import org.w3c.dom.Text;

/**
 * Created by macod on 21/10/2017.
 */

public class CreditcardHolder extends RecyclerView.ViewHolder{

    private CardView layout;
    private ImageView icon;
    TextView name;
    TextView number;
    TextView bank;
    TextView caducity;
    TextView balance;

    public CreditcardHolder(View itemView) {
        super(itemView);
        layout = itemView.findViewById(R.id.card_view_layout);
        name = itemView.findViewById(R.id.tvName);
        number = itemView.findViewById(R.id.tvNumber);
        caducity = itemView.findViewById(R.id.tvCaducity);
        balance = itemView.findViewById(R.id.tvBalance);
        icon = itemView.findViewById(R.id.imageView);


    }

    public CardView getLayout() {
        return layout;
    }

    public void setLayout(CardView layout) {
        this.layout = layout;
    }

    public ImageView getIcon() {
        return icon;
    }

    public void setIcon(ImageView icon) {
        this.icon = icon;
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    public TextView getNumber() {
        return number;
    }

    public void setNumber(TextView number) {
        this.number = number;
    }

    public TextView getBank() {
        return bank;
    }

    public void setBank(TextView bank) {
        this.bank = bank;
    }

    public TextView getCaducity() {
        return caducity;
    }

    public void setCaducity(TextView caducity) {
        this.caducity = caducity;
    }

    public TextView getBalance() {
        return balance;
    }

    public void setBalance(TextView balance) {
        this.balance = balance;
    }


}
