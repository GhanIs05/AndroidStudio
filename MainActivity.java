package com.example.converttemparature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText temp;
    RadioButton b1;
    RadioButton b2;
    Button ok;
    TextView result;
    Float tempearature ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp = (EditText) findViewById(R.id._e_temp);
         b2 = findViewById(R.id._r_farenheit);
         b1 = findViewById(R.id._r_celcius);
         ok = findViewById(R.id._b_ok);
         result = findViewById(R.id._t_result);

         ok.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String str = result.getText().toString();
                 result.setText("0");
                 if (b1.isChecked()) {
                     str = temp.getText().toString();
                     float tempearature = Float.parseFloat(str);
                     result.setText("Enter temperature");
                     float celcius = (5.0f / 9.0f) * (tempearature - 32);
                     result.setText("Result" + celcius);
                 } else if (b2.isChecked()) {
                     str = temp.getText().toString();
                     float tempearature = Float.parseFloat(str);
                     float farenheit = tempearature * (9 / 5) + 32;
                     result.setText("Result" + farenheit);
                 }
             }
         });
    }
}