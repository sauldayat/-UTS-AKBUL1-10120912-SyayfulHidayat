package com.example.syayfulhidayat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder> {

    //NAMA  : SYAYFUL HIDAYAT
    //NIM   : 10120912

    private List<DataGallery> dataGallery;

    public GalleryAdapter(List<DataGallery> dataGallery){
        this.dataGallery = dataGallery;
    }

    @NonNull
    @Override
    public GalleryAdapter.GalleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_layout, parent , false);
        return new GalleryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryViewHolder holder, int position) {
        holder.mText.setText(dataGallery.get(position).getDataGallery());
        holder.mImageview.setImageResource(dataGallery.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataGallery.size();
    }

    class GalleryViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageview;
        private TextView mText;
        public GalleryViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageview = itemView.findViewById(R.id.clothing_image);
            mText = itemView.findViewById(R.id.clothing_offer_tv);
        }
    }
}
