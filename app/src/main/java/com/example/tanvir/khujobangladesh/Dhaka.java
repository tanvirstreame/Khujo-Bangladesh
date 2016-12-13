package com.example.tanvir.khujobangladesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dhaka extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    String q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);

        b1=(Button)findViewById(R.id.button13);
        b2=(Button)findViewById(R.id.button14);
        b3=(Button)findViewById(R.id.button16);
        b4=(Button)findViewById(R.id.button17);
        b5=(Button)findViewById(R.id.button18);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Dhaka.this,ViewSearch.class);
                q="Dhamrai Upazila";
                i.putExtra("s",q);

                startActivity(i);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Dhaka.this,ViewSearch.class);
                q= "Dohar Upazila";
                i.putExtra("s",q);

                startActivity(i);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Dhaka.this,ViewSearch.class);
                q= "Keraniganj Upazila";
                i.putExtra("s",q);

                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Dhaka.this,ViewSearch.class);
                q= "Nawabganj Upazila";
                i.putExtra("s",q);

                startActivity(i);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Dhaka.this,ViewSearch.class);
                q= "Savar Upazila";
                i.putExtra("s",q);

                startActivity(i);

            }
        });







    }
}
