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

public class ActivityTwo extends AppCompatActivity {


    int numberOfClickNext = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

    }


    public void onMyButtonClick(View view) {
        numberOfClickNext = numberOfClickNext + 1;
        if (numberOfClickNext == 11) {
            numberOfClickNext = 1;
        }
        // выводим сообщение
        MyNextPicture(numberOfClickNext);
    }

    public void MyNextPicture(int number) {

        ImageView imageView = (ImageView) findViewById(R.id.my_next_image_view);

        switch (number) {
            case 1:
                imageView.setImageResource(R.drawable.crocodile);
                break;
            case 2:
                imageView.setImageResource(R.drawable.frog);
                break;
            case 3:
                imageView.setImageResource(R.drawable.giraffe);
                break;
            case 4:
                imageView.setImageResource(R.drawable.gout);
                break;
            case 5:
                imageView.setImageResource(R.drawable.hedgehog);
                break;
            case 6:
                imageView.setImageResource(R.drawable.horse);
                break;
            case 7:
                imageView.setImageResource(R.drawable.lion);
                break;
            case 8:
                imageView.setImageResource(R.drawable.snake);
                break;
            case 9:
                imageView.setImageResource(R.drawable.wolf);
                break;
            case 10:
                imageView.setImageResource(R.drawable.cat);
                break;
        }

    }
}
