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

public class ContentFragment1 extends Fragment implements View.OnClickListener {
    TextView tv;
    Button bt;
    CallBack callBack;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout1, null);
        bt = (Button) view.findViewById(R.id.bt);
        bt.setOnClickListener(this);
        return view;
    }
//以下为fragment向activity传送数据
    @Override
    public void onClick(View v) {
        callBack.getResult("565552");
    }
    public interface CallBack{
        public void getResult(String rs);
    }
    public void setCallBack(CallBack callBack){
        this.callBack = callBack;
    }


}
