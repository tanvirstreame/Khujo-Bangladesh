package com.example.tanvir.khujobangladesh;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class Khujun extends Activity {

        Button b1;
        AutoCompleteTextView auto;
        String q;
        Bitmap bm;
        byte[] byteArray;

        String keywords []={"Dhamrai Upazila","Dohar Upazila","Keraniganj Upazila",
                "Nawabganj Upazila","Savar Upazila","Gazipur Sadar Upazila","Kaliakair Upazila","Kaliganj Upazila","Kapasia Upazila","Sreepur Upazila"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_khujun);
            auto=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
            auto.setAdapter(new ArrayAdapter<String>(this,R.layout.suggestion,keywords));
            b1=(Button)findViewById(R.id.button);



            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Khujun.this,ViewSearch.class);
                    q= auto.getText().toString();
                    i.putExtra("s",q);



                    startActivity(i);

                }
            });
        }
    }
