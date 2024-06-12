package com.example.syayfulhidayat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ProfileActivity extends AppCompatActivity {

    //NAMA  : SYAYFUL HIDAYAT
    //NIM   : 10120912

    ImageView pro, loca, conta, about;

    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);
        back_btn = findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        pro = findViewById(R.id.profil);
        conta = findViewById(R.id.contact);
        loca = findViewById(R.id.location);
        about = findViewById(R.id.succesButton);

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, PropilActivity.class);
                startActivity(intent);
            }
        });
        conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.instagram.com/syaaiful__/");
                startActivity((new Intent(Intent.ACTION_VIEW,uri)));
            }
        });
        loca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://maps.app.goo.gl/j5gwJvGSXiYkWFVJ6");
                startActivity((new Intent(Intent.ACTION_VIEW,uri)));
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSuccesDialog();
            }
        });
    }

    private void showSuccesDialog() {
        ConstraintLayout okConstrainLayout = findViewById(R.id.okConstraintLayout);
        View view = LayoutInflater.from(ProfileActivity.this).inflate(R.layout.dialog , okConstrainLayout);
        Button okDone = view.findViewById(R.id.okDone);

        AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this);
        builder.setView(view);
        final  AlertDialog alertDialog = builder.create();

        okDone.findViewById(R.id.okDone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
                Toast.makeText(ProfileActivity.this,"OK", Toast.LENGTH_SHORT).show();
            }
        });
        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }
}

