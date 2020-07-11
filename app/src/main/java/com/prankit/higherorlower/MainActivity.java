package com.prankit.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void makeToast(String string) {
        Toast.makeText(this, string , Toast.LENGTH_SHORT).show();
    }

    int randomNumber;
    public void guess(View view) {
        EditText guessEnterNumber = (EditText) findViewById(R.id.guessEnterNumber);
        int guessInt = Integer.parseInt(guessEnterNumber.getText().toString());
        if (guessInt > randomNumber) {
            makeToast("Lower!");
        }
        else if (guessInt < randomNumber) {
            makeToast("Higher!");
        }
        else {
            makeToast("That's right! Try again a new one");
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}