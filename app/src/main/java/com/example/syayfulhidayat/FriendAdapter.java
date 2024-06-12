package com.example.syayfulhidayat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.FriendViewHolder> {

    //NAMA  : SYAYFUL HIDAYAT
    //NIM   : 10120912

    private List<Myfriend> dataFriend;
    public FriendAdapter(List<Myfriend> dataFriend){
        this.dataFriend = dataFriend;
    }
    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_layout, parent , false);
        return new FriendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder holder, int position) {
        holder.mText.setText(dataFriend.get(position).getDataFriend());
        holder.mImageview.setImageResource(dataFriend.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataFriend.size();
    }

    class FriendViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageview;
        private TextView mText;
        public FriendViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageview = itemView.findViewById(R.id.clothing_image);
            mText = itemView.findViewById(R.id.clothing_offer_tv);
        }
    }
}