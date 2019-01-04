package com.liuweihao.myresume.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.liuweihao.myresume.R;
import com.liuweihao.myresume.view.viewpager.BannerViewPager;
import com.liuweihao.myresume.view.viewpager.OnPageClickListener;
import com.liuweihao.myresume.view.viewpager.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/1/1.
 */

public class FGresume extends Fragment {
    BannerViewPager banner;
    List<View> imageViews;
    ViewPagerAdapter bannerAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mview=inflater.inflate(R.layout.fragment_resume,container,false);
        initBanners(mview,getActivity());
        return mview;



    }

    private void initBanners(View mview,Context context) {
        imageViews=new ArrayList<>();
        banner=mview.findViewById(R.id.banner);
        ImageView iv1 = (ImageView) LayoutInflater.from(context).inflate(R.layout.banner_item,banner,false);
        ImageView iv2 = (ImageView) LayoutInflater.from(context).inflate(R.layout.banner_item,banner,false);
        ImageView iv3 = (ImageView) LayoutInflater.from(context).inflate(R.layout.banner_item,banner,false);
        ImageView iv4 = (ImageView) LayoutInflater.from(context).inflate(R.layout.banner_item,banner,false);
        iv1.setImageResource(R.mipmap.ban1);
        iv2.setImageResource(R.mipmap.ban2);
        iv3.setImageResource(R.mipmap.ban3);
        iv4.setImageResource(R.mipmap.ban4);
        imageViews.add(iv1);
        imageViews.add(iv2);
        imageViews.add(iv3);
        imageViews.add(iv4);
        bannerAdapter = new ViewPagerAdapter(imageViews , new OnPageClickListener() {
            @Override
            public void onPageClick(View view, int position) {
                Log.d("cylog","position:"+position);
            }
        });
        banner.setAdapter(bannerAdapter);
    }

}
