package com.example.toast_notification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btn1;
    Button btn2;
    Button btn3;
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Log.d(TAG, "naidem");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        btn1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("obrabotka btn1");

                Toast toast = Toast.makeText(MainActivity.this, "Nazhata btn1", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 100);
                toast.show();
            }
        }));

        btn2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("obrabotka btn2");

                Toast toast = Toast.makeText(MainActivity.this, "Nazhata btn2", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 50);
                toast.show();
            }
        }));









    }
}