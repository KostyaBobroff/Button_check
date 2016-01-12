package com.example.costa.button_check;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button but,sm;
    ToggleButton tog;
    int kur;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but=(Button)findViewById(R.id.button);
        sm=(Button)findViewById(R.id.button2);
//        but.setOnClickListener(this);
     //   int i = 0;
        but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                i++;
                Handler handler = new Handler();
                Runnable r = new Runnable() {

                    @Override
                    public void run() {
                        i = 0;
                    }


                };

                if (i == 1) {
                    //Single click
                  //  if(i==1)
                    handler.postDelayed(r, 5000);

                        Toast.makeText(getApplicationContext(), "1 Click", Toast.LENGTH_LONG).show();
                        but.setText("go");
                    handler.postDelayed(r, 5000);
                    Toast.makeText(getApplicationContext(), "1 Click", Toast.LENGTH_LONG).show();

                } else if (i == 2) {
                    //Double click
                    handler.removeCallbacks(r);
                    i = 0;
                    Toast.makeText(getApplicationContext(),"2 Click",Toast.LENGTH_LONG).show();
                    but.setText("stop");
                   // ShowDailog();
                }


            }
        });
        sm.setOnClickListener(this);
        tog=(ToggleButton)findViewById(R.id.toggleButton);
        tog.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {


                } else {
                    Toast.makeText(getApplicationContext(),"FUCK OFF",Toast.LENGTH_LONG).show();
                    tog.getTextOff();
                    // The toggle is disabled
                }
            }
        });
    }




String time;
    @Override
    public void onClick(View v) {

        switch (v.getId()) {


          //  case R.id.button:




            //    break;
            case R.id.button2:
                Intent intent= new Intent(this,Action.class);
                startActivity(intent);
                Toast.makeText(this,"Fuck",Toast.LENGTH_LONG).show();
        }
    }
    }

