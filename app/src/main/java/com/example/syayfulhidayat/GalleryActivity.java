package com.example.syayfulhidayat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {

    //NAMA  : SYAYFUL HIDAYAT
    //NIM   : 10120912

    RecyclerView recyclerView_grid;

    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        back_btn = findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        recyclerView_grid = findViewById(R.id.recyclerView_grid);
        recyclerView_grid.setHasFixedSize(true);
//        recyclerView_grid.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL , false));
        recyclerView_grid.setLayoutManager(new GridLayoutManager(GalleryActivity.this, 2));

        List<DataGallery> dataGallery = new ArrayList<>();
        dataGallery.add(new DataGallery(R.drawable.cikuray, "MT. Cikuray"));
        dataGallery.add(new DataGallery(R.drawable.gede, "MT. Pangrango"));
        dataGallery.add(new DataGallery(R.drawable.papandayan, "MT. Papandayan"));
        dataGallery.add(new DataGallery(R.drawable.ciremai, "MT. Ciremai"));
        dataGallery.add(new DataGallery(R.drawable.prau, "MT. Prau"));
        dataGallery.add(new DataGallery(R.drawable.sagara, "MT. Sagara"));
        dataGallery.add(new DataGallery(R.drawable.guntur, "MT. Guntur"));
        dataGallery.add(new DataGallery(R.drawable.golden, "Golden Sunrise"));
        dataGallery.add(new DataGallery(R.drawable.hutmat, "Hutan Mati"));
        dataGallery.add(new DataGallery(R.drawable.samudra, "Samudra Awan"));

        GalleryAdapter galleryAdapter = new GalleryAdapter(dataGallery);
        recyclerView_grid.setAdapter(galleryAdapter);
    }
}
