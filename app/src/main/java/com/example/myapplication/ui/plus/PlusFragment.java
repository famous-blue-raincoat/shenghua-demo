package com.example.myapplication.ui.plus;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;

public class PlusFragment extends Fragment {

    private PlusViewModel communityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        communityViewModel =
                new ViewModelProvider(this).get(PlusViewModel.class);
        View root = inflater.inflate(R.layout.fragment_plus, container, false);
        Button btn1 = root.findViewById(R.id.button5) ;
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // 给bnt1添加点击响应事件
                Intent intent =new Intent(getActivity(), com.example.myapplication.ui.plus.ReportActivity.class);
                //启动
                startActivity(intent);
            }
        });
        return root;
    }
}