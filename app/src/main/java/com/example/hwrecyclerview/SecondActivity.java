package com.example.hwrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText editText;
    String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText = findViewById(R.id.as_editText);

        Intent intent = getIntent();

        Button button = findViewById(R.id.return_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = editText.getText().toString();
                Intent intent1 = new Intent();
                intent1.putExtra("result_key", text);

                setResult(RESULT_OK, intent1);
                finish();
            }
        });
    }
}
