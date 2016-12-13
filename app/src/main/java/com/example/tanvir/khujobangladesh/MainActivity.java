package com.example.tanvir.khujobangladesh;

import android.content.Intent;
import android.graphics.Bitmap;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import java.io.ByteArrayOutputStream;





public class MainActivity extends Activity {

    Button b1,b2;
    AutoCompleteTextView auto;
    String q;
    Bitmap bm;
    byte[] byteArray;

    String keywords []={"Dhamrai Upazila","Dohar Upazila","Keraniganj Upazila",
            "Nawabganj Upazila","Savar Upazila","Gazipur Sadar Upazila","Kaliakair Upazila","Kaliganj Upazila","Kapasia Upazila","Sreepur Upazila"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button7);
        b2=(Button)findViewById(R.id.button12);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Khujun.class);

                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MapDisplay.class);

                startActivity(i);

            }
        });
    }
}
