package com.example.syayfulhidayat;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DailyActivity extends AppCompatActivity {

    //NAMA  : SYAYFUL HIDAYAT
    //NIM   : 10120912

    Button back_btn;
    RecyclerView recyclerView_v, recyclerView_horizontal;

    List<DataClass> dataList;
    MyAdapter adapter;
    DataClass androidData;
    SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        back_btn = findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DailyActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        recyclerView_horizontal = findViewById(R.id.recyclerView_horizontal);
        recyclerView_horizontal.setHasFixedSize(true);
        recyclerView_horizontal.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL , false));

        List<Myfriend> dataFriend = new ArrayList<>();
        dataFriend.add(new Myfriend(R.drawable.sasuke , "Sasuke"));
        dataFriend.add(new Myfriend(R.drawable.naruto , "Naruto"));
        dataFriend.add(new Myfriend(R.drawable.hasirama , "Hasirama"));
        dataFriend.add(new Myfriend(R.drawable.tobirama , "Tobirama"));
        dataFriend.add(new Myfriend(R.drawable.yamato , "Yamato"));
        dataFriend.add(new Myfriend(R.drawable.jiraiya , "Jiraiya"));

        FriendAdapter friendAdapter = new FriendAdapter(dataFriend);
        recyclerView_horizontal.setAdapter(friendAdapter);

        recyclerView_v= findViewById(R.id.recyclerView_v);
        searchView = findViewById(R.id.search);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                searchList(newText);
                return true;
            }
        });
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(DailyActivity.this, 2);
//        recyclerView_v.setLayoutManager(gridLayoutManager);

        recyclerView_v.setHasFixedSize(true);
        recyclerView_v.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL , false));
        dataList = new ArrayList<>();
        androidData = new DataClass("My Study", R.string.study, "UNIKOM", R.drawable.study);
        dataList.add(androidData);
        androidData = new DataClass("My Store", R.string.store, "Wijaya Gadget Store", R.drawable.store);
        dataList.add(androidData);
        androidData = new DataClass("Income", R.string.income, "TraderCuan.", R.drawable.income);
        dataList.add(androidData);
        androidData = new DataClass("My Job", R.string.job, "Wom Finance", R.drawable.pekerjaan);
        dataList.add(androidData);
        adapter = new MyAdapter(DailyActivity.this, dataList);
        recyclerView_v.setAdapter(adapter);
    }

    private void searchList(String text){
        List<DataClass> dataSearchList = new ArrayList<>();
        for (DataClass data : dataList){
            if (data.getDataTitle().toLowerCase().contains(text.toLowerCase())) {
                dataSearchList.add(data);
            }
        }
        if (dataSearchList.isEmpty()){
            Toast.makeText(this, "Not Found", Toast.LENGTH_SHORT).show();
        } else {
            adapter.setSearchList(dataSearchList);
        }
    }
}