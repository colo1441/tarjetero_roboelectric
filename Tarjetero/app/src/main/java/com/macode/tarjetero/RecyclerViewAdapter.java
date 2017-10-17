package com.macode.tarjetero;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView
             .Adapter<RecyclerViewAdapter
             .DataObjectHolder> {

    private static String LOG_TAG = "RecyclerViewAdapter";
    private ArrayList<DataObject> mDataset;
    private static MyClickListener myClickListener;

    public static class DataObjectHolder extends RecyclerView.ViewHolder
            implements View
            .OnClickListener {
        TextView ccName;
        TextView ccBank;
        TextView ccNumber;
        TextView ccCaducity;
        TextView ccBalance;

        public DataObjectHolder(View itemView) {
            super(itemView);
            ccName = itemView.findViewById(R.id.tvName);
            ccBank = itemView.findViewById(R.id.tvBank);
            ccNumber = itemView.findViewById(R.id.tvNumber);
            ccCaducity = itemView.findViewById(R.id.tvCaducity);
            ccBalance = itemView.findViewById(R.id.tvBalance);
            Log.i(LOG_TAG, "Adding Listener");
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            myClickListener.onItemClick(getAdapterPosition(), v);
        }
    }

    public void setOnItemClickListener(MyClickListener myClickListener) {
        this.myClickListener = myClickListener;
    }

    public RecyclerViewAdapter(ArrayList<DataObject> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public DataObjectHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_row, parent, false);

        DataObjectHolder dataObjectHolder = new DataObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(DataObjectHolder holder, int position) {
        holder.ccName.setText(mDataset.get(position).getName());
        holder.ccBank.setText(mDataset.get(position).getBank());
        holder.ccNumber.setText(mDataset.get(position).getNumber());
        holder.ccCaducity.setText(mDataset.get(position).getCaducity());
        holder.ccBalance.setText(mDataset.get(position).getBalance()+"€");
    }

    public void addItem(DataObject dataObj, int index) {
        mDataset.add(index, dataObj);
        notifyItemInserted(index);
    }

    public void deleteItem(int index) {
        mDataset.remove(index);
        notifyItemRemoved(index);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public interface MyClickListener {
        public void onItemClick(int position, View v);
    }
}
