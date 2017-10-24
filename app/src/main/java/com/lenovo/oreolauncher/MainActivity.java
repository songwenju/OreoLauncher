package com.lenovo.oreolauncher;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private CustomRecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();

    }

    /**
     * 初始化数据
     */
    private void initData() {
    }

    /**
     * 初始化view
     */
    private void initView() {
        setContentView(R.layout.activity_main);
        mContext = this;
        mRecyclerView = (CustomRecyclerView) findViewById(R.id.recycler_view);
    }
}
