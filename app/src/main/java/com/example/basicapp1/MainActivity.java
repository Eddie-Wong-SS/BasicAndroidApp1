package com.example.basicapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String addListenButton() //checks radiobutton in radio group for input
    {
        RadioGroup rGroup = findViewById(R.id.Pets);
        int selectId = rGroup.getCheckedRadioButtonId(); //gets selected button number
        RadioButton rButt = findViewById(selectId);
        return rButt.getText().toString();
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        String sleeps = "", works = "", choice = "";
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessages.class); //Creates new Activity object
        Bundle extras = new Bundle();
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);
        String message = editText.getText().toString();
        String pass = editText2.getText().toString();

        String radio = addListenButton(); //calls a function to get radiobutton input
        CheckBox sleep = findViewById(R.id.checkBox);
        CheckBox work = findViewById(R.id.checkBox2);
        if(sleep.isChecked()) //checks if chosen checkbox is checked
            sleeps = "Sleep ";
        if(work.isChecked())
             works = "Work ";
        Switch off = findViewById(R.id.switch1);
        Boolean switchState = off.isChecked();
        if(switchState) choice = "Yes";
        else choice = "No";
        Spinner planar = findViewById(R.id.spinner);
        String planet = String.valueOf(planar.getSelectedItem());
        extras.putString("TEXT", message); //adds values to a bundle(can put many data types at once)
        extras.putString("PASS", pass);
        extras.putString("RADIO", radio);
        extras.putString("CHOICE1", sleeps);
        extras.putString("CHOICE2", works);
        extras.putString("SWITCH", choice);
        extras.putString("PLANET", planet);
        intent.putExtras(extras);
        startActivity(intent);

    }

    public void switchPage(View view)
    {
        Intent intent = null;
        switch(view.getId())
        {
            case R.id.Page2:
                intent = new Intent(this, DisplayMessages.class);
                break;
            case R.id.Page3:
                intent = new Intent(this, ThirdAct.class);
                break;
            case R.id.Page4:
                intent = new Intent(this, FourthAct.class);
                break;
        }
        startActivity(intent);
    }

    // add items into spinner dynamically
    /*public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("list 1");
        list.add("list 2");
        list.add("list 3");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }*/
}
