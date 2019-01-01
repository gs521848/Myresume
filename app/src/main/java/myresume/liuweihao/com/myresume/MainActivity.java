package myresume.liuweihao.com.myresume;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import myresume.liuweihao.com.myresume.fragment.FGcontactme;
import myresume.liuweihao.com.myresume.fragment.FGproject;
import myresume.liuweihao.com.myresume.fragment.FGresume;
import myresume.liuweihao.com.myresume.fragment.FGvideo;
import myresume.liuweihao.com.myresume.view.BottomBar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomBar bottomBar = findViewById(R.id.bottom_bar);

        bottomBar.setContainer(R.id.fl_container)
                .setTitleBeforeAndAfterColor("#999999", "#ff5d5e")
                .addItem(FGresume.class,
                        "首页",
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
