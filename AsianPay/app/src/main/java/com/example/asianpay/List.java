package com.example.asianpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List extends AppCompatActivity {
ListView myListView;
String[] dataArray={"one","two","three","four","five","six","seven","eight","one","two","three","four","five","one","two","three","four","five","one","two","three","four","five"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        myListView =findViewById(R.id.list_view);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.list_item,dataArray);
        myListView.setAdapter(adapter);

    }
}