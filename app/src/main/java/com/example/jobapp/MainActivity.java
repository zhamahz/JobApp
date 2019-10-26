package com.example.jobapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        listView=(ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Company1");
        arrayList.add("Company2");
        arrayList.add("Company3");
        arrayList.add("Company4");
        arrayList.add("Company5");
        arrayList.add("Company1");
        arrayList.add("Company2");
        arrayList.add("Company3");
        arrayList.add("Company4");
        arrayList.add("Company5");
        arrayList.add("Company1");
        arrayList.add("Company2");
        arrayList.add("Company3");
        arrayList.add("Company4");
        arrayList.add("Company5");

        ArrayAdapter arrayAdapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);


    }

}
