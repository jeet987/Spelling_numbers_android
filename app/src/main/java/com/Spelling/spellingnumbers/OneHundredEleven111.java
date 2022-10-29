package com.Spelling.spellingnumbers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class OneHundredEleven111 extends AppCompatActivity {
    private Button Next;
    private Button Home;
    private Button Prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_hundred_eleven111);

        Next = findViewById(R.id.Next);
        Home = findViewById(R.id.Home);
        Prev = findViewById(R.id.Prev);


        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(OneHundredEleven111.this,OneHundred121.class);
                startActivity(categoryIntent);
                finish();
            }
        });
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(OneHundredEleven111.this,HomeActivity.class);
                startActivity(categoryIntent);
                finish();
            }
        });
        Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(OneHundredEleven111.this,OneHunderdOne101.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        getSupportActionBar().setHomeButtonEnabled(true);//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            Intent categogyIntent = new Intent(OneHundredEleven111.this, HomeActivity.class);
            startActivity(categogyIntent);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        Intent categogyIntent = new Intent(OneHundredEleven111.this, HomeActivity.class);
        startActivity(categogyIntent);
        finish();
    }

}