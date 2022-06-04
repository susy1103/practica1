package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView = findViewById( R.id.btnPrincipal );
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, PrincipalActivity.class);
                startActivity(intent);

                Toast.makeText(Login.this, "You clicked on text", Toast.LENGTH_SHORT).show();
            }
        });

        textView = findViewById(R.id.btnRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, RegisterActivity.class);
                startActivity(intent);

                Toast.makeText(Login.this, "You Clicked on text", Toast.LENGTH_SHORT).show();
            }
        });

        textView = findViewById(R.id.btnTerms);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, TermsActivity.class);
              startActivity(intent);

              Toast.makeText(Login.this, "You Cliked on Text", Toast.LENGTH_SHORT).show();
            }
        });
    }
}