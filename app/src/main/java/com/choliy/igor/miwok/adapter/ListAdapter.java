package com.choliy.igor.miwok.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.choliy.igor.miwok.R;
import com.choliy.igor.miwok.model.ItemModel;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private int mColorId;
    private Context mContext;
    private List<ItemModel> mItemModels;
    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener =
            new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    releaseMediaPlayer();
                }
            };

    public ListAdapter(Context context, List<ItemModel> itemModels, int colorId) {
        mContext = context;
        mItemModels = itemModels;
        mColorId = colorId;
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListAdapter.ViewHolder holder, int position) {
        holder.bindView(position);
    }

    @Override
    public int getItemCount() {
        return mItemModels.size();
    }

    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mMiwokText;
        private TextView mEnglishText;
        private ImageView mImageView;

        ViewHolder(View itemView) {
            super(itemView);
            mMiwokText = (TextView) itemView.findViewById(R.id.text_list_item_miwok);
            mEnglishText = (TextView) itemView.findViewById(R.id.text_list_item_english);
            mImageView = (ImageView) itemView.findViewById(R.id.image_list_item);
            itemView.findViewById(R.id.list_item_color).setBackgroundColor(mColorId);
            itemView.findViewById(R.id.list_item_click).setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            releaseMediaPlayer();
            int audioPath = mItemModels.get(getAdapterPosition()).getAudioPath();
            mMediaPlayer = MediaPlayer.create(mContext, audioPath);
            mMediaPlayer.setOnCompletionListener(mCompletionListener);
            mMediaPlayer.start();
        }

        private void bindView(int position) {
            mMiwokText.setText(mItemModels.get(position).getMiwokTranslation());
            mEnglishText.setText(mItemModels.get(position).getDefaultTranslation());
            mImageView.setImageResource(mItemModels.get(position).getImagePath());
        }
    }
}