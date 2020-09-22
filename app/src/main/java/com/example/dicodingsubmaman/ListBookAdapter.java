package com.example.dicodingsubmaman;


import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;


public class ListBookAdapter extends RecyclerView.Adapter<ListBookAdapter.ListViewHolder>  {
    private ArrayList<Book> listBook;

    public ListBookAdapter(ArrayList<Book> list){
        this.listBook = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_book, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Book book = listBook.get(position);
        Glide.with(holder.itemView.getContext())
                .load(book.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(book.getName());
        holder.tvDetail.setText(book.getDetail());


        final String name = book.getName();
        final String isi = book.getDetail();
        final int foto = book.getPhoto();
        final String year = book.getYear();
        final String author = book.getAuthor();


        holder.itemView.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v) {
                 Intent moveWithDataIntent = new Intent(holder.itemView.getContext(), DetailBook.class);
                 moveWithDataIntent.putExtra(DetailBook.EXTRA_NAME, name);
                 moveWithDataIntent.putExtra(DetailBook.EXTRA_ISI, isi);
                 moveWithDataIntent.putExtra(DetailBook.EXTRA_AUTHOR, author);
                 moveWithDataIntent.putExtra(DetailBook.EXTRA_YEAR, year);
                 moveWithDataIntent.putExtra("int", foto);
                 holder.itemView.getContext().startActivity(moveWithDataIntent);
              }
        }

        );
    }

    @Override
    public int getItemCount() {
        return listBook.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto=itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }


 }


}
