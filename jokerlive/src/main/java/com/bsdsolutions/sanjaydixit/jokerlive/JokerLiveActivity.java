package com.bsdsolutions.sanjaydixit.jokerlive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokerLiveActivity extends AppCompatActivity {

    private TextView mDisplayTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(JokerLiveUtils.INTENT_KEY_JOKE);
        if(joke == null || joke.length() == 0) {
            joke = "Knock! Knock!";
        }
        mDisplayTextView = (TextView)findViewById(R.id.jokerLiveTextView);
        if(mDisplayTextView != null) {
            mDisplayTextView.setText(joke);
        }
    }
}
