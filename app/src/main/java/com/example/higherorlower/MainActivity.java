package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int n;

    public void generateRandom(){
        Random rand = new Random();
        n = rand.nextInt(20)+1;
     }

    public void clickfunction(View view){

        Log.i("info",Integer.toString(n));// to know what is the random value;



        EditText Number = (EditText)findViewById(R.id.Number);

        int value=Integer.parseInt(Number.getText().toString());

         String Message;


         if (n>value) Message = "Guess Higher!!";
         else if (n<value) Message = "Guess Lower!!";
         else {
             Message = "You got it !! Try Again";
             generateRandom();

         }

         Toast.makeText(this,Message,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandom();


    }
}