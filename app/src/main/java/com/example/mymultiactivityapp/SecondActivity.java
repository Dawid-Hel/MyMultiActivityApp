package com.example.mymultiactivityapp;

import android.annotation.SuppressLint;
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

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textViewMessage);
        EditText editText = findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        String message = getIntent().getStringExtra("message");
        textView.setText(message);


        Button submit = findViewById(R.id.submit);
        Button buttonBack = findViewById(R.id.buttonBack);

        submit.setOnClickListener(v-> {
            String name = editText.getText().toString();
            String surname = editText2.getText().toString();
            String email = editText3.getText().toString();
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            intent.putExtra(MainActivity.IntentName, name);
            intent.putExtra(MainActivity.IntentSurname, surname);
            intent.putExtra(MainActivity.IntentEmail, email);
            startActivity(intent);
            finish();

        });
        buttonBack.setOnClickListener(v-> {
            finish();
        });

    }
}
