package com.example.kd.firstproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.edit);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string;
                string=editText.getText().toString();
                Intent intent= new Intent(MainActivity.this, Main2.class).putExtra("url", string);
                startActivity(intent);
            }
        });

//
//        editText=(EditText)findViewById(R.id.edit);
//        button=(Button)findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String string;
//                string =editText.getText().toString();
//                Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
//                Intent intent=new Intent(MainActivity.this, Main2.class);
//                intent.putExtra("key", string);
//                startActivity(intent);
//            }
//        });
    }
}
