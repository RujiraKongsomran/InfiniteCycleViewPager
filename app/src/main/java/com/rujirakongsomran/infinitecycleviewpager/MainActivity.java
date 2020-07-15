package com.rujirakongsomran.infinitecycleviewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.rujirakongsomran.infinitecycleviewpager.Adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> lstImage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        HorizontalInfiniteCycleViewPager horizontalCycle =
                (HorizontalInfiniteCycleViewPager) findViewById(R.id.horizontalCycle);
        MyAdapter adapter = new MyAdapter(lstImage, getBaseContext());
        horizontalCycle.setAdapter(adapter);
    }

    private void initData() {
        lstImage.add(R.drawable.pic1);
        lstImage.add(R.drawable.pic2);
        lstImage.add(R.drawable.pic3);
        lstImage.add(R.drawable.pic4);

    }
}