package com.noriax.autotypingtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoTypeTextView lblText = (AutoTypeTextView)findViewById(R.id.lblText);
        lblText.setTextAutoTyping("Ovo je tekst koji ce da se autotypeuje");
    }
}
