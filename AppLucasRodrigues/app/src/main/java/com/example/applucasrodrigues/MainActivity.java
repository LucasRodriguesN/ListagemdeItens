package com.example.applucasrodrigues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    private ListView listNomes;
    private  String [] Itens={
        "Hugo Chaves",
        "Aline Rodrigues",
        "Ester Cristina",
        "Lucas Rodrigues",
        "Marcela Pereira",
        "Michele Oliveira"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listNomes = findViewById(R.id.ListViewIdNomes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                Itens
        );
        listNomes.setAdapter(adapter);
        listNomes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String nomeSelecionado= listNomes.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), nomeSelecionado, Toast.LENGTH_SHORT).show();

            }// fim onItemClick
        });// fim setOnItemClickListenner
    }//fim onCreate
}