package com.example.scorepp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class TabelPenalties extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel_penalties);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar11);
        toolbar.inflateMenu(R.menu.meniupenal);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.home:
                        Intent i = new Intent(TabelPenalties.this, MainActivity.class);
                        startActivity(i);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

}