package com.example.maria.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {


    private Context context;
    private List<Word> wordList = new ArrayList<>();
    private int color;

    public WordAdapter(@NonNull Context context, @LayoutRes ArrayList<Word> list, int color) {
        super(context, 0 , list);
        this.context = context;
        wordList = list;
        this.color=color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);

        Word currentWord = wordList.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.imageView);
        if(wordList.get(0).hesImage()){
            image.setImageResource(currentWord.getImageResorceId());
        }
        else image.setVisibility(View.GONE);

        TextView name = (TextView) listItem.findViewById(R.id.miwokTextView);
        name.setText(currentWord.getMiwokTronslation());

        TextView release = (TextView) listItem.findViewById(R.id.engTextView);
        release.setText(currentWord.getDefoultTranslation());

        LinearLayout linearLayout=(LinearLayout) listItem.findViewById(R.id.words_layout);
        linearLayout.setBackgroundColor( context.getResources().getColor(color));

        return listItem;
    }
}
