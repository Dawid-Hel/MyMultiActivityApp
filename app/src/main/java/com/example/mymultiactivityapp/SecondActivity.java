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
        String message = getIntent().getStringExtra("message");
        textView.setText(message);
        String name = editText.getText().toString();





        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v-> {
            Intent intent = new Intent(SecondActivity.this, SecondActivity.class);
            intent.putExtra("name", editText.getUrls());
            finish();
                }
        );
    }
}
