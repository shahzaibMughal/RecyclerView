package com.example.shahzaib.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    String []itemTitle = new String[]{
      "item 1",
      "item 2",
      "item 3",
      "item 4",
      "item 5",
      "item 6",
      "item 7",
      "item 8",
      "item 9",
      "item 10"
    };


    String []itemDescription = new String[]{
            "description 1",
            "description 2",
            "description 3",
            "description 4",
            "description 5",
            "description 6",
            "description 7",
            "description 8",
            "description 9",
            "description 10"
    };

    int []itemImage = new int[]{
            R.drawable.ic_android,
            R.drawable.ic_android,
            R.drawable.ic_android,
            R.drawable.ic_android,
            R.drawable.ic_android,
            R.drawable.ic_android,
            R.drawable.ic_android,
            R.drawable.ic_android,
            R.drawable.ic_android,
            R.drawable.ic_android
    };

    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialization of userData
        List<UserData> userData = new ArrayList<>();
        for (int i=0; i<itemTitle.length; i++)
        {
            UserData tempUserdata = new UserData();
            tempUserdata.image = itemImage[i];
            tempUserdata.Title = itemTitle[i];
            tempUserdata.Description = itemDescription[i];

            userData.add(tempUserdata);
        }
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new Adapter(userData);
//        int NUMBER_OF_COLUMN = 2;
//        GridLayoutManager layoutManager = new GridLayoutManager(this,NUMBER_OF_COLUMN);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
