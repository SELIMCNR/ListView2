package com.cinar.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listViewTeams extends AppCompatActivity {

    ListView listView;
    String teams[];

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_teams);

        listView = findViewById(R.id.teams);
        teams = getResources().getStringArray(R.array.teams);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,teams);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String teams = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),"Veri : "+teams,Toast.LENGTH_LONG).show();
            }
        });
    }
}