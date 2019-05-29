package com.example.xiaohuangshu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class yhzc extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yhzc);
        Button zc = (Button) findViewById(R.id.zc);
        zc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zc:
                Intent i = new Intent(yhzc.this,MainActivity.class);
                startActivity(i);
                break;
        }

    }
}
