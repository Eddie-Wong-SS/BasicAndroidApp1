package com.example.basicapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FourthAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void switchPage(View view)
    {
        Intent intent = null;
        switch(view.getId())
        {
            case R.id.Page1:
                intent = new Intent(this, MainActivity.class);
                break;
            case R.id.Page2:
                intent = new Intent(this, DisplayMessages.class);
                break;
            case R.id.Page3:
                intent = new Intent(this, ThirdAct.class);
                break;
        }
        startActivity(intent);
    }
}
