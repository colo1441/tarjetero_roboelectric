package com.macode.tarjetero.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.macode.tarjetero.R;
import com.macode.tarjetero.model.CreditCard;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
                                 implements View.OnClickListener{

    private List<CreditCard> mList;
    private int mLayout;
    private Context mContext;
    private final int VIEW_ITEM = 0;
    private View.OnClickListener listener;

    public RecyclerViewAdapter(List<CreditCard> data) {

        this.mList = data;
    }

    public void setOnItemClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public int getItemViewType(int position) {
        return VIEW_ITEM;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row, parent, false);
        RecyclerView.ViewHolder viewHolder = new CreditcardHolder(mView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        CreditCard mItem = mList.get(position);
        CreditcardHolder creditcardHolder = (CreditcardHolder) holder;
        creditcardHolder.setIsRecyclable(true);
        creditcardHolder.getName().setText(mItem.getName());
        creditcardHolder.getNumber().setText(mItem.getNumber());

        //Que en función del banco en la esquina inferior derecha se muestre un simbolo u otro.
        //Como en las tarjetas físicas.
        /*
        switch(mItem.getBank())
        {
            case "Bankia":
                break;
            case "Santander":
                break;
            case "Unicaja":
                break;
            case "Rural Caja":
                break;
            default:
                break;
        }
        */
        //No vamos a mostrar en banco así, lo haremos con un imageView
        //creditcardHolder.getBank().setText(mItem.getBank());
        creditcardHolder.getCaducity().setText(mItem.getCaducity());
        creditcardHolder.getBalance().setText(mItem.getBalance()+"€");

    }

    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }

    }

    public CreditCard getCardSelected(int position){
        if(mList!=null && !mList.isEmpty())
            return mList.get(position);

        return null;
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

}
