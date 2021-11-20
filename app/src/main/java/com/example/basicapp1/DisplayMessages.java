package com.example.basicapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_messages);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        Bundle extras = intent.getExtras(); //get attached bundle from intent
        //String message = intent.getStringExtra(EXTRA_MESSAGE); for one single variable in Extra
        String message = extras.getString("TEXT");
        String pass = extras.getString("PASS");
        String radio = extras.getString("RADIO");
        String sleep = extras.getString("CHOICE1");
        String work = extras.getString("CHOICE2");
        String PC = extras.getString("SWITCH");
        String planet = extras.getString("PLANET");
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        String set = "Text: " + message + "\n Password: " + pass + "\n Radio Choice: " + radio + "\n Your checkbox choice(s) are: " + sleep + " " + work
                        + "\n Your PC will sleep?: " + PC + "\nYour choice of planet is: " + planet;
        textView.setText(set);
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
                intent = new Intent(this, ThirdAct.class);
                break;
            case R.id.Page4:
                intent = new Intent(this, FourthAct.class);
                break;
        }
        startActivity(intent);
    }
}
