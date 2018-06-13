package com.example.dell.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;

            rollbutton=(Button)findViewById(R.id.roll_button);

               final ImageView leftdice=(ImageView) findViewById(R.id.image_dicee_left);

                  final  ImageView rightdice=(ImageView)findViewById(R.id.image_dicee_right);

    final int[] array={ R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6   };

                        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomnumbergenerator=new Random();
                Random r2=new Random();
                int number2=r2.nextInt(6);
                int number =randomnumbergenerator.nextInt(6);
                leftdice.setImageResource(array[number]);
                rightdice.setImageResource(array[number2]);
            }
        });
    }
}
