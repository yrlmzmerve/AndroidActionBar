package com.example.merve.actionbar;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.merve.actionbar.Kisiler;

import java.util.List;

/**
 * Created by Merve on 17.06.2017.
 */

public class ozelAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Kisiler> mKisiListesi;

    public ozelAdapter(Activity activity, List<Kisiler> kisiler) {

        mInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        mKisiListesi = kisiler;

    }

    @Override
    public int getCount() {
        return mKisiListesi.size();
    }

    @Override
    public Kisiler getItem(int position) {
        return mKisiListesi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View satirView;
        satirView = mInflater.inflate(R.layout.satir_layout,null);
        TextView textView =
                (TextView) satirView.findViewById(R.id.srctext);
        ImageView imageView =
                (ImageView) satirView.findViewById(R.id.srcımg);



        Kisiler kisi = mKisiListesi.get(position);
        textView.setText(kisi.getIsim() );

        if (kisi.isKadinMi()) {
            imageView.setImageResource(R.drawable.woman);
        }
        else {
            imageView.setImageResource(R.drawable.man);
        }
        return satirView;

    }
}
