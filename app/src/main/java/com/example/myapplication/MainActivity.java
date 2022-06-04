package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;







public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private int r1, r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        giveNewRandom();
    }

    private void giveNewRandom() {
        if (count == 5) {
            count = 0;
            Toast.makeText(this, "You Won!", Toast.LENGTH_SHORT).show();
        } else {
            Random rand = new Random();
            r1 = rand.nextInt(99);
            while (true) {
                r2 = rand.nextInt(99);
                if (r1 != r2)
                    break;
            }
        }
        Button b1=(Button) findViewById(R.id.BL);
        b1.setText(Integer.toString(r1));
        Button b2=(Button) findViewById(R.id.BR);
        b2.setText(Integer.toString(r2));
    }

    public void onClickleft(View view){

        if(r1 > r2)
            count++;
        else
            count--;
        TextView txt =(TextView)findViewById(R.id.TR);
        txt.setText("Point:"+count);
        giveNewRandom();
    }

    public void onClickright(View view) {

        if(r1 < r2)
            count++;
        else
            count--;
        TextView txt =(TextView)findViewById(R.id.TR);
        txt.setText("Point:"+count);
        giveNewRandom();
    }


}