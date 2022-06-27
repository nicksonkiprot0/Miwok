package com.example.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbersTextView = findViewById(R.id.numbers_textview);
        numbersTextView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
            startActivity(intent);

        });

        TextView textView = findViewById(R.id.textview_family_members);
        textView.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FamilyMembers.class);
            startActivity(intent);
        });

        TextView colorTextView = findViewById(R.id.textview_colors);
        colorTextView.setOnClickListener(view -> {
            Intent color = new Intent(MainActivity.this, ColorsActivity.class);
            startActivity(color);
        });

        TextView textViewPhrases = findViewById(R.id.textview_phrases);
        textViewPhrases.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
            startActivity(intent);
        });
    }
}