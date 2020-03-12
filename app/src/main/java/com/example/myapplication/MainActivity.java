package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private List<DataClass> list=new ArrayList<>();
    private ListAdapter lstadptr;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rc);
        lstadptr=new ListAdapter(list);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(lstadptr);
        PrepareData();
    }
    public void PrepareData()
    {
        DataClass listItems = new DataClass("kiran","101","9878767");
        list.add(listItems);

        DataClass listItems1=new DataClass("riya","102","9475785");
        list.add(listItems1);
        DataClass listItems2=new DataClass("gita","103","8647890");
        list.add(listItems2);
        DataClass listItems3=new DataClass("kaur","104","789987");
        list.add(listItems3);
        DataClass listItems4=new DataClass("kaur","104","789987");
        list.add(listItems4);
        DataClass listItems5=new DataClass("kaur","104","789987");
        list.add(listItems5);
        lstadptr.notifyDataSetChanged();
    }
}
