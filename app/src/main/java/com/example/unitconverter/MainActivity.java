package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button convert;
        TextView inch_tv;
        EditText et_cm;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        convert = findViewById(R.id.Main_convert_btn);
        et_cm = findViewById(R.id.Main_et_cm);
        inch_tv = findViewById(R.id.Main_tv_inch);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = et_cm.getText().toString();
                if(!input.isEmpty()){
                    float cm = Float.parseFloat(input);
                    cm*=0.39370079;
                    String res = String.format("%.2f", cm);
                    inch_tv.setText(String.valueOf(res));
                }else{
                    Toast.makeText(getApplicationContext(),"Enter valid unit ):",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}