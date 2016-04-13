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

public class ActivitySeven extends AppCompatActivity {


    int numberOfClickNext = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
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
                imageView.setImageResource(R.drawable.bed);
                break;
            case 2:
                imageView.setImageResource(R.drawable.chair);
                break;
            case 3:
                imageView.setImageResource(R.drawable.chest);
                break;
            case 4:
                imageView.setImageResource(R.drawable.cupboard);
                break;
            case 5:
                imageView.setImageResource(R.drawable.lamp);
                break;
            case 6:
                imageView.setImageResource(R.drawable.sofa);
                break;
            case 7:
                imageView.setImageResource(R.drawable.table);
                break;
            case 8:
                imageView.setImageResource(R.drawable.wardrobe);
                break;
            case 9:
                imageView.setImageResource(R.drawable.armchair);
                break;

        }

    }
}
