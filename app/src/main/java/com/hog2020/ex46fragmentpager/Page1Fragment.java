package com.hog2020.ex46fragmentpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class Page1Fragment extends Fragment {

    TextView tv;
    Button btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_page1,container,false);

        //page1.xml에 안에있는 뷰 들참조하기
        tv=view.findViewById(R.id.tv);
        btn=view.findViewById(R.id.btn);

        //버튼의 리스너 설정
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("nice meet you");
            }
        });


        return view;
    }
}
