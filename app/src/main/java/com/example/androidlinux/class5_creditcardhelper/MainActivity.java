package com.example.androidlinux.class5_creditcardhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText balance = findViewById(R.id.editBalance);
        final EditText interest = findViewById(R.id.editInterest);
        final EditText minimum = findViewById(R.id.editMin);

        final EditText interestPaid = findViewById(R.id.editInterestPaid);
        final EditText monthsRemaining = findViewById(R.id.editMonths);
        final EditText finalBalance = findViewById(R.id.editFinalBalance);

        Button compute = findViewById(R.id.button2);
        Button clear = findViewById(R.id.button3);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                balance.setText("");
                interest.setText("");
                minimum.setText("");
                interestPaid.setText("");
                monthsRemaining.setText("");
                finalBalance.setText("");
            }
        });
    }
}
