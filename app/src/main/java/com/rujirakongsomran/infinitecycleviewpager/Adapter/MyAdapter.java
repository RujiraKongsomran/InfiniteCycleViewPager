package com.rujirakongsomran.infinitecycleviewpager.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.rujirakongsomran.infinitecycleviewpager.R;

import java.util.List;

public class MyAdapter extends PagerAdapter {
    List<Integer> lstImage;
    Context context;
    LayoutInflater layoutInflater;

    public MyAdapter(List<Integer> lstImage, Context context) {
        this.lstImage = lstImage;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lstImage.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.card_item, container, false);
        ImageView ivPic = (ImageView) view.findViewById(R.id.ivPic);
        ivPic.setImageResource(lstImage.get(position));
        container.addView(view);
        return view;
    }
}
