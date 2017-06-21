package com.example.coordinatorlayoutdemo;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img_viewSearch,imag_viewAdd;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        img_viewSearch = (ImageView) findViewById(R.id.search);
      //  imag_viewAdd = (ImageView) findViewById(R.id.imgview);
        mTabLayout = (TabLayout) findViewById(R.id.tab22);
      /*  img_viewSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imag_viewAdd.setVisibility(View.VISIBLE);
            }
        });*/
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout collapsingtoolbarlayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingtoolbarlayout);
        //设置标题
              //  设置颜色变化
       /* collapsingtoolbarlayout.setExpandedTitleColor(Color.GRAY);
       collapsingtoolbarlayout.setExpandedTitleColor(Color.WHITE);*/
        RecyclerView recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setAdapter(new MyAdapter());
        //设置排列方式  上下文 排列方式 是否反转
        recyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mTabLayout.addTab(mTabLayout.newTab().setText("首页"));
        mTabLayout.addTab(mTabLayout.newTab().setText("首页"));



    }
    class MyAdapter extends RecyclerView.Adapter<MyHolder>{

        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //recyclerview.xml 简单的textview布局
            View view= View.inflate(getApplicationContext(),android.R.layout.simple_list_item_1,null);
            return new MyHolder(view);
        }

        @Override
        public void onBindViewHolder(MyHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }
    class MyHolder extends RecyclerView.ViewHolder{

        public MyHolder(View itemView) {
            super(itemView);

        }
    }
}
