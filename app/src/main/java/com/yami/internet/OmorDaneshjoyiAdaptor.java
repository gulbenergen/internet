package com.yami.internet;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

 class OmorDaneshjoyiAdaptor extends  RecyclerView.Adapter<OmorDaneshjoyiAdaptor.ViewHolder> {
    private String[] Title;
    private int[] idd;
    private boolean[] actt;
    private OmorDaneshjoyiAdaptor.Listener listener;
    interface Listener {
        void onClick(int position);
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }

    }
    public OmorDaneshjoyiAdaptor(String[] title, int[] id, boolean[] action){
        this.Title = title;
        this.idd = id;
        this.actt=action;
    }

    @Override
    public OmorDaneshjoyiAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewtype) {
        CardView cv1 = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tasviecardview, parent, false);
        return new ViewHolder(cv1);

    }
    public void setListener(OmorDaneshjoyiAdaptor.Listener listener){
        this.listener = listener;
    }
    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        TextView textView = (TextView)cardView.findViewById(R.id.title);
        textView.setText(Title[position]);
        ImageView imageView1 = (ImageView)cardView.findViewById(R.id.logo);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), idd[position]);
        imageView1.setImageDrawable(drawable);
        imageView1.setContentDescription(Title[position]);
        ImageButton btn1 = (ImageButton)cardView.findViewById(R.id.ok);
        ImageButton btn2 = (ImageButton)cardView.findViewById(R.id.notok);
        ImageButton btn3 = (ImageButton)cardView.findViewById(R.id.warning);
        if(actt[position]==true)
            btn1.setVisibility(View.VISIBLE);
        if(actt[position]==false)
            btn2.setVisibility(View.VISIBLE);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(position);
                }
            }
        });
    }



    @Override
    public int getItemCount() {
        return Title.length;
    }


}
