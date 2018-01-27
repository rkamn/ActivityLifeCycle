package com.example.rakesh.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Greeting extends AppCompatActivity {
    TextView tvgreeting,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        tvgreeting = (TextView)findViewById(R.id.tvgreeting);
        sum = (TextView)findViewById(R.id.sum);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("Name");
        int n1 = bundle.getInt("Num1");
        int n2 = bundle.getInt("Num2");
        tvgreeting.setText("Welcome :"+name);
        sum.setText("Total Sum :"+(n1+n2));
    }

}
