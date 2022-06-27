package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    private int visibility = 0;
    public WordAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String miwokTranslation = getItem(position).getMiwokTranslation();
        String defaultTranslation = getItem(position).getDefaultTranslation();
        int image = getItem(position).getImageResourceID();
        View listItemView = convertView;
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(miwokTranslation);
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(defaultTranslation);
        
        ImageView imageView = listItemView.findViewById(R.id.image_view);
        if (imageView == null){
            imageView.setVisibility(View.GONE);
        }
        else {
            imageView.setImageResource(image);
        }


        return listItemView;
    }

}
