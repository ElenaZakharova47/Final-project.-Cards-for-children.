package com.example.android.cardsforchildren;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

import android.app.Activity;
//add the import statements here to import the Button, TextView and View classes
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnActTwo;
    Button btnActThree;
    Button btnActFour;
    Button btnActFive;
    Button btnActSix;
    Button btnActSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);

        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);

        btnActFour = (Button) findViewById(R.id.btnActFour);
        btnActFour.setOnClickListener(this);

        btnActFive = (Button) findViewById(R.id.btnActFive);
        btnActFive.setOnClickListener(this);

        btnActSix = (Button) findViewById(R.id.btnActSix);
        btnActSix.setOnClickListener(this);

        btnActSeven = (Button) findViewById(R.id.btnActSeven);
        btnActSeven.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnActTwo:
                Intent intent = new Intent(this, ActivityTwo.class);// TODO Call second activity
                startActivity(intent);
                break;
            case R.id.btnActThree:
                Intent intentThree = new Intent(this, ActivityThree.class);// TODO Call three activity
                startActivity(intentThree);
                break;
            case R.id.btnActFour:
                Intent intentFour = new Intent(this, ActivityFour.class);// TODO Call three activity
                startActivity(intentFour);
                break;
            case R.id.btnActFive:
                Intent intentFive = new Intent(this, ActivityFive.class);// TODO Call three activity
                startActivity(intentFive);
                break;
            case R.id.btnActSix:
                Intent intentSix = new Intent(this, ActivitySix.class);// TODO Call three activity
                startActivity(intentSix);
                break;
            case R.id.btnActSeven:
                Intent intentSeven = new Intent(this, ActivitySeven.class);// TODO Call three activity
                startActivity(intentSeven);
                break;
            default:
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
