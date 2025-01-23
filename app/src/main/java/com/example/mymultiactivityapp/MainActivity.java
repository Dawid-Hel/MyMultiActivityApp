package com.example.mymultiactivityapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public static final String IntentName = "name";
    public static final String IntentSurname = "surname";
    public static final String IntentEmail = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNavigate = findViewById(R.id.buttonNavigate);
        TextView textView1 = findViewById(R.id.name);
        TextView textView2 = findViewById(R.id.surname);
        TextView textView3 = findViewById(R.id.email);

        buttonNavigate.setOnClickListener(v-> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("message", "Witaj z MainActivity");
            startActivity(intent);
        });
        String name = getIntent().getStringExtra(IntentName);
        String surname = getIntent().getStringExtra(IntentSurname);
        String emial = getIntent().getStringExtra(IntentEmail);
        if (name != null){
        textView1.setText("Wpisane imię: " + name);
        }
        if (surname != null){
            textView2.setText("Wpisane nazwisko: " + surname);
        }
        if (emial != null){
            textView3.setText("Wpisany e-mail: " + emial);
        }
    }

}