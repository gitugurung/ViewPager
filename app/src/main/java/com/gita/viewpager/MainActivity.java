package com.gita.viewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText tname,tlocation;
    Button btn;
    ArrayList<MyData> list;
    private RecyclerView rv;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutmanager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(RecyclerView) findViewById(R.id.recycler);
        layoutmanager=new LinearLayoutManager(this);
        rv.setLayoutManager(layoutmanager);
        tname=(EditText)findViewById(R.id.name1);
        tlocation=(EditText)findViewById(R.id.location1);
        final EditText tpass=(EditText)findViewById(R.id.password) ;
        btn=(Button)findViewById(R.id.button);
        Button tcall=(Button)findViewById(R.id.button2);
        list=new ArrayList<MyData>();


           btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   list.add(new MyData(tname.getText().toString(), tlocation.getText().toString(),tpass.getText().toString(), "Detail"));
                   tname.getText().clear();
                   tlocation.getText().clear();
                   tpass.getText().clear();


               }
           });




        adapter = new CustomAdapter(list);
        rv.setAdapter(adapter);








    }



}
