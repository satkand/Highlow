package com.example.sathish.highlow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber; //This variable created under class can be used in any method in this class.

    public void generateRandonNumber(){

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }

    public void HighLow(View view) {


        EditText number = (EditText) findViewById(R.id.number);

        String p = number.getText().toString();

        int v= Integer.parseInt(p);

        Log.i("Random Number", Integer.toString(randomNumber));



        if (v > randomNumber){

            Toast.makeText(this, "Higher!",Toast.LENGTH_SHORT).show();

        }

        else if (v < randomNumber){

            Toast.makeText(this, "Lower!",Toast.LENGTH_SHORT).show();

        }
        else if (v == randomNumber){

            Toast.makeText(this, "Matches, Try again!!",Toast.LENGTH_SHORT).show();

            generateRandonNumber();

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandonNumber();
    }
}
