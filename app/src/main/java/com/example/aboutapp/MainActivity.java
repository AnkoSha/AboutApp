package com.example.aboutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);

    }
    public void onClick(View view) {
        EditText userEditText = (EditText) findViewById(R.id.editTextText);
        EditText whoEditText = (EditText) findViewById(R.id.editTextText3);
        EditText giftEditText = (EditText) findViewById(R.id.editTextText2);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
// в ключ username пишем текст из первого текстового поля
        intent.putExtra("username", userEditText.getText().toString());
        intent.putExtra("whousername", whoEditText.getText().toString());
// в ключ gift пишем текст из второго текстового поля
        intent.putExtra("gift", giftEditText.getText().toString());
        startActivity(intent);
    }
}
