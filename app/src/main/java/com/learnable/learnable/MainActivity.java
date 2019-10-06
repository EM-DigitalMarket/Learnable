package com.learnable.learnable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayouthtml;
    LinearLayout linearLayoutcss;
    LinearLayout linearLayoutjavascript;
    LinearLayout linearLayoutwordpress;
    LinearLayout linearLayoutlaravel;
    LinearLayout linearLayoutGit;
    LinearLayout linearLayoutExcel;
    LinearLayout linearLayoutPHP;
    LinearLayout linearLayoutbootstrap;
    LinearLayout linearLayoutjquery;
    LinearLayout linearLayoutSql;
    LinearLayout linearLayoutIcdl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayouthtml = (LinearLayout) findViewById(R.id.linearhtml);
        linearLayoutcss = (LinearLayout) findViewById(R.id.linearcss);
        linearLayoutjavascript = (LinearLayout) findViewById(R.id.linearjavascript);
        linearLayoutwordpress = (LinearLayout)  findViewById(R.id.linearwordpress);
        linearLayoutlaravel = (LinearLayout) findViewById(R.id.linearlaravel);
        linearLayoutGit = (LinearLayout) findViewById(R.id.lineargit);
        linearLayoutExcel = (LinearLayout) findViewById(R.id.linearexcel);
        linearLayoutPHP = (LinearLayout) findViewById(R.id.linearphp);
        linearLayoutbootstrap = (LinearLayout) findViewById(R.id.linearbootstrap);
        linearLayoutjquery = (LinearLayout) findViewById(R.id.linearjquery);
        linearLayoutIcdl = (LinearLayout) findViewById(R.id.linearicdl);
        linearLayoutSql = (LinearLayout) findViewById(R.id.linearsql);

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

        linearLayoutGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intgit = new Intent(MainActivity.this, GitActivity.class);
                startActivity(intgit);
            }
        });

        linearLayoutExcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intexcel = new Intent(MainActivity.this,ExcelActivity.class);
                startActivity(intexcel);
            }
        });

        linearLayoutPHP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intphp = new Intent(MainActivity.this,PHPActivity.class);
                startActivity(intphp);
            }
        });

        linearLayoutbootstrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intbootstrap = new Intent(MainActivity.this,BootStrapActivity.class);
                startActivity(intbootstrap);
            }
        });

        linearLayoutjquery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intjquery = new Intent(MainActivity.this,JqueryActivity.class);
                startActivity(intjquery);
            }
        });

        linearLayoutSql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intsql = new Intent(MainActivity.this,SQLActivity.class);
                startActivity(intsql);
            }
        });

        linearLayoutIcdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inticdl = new Intent(MainActivity.this,ICDLActivity.class);
                startActivity(inticdl);
            }
        });
    }
}
