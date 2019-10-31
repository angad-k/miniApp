package com.example.miniapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends FragmentActivity implements View.OnClickListener {


    private Button mButton, nButton;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.next); nButton = findViewById(R.id.submit);
        mButton.setOnClickListener(this);   nButton.setOnClickListener(this);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        // Replace the contents of the container with the new fragment
        ft.replace(R.id.your_placeholder, new namefrag());
        // or ft.add(R.id.your_placeholder, new FooFragment());
        // Complete the changes added above
        ft.commit();
    }

    public void onClick(View view)
    {

        switch (view.getId()) {
            case R.id.next:
                EditText name=(EditText)findViewById(R.id.name);
                String str_name = name.getText().toString();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                // Replace the contents of the container with the new fragment
                ft.replace(R.id.your_placeholder, new emailfrag());
                // or ft.add(R.id.your_placeholder, new FooFragment());
                // Complete the changes added above
                ft.commit();
                break;
            case R.id.submit:
                EditText email=(EditText)findViewById(R.id.email);
                String str_email = email.getText().toString();

                // Do something
        }



}}
