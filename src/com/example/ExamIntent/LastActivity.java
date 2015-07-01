package com.example.ExamIntent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LastActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);
    }

    public void onBack (View v){
        Intent intent =new Intent(this, MyActivity.class);
        startActivity(intent);
    }
}
