package com.liuweihao.myresume;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.liuweihao.myresume.fragment.FGcontactme;
import com.liuweihao.myresume.fragment.FGproject;
import com.liuweihao.myresume.fragment.FGresume;
import com.liuweihao.myresume.fragment.FGvideo;
import com.liuweihao.myresume.view.BottomBar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomBar bottomBar = findViewById(R.id.bottom_bar);

        bottomBar.setContainer(R.id.fl_container)
                .setTitleBeforeAndAfterColor("#999999", "#ff5d5e")
                .addItem(FGresume.class,
                        "简历",
                        R.drawable.item1_before,
                        R.drawable.item1_after)
                .addItem(FGvideo.class,
                        "视频",
                        R.drawable.item2_before,
                        R.drawable.item2_after)
                .addItem(FGproject.class,
                        "项目",
                        R.drawable.item3_before,
                        R.drawable.item3_after)
                .addItem(FGcontactme.class,
                        "我",
                        R.drawable.item4_before,
                        R.drawable.item4_after)
                .build();
    }
}
