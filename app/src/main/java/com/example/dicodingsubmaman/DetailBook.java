package com.example.dicodingsubmaman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailBook extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_nama";
    public static final String EXTRA_ISI = "extra_isi";
    public static final String EXTRA_AUTHOR = "extra_author";
    public static final String EXTRA_YEAR = "extra_year";
    public static final String EXTRA_GAMBAR = "extra_gambar";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_book);

        ImageView foto =findViewById(R.id.img_item_photo1);
        TextView judul= findViewById(R.id.judul_buku);
        TextView  isi= findViewById(R.id.penjelasan_buku);
        TextView  year= findViewById(R.id.tahun_buku);
        TextView  author= findViewById(R.id.penulis_buku);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String isian = getIntent().getStringExtra(EXTRA_ISI);
        String tahun = getIntent().getStringExtra(EXTRA_YEAR);
        String pembuat = getIntent().getStringExtra(EXTRA_AUTHOR);
        int gambaran = getIntent().getIntExtra("int",0);


//
//        Glide.with(this)
//                .load(gambaran)
//                .apply(new RequestOptions().override(55, 55))
//                .into(foto);
        foto.setImageResource(gambaran);
        year.setText("Tahun : "+ tahun);
        judul.setText("Judul Buku : "+name);
        author.setText("Penulis : " + pembuat);
        isi.setText(isian);


    }
}