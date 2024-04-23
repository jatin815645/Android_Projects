package com.sunbeam.re_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.sunbeam.re_view.Adapters.RecipeAdapter;
import com.sunbeam.re_view.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclarView);

        ArrayList<RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.burger1,"Burger"));
        list.add(new RecipeModel(R.drawable.burger2,"Chicken Burger"));
        list.add(new RecipeModel(R.drawable.burger3,"Cheese Burger"));
        list.add(new RecipeModel(R.drawable.burger4,"Mutton Burger"));
        list.add(new RecipeModel(R.drawable.burger5,"Onion Burger"));
        list.add(new RecipeModel(R.drawable.burger6,"Corn Burger"));
        list.add(new RecipeModel(R.drawable.burger7,"Butter Burger"));
        list.add(new RecipeModel(R.drawable.burger8,"Ham Burger"));
        list.add(new RecipeModel(R.drawable.burger9,"Jumbo Burger"));
        list.add(new RecipeModel(R.drawable.burger10,"Small Burger"));

        RecipeAdapter adapter = new RecipeAdapter(list, this);
        recyclerView.setAdapter(adapter);

        StaggeredGridLayoutManager staggered = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(staggered);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerView.setLayoutManager(layoutManager);


    }
}