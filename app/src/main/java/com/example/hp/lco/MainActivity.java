package com.example.hp.lco;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title ;
    Button signup ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        title = (TextView) findViewById(R.id.title);
        Typeface title_custom = Typeface.createFromAsset(getAssets() , "fonts/FunSized.ttf" );
        title.setTypeface(title_custom);
        title.animate().rotation(360).setDuration(2);


        Typeface btn_custom = Typeface.createFromAsset(getAssets() , "fonts/monaco.ttf");
        signup = (Button) findViewById(R.id.signup);
        signup.setTypeface(btn_custom);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(new Intent(getApplicationContext(), SignUp.class));



            }
        });


    }
}
