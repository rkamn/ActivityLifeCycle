package com.example.rakesh.activitylifecycle;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etname,etnum1,etnum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"oncreate called",Toast.LENGTH_SHORT).show();
        etname = (EditText) findViewById(R.id.etname);
        etnum1 = (EditText)findViewById(R.id.etnum1);
        etnum2 = (EditText) findViewById(R.id.etnum2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onstart called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(this,"onresume called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onstop called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"ondistroy called",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onrestart called",Toast.LENGTH_SHORT).show();

    }

    public void process(View view) {
        String name = etname.getText().toString();
        String num1 = etnum1.getText().toString();
        String num2 = etnum2.getText().toString();
        int n1 = Integer.parseInt(num1); //convet to int
        int n2 = Integer.parseInt(num2); //convet to int
        Bundle bundle = new Bundle();
        bundle.putString("Name",name);
        bundle.putInt("Num1",n1);
        bundle.putInt("Num2",n2);
        if(validatefield()) {

            Intent intent = new Intent(this, Greeting.class);
            intent.putExtras(bundle);
            Toast.makeText(this,"welcome to submitted page",Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    }
    public boolean validatefield() {
        if ("".equals(etname.getText().toString())){
            etname.setError("Please Fill your name");
            return false;
        }else if ("".equals(etnum1.getText().toString())) {
            etnum2.setError("please fill the blank with number");
            return false;
        }else if ("".equals(etnum2.getText().toString())) {
            etnum2.setError("please fill the blank with number");
            return false;
        }
        else
            return true;
    }
}
