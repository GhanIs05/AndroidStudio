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
    Double temperature;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp = (EditText) findViewById(R.id._e_temp);
         b2 = findViewById(R.id._r_farenheit);
         b1 = findViewById(R.id._r_celcius);
         ok = (Button) findViewById(R.id._b_ok);
         result = findViewById(R.id._t_result);
         temperature = 0.0;
         str = "0.0";
    }

    public void convertTemperature(View view) {
        str = result.getText().toString();
        result.setText("Enter value");
        if (b1.isChecked()) {
            str = temp.getText().toString();
            try {
                temperature = Double.parseDouble(str);
                double celcius = (5.0 / 9.0) * (temperature - 32);
                result.setText("Result" + celcius + "c");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (b2.isChecked()) {
            str = temp.getText().toString();
            try {
                temperature = Double.parseDouble(str);
                double farenheit = temperature * (9.0 / 5.0) + 32;
                result.setText("Result: " + farenheit + "f");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
