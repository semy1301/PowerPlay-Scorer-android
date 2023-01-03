package com.example.scorepp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class TabelScor extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel_scor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar12);
        toolbar.inflateMenu(R.menu.meniupenal);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.home:
                        Intent i = new Intent(TabelScor.this, MainActivity.class);
                        startActivity(i);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }
}