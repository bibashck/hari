package com.example.driving;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpAct extends AppCompatActivity {

    Animation frombottom, fromtop;
    Button btnjoin;
    TextView textView2;
    EditText editText2, editText5, editText3, editText7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);



        btnjoin = (Button) findViewById(R.id.btnjoin);
        textView2 = (TextView) findViewById(R.id.textView2);

        editText2 = (EditText) findViewById(R.id.editText2);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText7 = (EditText) findViewById(R.id.editText7);




    }
}
