package com.example.tuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class food extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ArrayList<classfood>  list = new ArrayList<classfood>();
        classfood food = new classfood();
        food.setImg(R.drawable.download);
        food.setName("Phở Hà Nội");
        list.add(food);
        addControl();

        ArrayAdapter<classfood> arrayAdapter = new ArrayAdapter<classfood>(this,list,);
    }

    private void addControl() {
        list = findViewById(R.id.list);

    }
}
