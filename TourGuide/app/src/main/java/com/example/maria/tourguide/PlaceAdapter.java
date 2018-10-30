package com.example.maria.tourguide;

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

class PlaceAdapter  extends ArrayAdapter<Place> {
    private Context context;
    private List<Place> placeList = new ArrayList<>();
    private int color;

    public PlaceAdapter(@NonNull Context context, @LayoutRes ArrayList<Place> list, int color) {
        super(context, 0 , list);
        this.context = context;
        placeList = list;
        this.color=color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);

        Place currentPlace = placeList.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.imageView);
            image.setImageResource(currentPlace.getImage_id());

        TextView name = (TextView) listItem.findViewById(R.id.titleTextView);
        name.setText(currentPlace.getPpaceTitle());

        TextView description = (TextView) listItem.findViewById(R.id.descriptionTextView);
        description.setText(currentPlace.getPlaceDescription());

        TextView address = (TextView) listItem.findViewById(R.id.addressTextView);
        address.setText(currentPlace.getPlaceAddress());
//        LinearLayout linearLayout=(LinearLayout) listItem.findViewById(R.id.places_layout);
//        linearLayout.setBackgroundColor( context.getResources().getColor(color));

        return listItem;
    }
}
