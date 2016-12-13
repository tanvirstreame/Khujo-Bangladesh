package com.example.tanvir.khujobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapDisplay extends AppCompatActivity {
    Button bD,bCh,bK,bB,bM,bR,bRS,bS,bc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_display);

        bD=(Button)findViewById(R.id.button15);
        bCh=(Button)findViewById(R.id.button11);

        bK=(Button)findViewById(R.id.button9);
        bB=(Button)findViewById(R.id.button10);

        bM=(Button)findViewById(R.id.button4);
        bR=(Button)findViewById(R.id.button5);

        bRS=(Button)findViewById(R.id.button6);

        bc=(Button)findViewById(R.id.button8);
        bS=(Button)findViewById(R.id.button3);

        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MapDisplay.this,Dhaka.class);

                startActivity(i);

            }
        });

        bCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MapDisplay.this,Chittagong.class);

                startActivity(i);

            }




        });

        bK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MapDisplay.this,Comilla.class);

                startActivity(i);

            }
        });

        bB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MapDisplay.this,Barishal.class);

                startActivity(i);

            }

        });



        bM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MapDisplay.this,Maymensingh.class);

                startActivity(i);

            }
        });

        bR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MapDisplay.this,Rangpur.class);

                startActivity(i);

            }

        });


        bRS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MapDisplay.this,Rajshahi.class);

                startActivity(i);

            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MapDisplay.this,Comilla.class);

                startActivity(i);

            }
        });


        bS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MapDisplay.this,Sylhet.class);

                startActivity(i);

            }

        });














    }
    }
