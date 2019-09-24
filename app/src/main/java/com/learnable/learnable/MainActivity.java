package com.learnable.learnable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayouthtml;
    LinearLayout linearLayoutcss;
    LinearLayout linearLayoutjavascript;
    LinearLayout linearLayoutwordpress;
    LinearLayout linearLayoutlaravel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayouthtml = (LinearLayout) findViewById(R.id.linearhtml);
        linearLayoutcss = (LinearLayout) findViewById(R.id.linearcss);
        linearLayoutjavascript = (LinearLayout) findViewById(R.id.linearjavascript);
        linearLayoutwordpress = (LinearLayout)  findViewById(R.id.linearwordpress);
        linearLayoutlaravel = (LinearLayout) findViewById(R.id.linearlaravel);

        linearLayouthtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inthtml = new Intent(MainActivity.this,HTMLActivity.class);
                startActivity(inthtml);
            }
        });

        linearLayoutcss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcss = new Intent(MainActivity.this,CssActivity.class);
                startActivity(intcss);
            }
        });

        linearLayoutjavascript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intjavascript = new Intent(MainActivity.this,JavaActivity.class);
                startActivity(intjavascript);
            }
        });
        linearLayoutwordpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intwordpress = new Intent(MainActivity.this,WordpressActivity.class);
                startActivity(intwordpress);
            }
        });

        linearLayoutlaravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intlaravel = new Intent(MainActivity.this,LaravelActivity.class);
                startActivity(intlaravel);
            }
        });
    }
}
