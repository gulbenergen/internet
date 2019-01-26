package com.yami.internet;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.ViewGroup;
import android.view.LayoutInflater;

import android.widget.TextView;
class inboxAdapter extends RecyclerView.Adapter<inboxAdapter.ViewHolder> {
    private String[] Title;
    private String[] Content;
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }

    }
    public inboxAdapter(String[] title, String[] content){
        this.Title = title;
        this.Content = content;
    }

    @Override
    public inboxAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewtype) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.inboxcardview, parent, false);
        return new ViewHolder(cv);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        TextView textView = (TextView)cardView.findViewById(R.id.title);
        textView.setText(Title[position]);
        TextView textView1 = (TextView)cardView.findViewById(R.id.content);
        textView1.setText(Content[position]);
    }

    @Override
    public int getItemCount() {
        return Title.length;
    }



}