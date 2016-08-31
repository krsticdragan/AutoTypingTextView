package com.noriax.autotypingtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dragankrstic.autotypetextview.AutoTypeTextView;

public class MainActivity extends AppCompatActivity {
    AutoTypeTextView lblTextWithMistakes, lblTextWithoutMistakes, lblTextEncryption, lblTextDecryption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblTextWithoutMistakes = (AutoTypeTextView)findViewById(R.id.lblTextWithoutMistakes);
        lblTextWithMistakes = (AutoTypeTextView)findViewById(R.id.lblTextWithMistakes);
        lblTextDecryption = (AutoTypeTextView)findViewById(R.id.lblTextDecryption);
        lblTextEncryption = (AutoTypeTextView)findViewById(R.id.lblTextEncryption);

        lblTextWithoutMistakes.setTypingSpeed(100);
        lblTextWithMistakes.setTypingSpeed(100);
        lblTextWithMistakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTextWithMistakes.setTextAutoTyping("Hello World! This is AutoTypeTextView.");
            }
        });

        lblTextWithoutMistakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTextWithoutMistakes.setTextAutoTypingWithMistakes("Hello World! This is AutoTypeTextView.", AutoTypeTextView.PRECISSION_MED);
            }
        });

        lblTextEncryption.setEncryptionSpeed(30);
        lblTextEncryption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTextEncryption.animateEncryption("Hello World! This is AutoTypeTextView");
            }
        });

        lblTextDecryption.setDecryptionSpeed(100);
        lblTextDecryption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblTextDecryption.animateDecryption("Hello World! This is AutoTypeTextView");
            }
        });

    }
}
