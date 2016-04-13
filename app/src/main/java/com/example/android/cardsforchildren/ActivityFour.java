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
import android.widget.ImageView;

public class ActivityFour extends AppCompatActivity {


    int numberOfClickNext = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

    }


    public void onMyButtonClick(View view) {
        numberOfClickNext = numberOfClickNext + 1;
        if (numberOfClickNext == 10) {
            numberOfClickNext = 1;
        }
        // выводим сообщение
        MyNextPicture(numberOfClickNext);
    }

    public void MyNextPicture(int number) {

        ImageView imageView = (ImageView) findViewById(R.id.my_next_image_view);

        switch (number) {

            case 1:
                imageView.setImageResource(R.drawable.concretehauler);
                break;
            case 2:
                imageView.setImageResource(R.drawable.excavator);
                break;
            case 3:
                imageView.setImageResource(R.drawable.gasolinetanker);
                break;
            case 4:
                imageView.setImageResource(R.drawable.loader);
                break;
            case 5:
                imageView.setImageResource(R.drawable.tipper);
                break;
            case 6:
                imageView.setImageResource(R.drawable.tractor);
                break;
            case 7:
                imageView.setImageResource(R.drawable.truck);
                break;
            case 8:
                imageView.setImageResource(R.drawable.truckcrane);
                break;
            case 9:
                imageView.setImageResource(R.drawable.bulldozer);
                break;

        }

    }
}
