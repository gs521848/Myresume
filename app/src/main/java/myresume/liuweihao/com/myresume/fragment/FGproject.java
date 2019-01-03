package myresume.liuweihao.com.myresume.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import myresume.liuweihao.com.myresume.R;

/**
 * Created by Administrator on 2019/1/1.
 */

public class FGproject extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_project,container,false);
    }
}
