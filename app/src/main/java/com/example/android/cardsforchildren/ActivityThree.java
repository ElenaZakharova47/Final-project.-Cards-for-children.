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

public class ActivityThree extends AppCompatActivity {


    int numberOfClickNext = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

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
                imageView.setImageResource(R.drawable.colibri);
                break;
            case 2:
                imageView.setImageResource(R.drawable.crow);
                break;
            case 3:
                imageView.setImageResource(R.drawable.dove);
                break;
            case 4:
                imageView.setImageResource(R.drawable.goose);
                break;
            case 5:
                imageView.setImageResource(R.drawable.hen);
                break;
            case 6:
                imageView.setImageResource(R.drawable.sparrow);
                break;
            case 7:
                imageView.setImageResource(R.drawable.stork);
                break;
            case 8:
                imageView.setImageResource(R.drawable.swallow);
                break;
            case 9:
                imageView.setImageResource(R.drawable.woodpecker);
                break;
            case 10:
                imageView.setImageResource(R.drawable.canary);
                break;
        }

    }
}
