package com.example.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.checkboxes_and_etc.R.string.cherries;
import static com.example.checkboxes_and_etc.R.string.chocolate_syrup;
import static com.example.checkboxes_and_etc.R.string.crushes_nuts;
import static com.example.checkboxes_and_etc.R.string.orio_cookies_crumbles;
import static com.example.checkboxes_and_etc.R.string.sprinkles;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        String message = "Toppings : ";

        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        final CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkBox5);

        if (checkBox1.isChecked())
        {
            message += getString(chocolate_syrup)+" ";
        }
        if (checkBox2.isChecked())
        {
            message += getString(sprinkles)+" ";

        }
        if (checkBox3.isChecked())
        {
            message += getString(crushes_nuts)+" ";

        }
        if (checkBox4.isChecked())
        {
            message += getString(cherries)+" ";

        }
        if (checkBox5.isChecked())
        {
            message += getString(orio_cookies_crumbles)+" ";

        }

        displayToast(message);

    }
    public void displayToast(String message) {

        Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT).show();
    }
}