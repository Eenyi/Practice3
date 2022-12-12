package com.example.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.assist.AssistStructure;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox done, pending, read;
    TextView result;
    Switch d, p, r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        done = findViewById(R.id.checkBox);
        pending = findViewById(R.id.checkBox2);
        read = findViewById(R.id.checkBox3);

        result = findViewById(R.id.textView);

        d = findViewById(R.id.switch1);
        p = findViewById(R.id.switch2);
        r = findViewById(R.id.switch3);

        done.setOnClickListener(this);
        pending.setOnClickListener(this);
        read.setOnClickListener(this);

        result.setOnClickListener(this);

        d.setOnClickListener(this);
        p.setOnClickListener(this);
        r.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.switch1:
                if (d.isChecked())
                    result.setText("S-Done");
                else {
                    result.setText("Not-Set");
                }
                break;
            default:
                result.setText("waiting");
                break;
        }
    }
}