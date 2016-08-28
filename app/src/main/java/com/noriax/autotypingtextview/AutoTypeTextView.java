package com.noriax.autotypingtextview;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by dragankrstic on 8/28/16.
 */
public class AutoTypeTextView extends TextView {
    private int typingInterval=100;
    private Handler handler;
    private int counter=0;

    public AutoTypeTextView(Context context) {
        super(context);
    }

    public AutoTypeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AutoTypeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setTextAutoTyping(final String text) {
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setText(text.substring(0,counter));
                counter++;
                if(text.length()>=counter) {
                    postDelayed(this, getTypingInterval());
                }
            }
        }, getTypingInterval());
    }

    public int getTypingInterval() {
        return typingInterval;
    }

    public void setTypingInterval(int typingInterval) {
        this.typingInterval = typingInterval;
    }
}
