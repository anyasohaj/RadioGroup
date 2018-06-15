package com.bagirapp.radiogroup;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    Context context;
    ArrayList<Gyerekek> mDataset;

    public MyAdapter(Context context, ArrayList list) {
        this.mDataset = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull final MyAdapter.MyHolder holder, final int position) {
        Log.v("Bind", "MOst tölti be a :" + position);
        final Gyerekek currentGyerek = mDataset.get(position);
        holder.name.setText(currentGyerek.nev);

        holder.group.removeAllViews();


        int id = (position+1)*100;
        final int[] idArray = new int[2];
        for(int i= 0; i<2; i++){
            RadioButton rb = new RadioButton(MyAdapter.this.context);
            rb.setId(id++);
            rb.setText(currentGyerek.konyvek[i]);

            holder.group.addView(rb);
        }

        holder.group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId%10 == 0){
                    currentGyerek.setState(0);
                    Log.v("OnClickChangeListener", "Átállítja 0-ra a " + position +"-t");
                }else if ((checkedId -1)%10 == 0 ){
                    currentGyerek.setState(1);
                }

            }
        });
        int holderPosition = holder.getAdapterPosition();

        if (currentGyerek.getState() == 0){
            holder.group.check((holderPosition +1)*100);
            Log.v("MyAdapter", "getState = 0");

        }else if (currentGyerek.getState() == 1){
            Log.v("MyAdapter", "getState = 1");
            holder.group.check(((holderPosition +1)*100)+1);
        }else {
            holder.group.clearCheck();
            Log.v("MyAdapter", "getState valszeg -" + currentGyerek.getState());
        }





    }

    @Override
    public int getItemCount() {
        return 16;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView name;
        RadioGroup group;

        public MyHolder(View itemView) {
            super(itemView);
                name = (TextView) itemView.findViewById(R.id.text);
                group = (RadioGroup) itemView.findViewById(R.id.radioGroup);

        }
    }
}
