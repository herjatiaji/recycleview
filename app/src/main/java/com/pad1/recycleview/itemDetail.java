package com.pad1.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class itemDetail extends AppCompatActivity {
    TextView title;
    TextView content;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        title = findViewById(R.id.judul);
        content = findViewById(R.id.content);
        gambar = findViewById(R.id.imgview);
        Intent intent = getIntent();
        String judul = intent.getStringExtra("title");
        int img = intent.getIntExtra("noImg",0);
        String isi = intent.getStringExtra("detail");
        title.setText(judul);
        content.setText(isi);
        gambar.setImageResource(img);

    }
}