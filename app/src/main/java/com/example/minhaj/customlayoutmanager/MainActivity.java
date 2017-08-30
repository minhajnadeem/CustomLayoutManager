package com.example.minhaj.customlayoutmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyLayoutManager myLayoutManager = new MyLayoutManager();
        recyclerView.setLayoutManager(myLayoutManager);
        MyAdapter adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);

    }

    class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.cutom_view,parent,false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.textView.setText("hello");
        }

        @Override
        public int getItemCount() {
            return 1;
        }
    }
}
