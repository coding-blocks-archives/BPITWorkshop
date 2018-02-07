package com.codingblocks.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sum(View view) {
        EditText editText1 = findViewById(R.id.numberOne);
        EditText editText2 = findViewById(R.id.numberTwo);

        int numberOne = Integer.parseInt(editText1.getText().toString());
        int numberTwo = Integer.parseInt(editText2.getText().toString());

        if (numberOne == 0){
            Toast.makeText(this,"Invalid input",Toast.LENGTH_SHORT).show();
        }else {
            int sum = numberOne / numberTwo;
            TextView result = findViewById(R.id.result);

            result.setText("The result is " + sum);

        }



        Log.d("Tag", "Button was clicked");
    }


    //Completed 1. Get callback from button
    //TODO 2. Get EditText's values
    //TODO 3. Sum the numbers
    //TODO 4. Display them on the screen

}
