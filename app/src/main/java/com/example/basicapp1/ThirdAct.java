package com.example.basicapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThirdAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void switchPage(View view)
    {
        Intent intent = null;
        switch(view.getId())
        {
            case R.id.button1:
                intent = new Intent(this, MainActivity.class);
                break;
            case R.id.button2:
                intent = new Intent(this, DisplayMessages.class);
                break;
            case R.id.button4:
                intent = new Intent(this, FourthAct.class);
                break;
        }
        startActivity(intent);
    }
}
