package com.example.tanvir.khujobangladesh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import static com.example.tanvir.khujobangladesh.R.drawable.dhamraiupazila;

public class ViewSearch extends Activity {
    TextView tq;
    ImageView im;

    ScaleGestureDetector sc;
    Matrix mt;
    int y;

    float max=3.0f;
    float min=1.0f;
    float xstart=0;
    float ystart=0;
    float xtransform=0;
    float ytransform=0;
    Button b1;
    String s;
    String toSpeak,r;
    private final static  int None=0;
    private final static  int Pan=1;
    private final static  int Zoom=2;
    int state;
    TextToSpeech sp;
    float mScaleFactor=0.1f;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_search);

        tq = (TextView) findViewById(R.id.textView2);
        im = (ImageView) findViewById(R.id.imageView);
        b1 = (Button) findViewById(R.id.button2);
        sp = new TextToSpeech(ViewSearch.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    sp.setLanguage(Locale.US);
                }
            }
        });


        mt = new Matrix();
        sc = new ScaleGestureDetector(this, new Scale());


        s = getIntent().getExtras().getString("s");
        tq.setText(s);


        im.getLayoutParams().width = 2000;
        im.getLayoutParams().height = 6000;
        im.setAdjustViewBounds(true);
       r = s.replace(' ', '_');

        if ("Dhamrai_Upazila".equals(r)) {
            im.setImageResource(dhamraiupazila);


            toSpeak = "Dhamrai Upazila is located about 40 kilometers north west of the capital city of Dhaka. It is one of the six Upazilas of Dhaka district. The Upazila is surrounded by the Upazilas of Mirzapur and Kaliakair and Nagarpur on the north, Singair on the south, Savar in the east and Saturia on the west";


        } else if ("Dohar_Upazila".equals(r)) {
            im.setImageResource(R.drawable.dohar);

            toSpeak = "Dohar is located at 23.5958°N 90.1222°E. It has 31,645 households and a total area of 161.49 km². One of the largest rivers of Bangladesh, the Padma, is situated in the southern and south-western part of Dohar.";
        } else if ("Keraniganj_Upazila".equals(r)) {
            im.setImageResource(R.drawable.keraniganj);

            toSpeak = "The town of Keraniganj stands on the southwest side of Dhaka City on the bank of the Buriganga river. Keraniganj Upazila with an area of 166.87 km2, is bounded by Savar Upazila and Mohammadpur, Hazaribagh, Kamrangir Char, Lalbagh, Kotwali and Sutrapur Thanas to the northeast, Shyampur Thana and Narayanganj and Sadar Upazilas to the east, Serajdikhan Upazila to the south, and by Nawabganj and Singair Upazilas to the west.";
        } else if (r.equals("Nawabganj_Upazila")) {
            im.setImageResource(R.drawable.nawabganj);

            toSpeak = "Nawabganj is located at 23.6667°N 90.1667°E. It has 47,411 households and total area 244.81 km².";
        } else if ("Savar_Upazila".equals(r)) {
            im.setImageResource(R.drawable.savar);

            toSpeak = "Savar is located at 23.8583°N 90.2667°E. It has 66,956 units of household and a total area of 280.13 square kilometres ";
        } else {
            im.setImageResource(R.drawable.a);
        }



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               sp.setLanguage(Locale.US);
                sp.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
sc.onTouchEvent(event);
        switch(event.getAction()&MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                state=Pan;
                xstart=event.getX();
                ystart=event.getY();
                break;
            case MotionEvent.ACTION_UP:
                state=None;
                xtransform=event.getX()-xstart;
                ytransform=event.getY()-ystart;
                break;
            case MotionEvent.ACTION_MOVE:

                break;
            case MotionEvent.ACTION_POINTER_DOWN:
                state=Zoom;
                break;
        }
        sc.onTouchEvent(event);
        if((state==Pan && mScaleFactor!=min)|| state==Zoom){


        }

        return true;
    }

    private class Scale extends ScaleGestureDetector.SimpleOnScaleGestureListener
{
    @Override
    public boolean onScale(ScaleGestureDetector detector) {
        mScaleFactor*=detector.getScaleFactor();
        mScaleFactor=Math.max(0.1f,Math.min(mScaleFactor,.5f));
        mt.setScale(mScaleFactor,mScaleFactor);
        im.setImageMatrix(mt);
        return true;
    }

}
    public void onPause(){
        if(sp !=null){
            sp.stop();
            sp.shutdown();
        }
        super.onPause();
    }
   }
