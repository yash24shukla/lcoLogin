package com.example.hp.lco;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
TextView registerTitle ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        registerTitle = (TextView) findViewById(R.id.registerTitle);
        Typeface title_custom = Typeface.createFromAsset(getAssets() , "fonts/FunSized.ttf" );
        registerTitle.setTypeface(title_custom);

    }
}
