package com.zhangpeng.ftof;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private android.app.FragmentManager manager;
    private android.app.FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void replace(View v){
        //1，得到Fragment管理器对象
        manager = getFragmentManager();
        //2，开启Fragment的事务
        transaction = manager.beginTransaction();
        //3，实例化要显示的Fragment对象
        ContentFragment1 cf1 = new ContentFragment1();
        ContentFragment2 cf2 = new ContentFragment2();
        transaction.replace(R.id.content1,cf1,"cf1");
        transaction.replace(R.id.content2,cf2);
        transaction.commit();
    }
}
