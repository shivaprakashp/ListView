package com.shiva.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.shiva.app.list.ListOneActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnListOne).setOnClickListener(clickListOne);
    }

    private View.OnClickListener clickListOne = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        MainActivity.this.startActivity(
                new Intent(MainActivity.this,
                        ListOneActivity.class));
        }
    };
}
