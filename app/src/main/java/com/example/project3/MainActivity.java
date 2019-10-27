package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {
        final TextView tscore = (TextView) findViewById(R.id.textView);
        final EditText Q1 = (EditText) findViewById(R.id.editText2);
        CheckBox A10 = (CheckBox) findViewById(R.id.checkBox);
        RadioButton rgoogle = (RadioButton) findViewById(R.id.radioButton15);
        RadioButton ryes = (RadioButton) findViewById(R.id.radioButton11);
        name = Q1.getText().toString();
             //case of full points
        if (name.equalsIgnoreCase("Android")  && A10.isChecked() && rgoogle.isChecked() && ryes.isChecked()){
            tscore.setText("4 point of 4");
            Toast.makeText(getApplicationContext(), "GJ !!! 4 point ", Toast.LENGTH_LONG).show();
            // case if 3 points
        } else if (name.equalsIgnoreCase("Android")  && A10.isChecked() && rgoogle.isChecked() ) {
            tscore.setText("3 of 4 point");
            Toast.makeText(getApplicationContext(), "GJ !!! 3 point ", Toast.LENGTH_LONG).show();
        }else if (name.equalsIgnoreCase("Android")  && A10.isChecked() && ryes.isChecked()) {
            tscore.setText("3 of 4 point");
            Toast.makeText(getApplicationContext(), "GJ !!! 3 point ", Toast.LENGTH_LONG).show();

        } else if (A10.isChecked() && ryes.isChecked() && rgoogle.isChecked()) {
            tscore.setText("3 of 4 point");
            Toast.makeText(getApplicationContext(), "GJ !!! 3 point ", Toast.LENGTH_LONG).show();
        } else if (name.equalsIgnoreCase("Android") && ryes.isChecked() && rgoogle.isChecked()) {
            tscore.setText("3 of 4 point");
            Toast.makeText(getApplicationContext(), "GJ !!! 3 point ", Toast.LENGTH_LONG).show();
            //// case of 2 points
        } else if (name.equalsIgnoreCase("Android")&& rgoogle.isChecked()){
            tscore.setText("2 of 4 point");
            Toast.makeText(getApplicationContext(), "GJ !!! 2 point ", Toast.LENGTH_LONG).show();

        } else if (name.equalsIgnoreCase("Android")&& A10.isChecked()){
            tscore.setText("2 of 4 point");
            Toast.makeText(getApplicationContext(), "GJ !!! 2 point ", Toast.LENGTH_LONG).show();

        } else if (name.equalsIgnoreCase("Android")&& ryes.isChecked()){
            tscore.setText("2 of 4 point");
            Toast.makeText(getApplicationContext(), "GJ !!! 2 point ", Toast.LENGTH_LONG).show();
        } else if (rgoogle.isChecked()&& ryes.isChecked()){
            tscore.setText("2 of 4 point");
            Toast.makeText(getApplicationContext(), "GJ !!! 2 point ", Toast.LENGTH_LONG).show();
        } else if (rgoogle.isChecked()&& A10.isChecked()){
            tscore.setText("2 of 4 point");
            Toast.makeText(getApplicationContext(), "GJ !!! 2 point ", Toast.LENGTH_LONG).show();
        }else if (ryes.isChecked()&& A10.isChecked()){
            tscore.setText("2 of 4 point");
            Toast.makeText(getApplicationContext(), "GJ !!! 2 point ", Toast.LENGTH_LONG).show();
            /// caseof 1 point
        } else if (name.equalsIgnoreCase("Android")  || A10.isChecked() || rgoogle.isChecked() || ryes.isChecked()){
            tscore.setText("1 point of 4");
            Toast.makeText(getApplicationContext(), "GJ !!! 1 point ", Toast.LENGTH_LONG).show();
        } else {
            tscore.setText("Try again");
            Toast.makeText(getApplicationContext(), "Try again ): ", Toast.LENGTH_LONG).show();
        }
















    }
}
