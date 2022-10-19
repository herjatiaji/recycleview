package com.pad1.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private final ArrayList<Item> item;
    private LayoutInflater inflater;

    public ItemAdapter (Context context, ArrayList<Item>listItem){
        this.item = listItem;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        Item itemm = item.get(position);
        holder.txtTitle.setText(itemm.getTitle());
        holder.txtDetail.setText(itemm.getContent());
        holder.pics.setImageResource(itemm.getPics());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.itemView.getContext(), itemDetail.class);
            String title = itemm.getTitle();
            String det = itemm.getContent();
            int noImg = itemm.getPics();
            intent.putExtra("title", title);
            intent.putExtra("detail", det);
            intent.putExtra("noImg", noImg);
            view.getContext().startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return item.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle, txtDetail;
        ImageView pics;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            txtTitle = itemView.findViewById(R.id.titleItem);
            txtDetail = itemView.findViewById(R.id.detail);
            pics = itemView.findViewById(R.id.Pic);



        }
    }
}
