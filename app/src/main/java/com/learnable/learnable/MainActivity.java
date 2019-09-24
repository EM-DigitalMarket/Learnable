package com.learnable.learnable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayouthtml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayouthtml = (LinearLayout) findViewById(R.id.linearhtml);

        linearLayouthtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inthtml = new Intent(MainActivity.this,HTMLActivity.class);
                startActivity(inthtml);
            }
        });
    }
}
