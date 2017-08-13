package com.zhangpeng.ftof;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by 上官若枫 on 2017/7/20.
 */

public class ContentFragment2 extends Fragment implements ContentFragment1.CallBack {
    TextView tv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout2, null);
        tv = (TextView) view.findViewById(R.id.tv);
        ContentFragment1 contentFragment1 = (ContentFragment1) getActivity().getFragmentManager().findFragmentByTag("cf1");
        contentFragment1.setCallBack(this);
        return view;
    }

    @Override
    public void getResult(String rs) {
        tv.setText(rs);
    }
}
