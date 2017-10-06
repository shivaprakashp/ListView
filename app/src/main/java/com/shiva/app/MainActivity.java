package com.shiva.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.shiva.app.list.ListOneActivity;
import com.shiva.app.list.ListTwoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnListOne).setOnClickListener(clickListOne);
        findViewById(R.id.btnListTwo).setOnClickListener(clickListTwo);
    }

    /*Simple and default android listview.
    * it works of single units of data.
    * */
    private View.OnClickListener clickListOne = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        MainActivity.this.startActivity(
                new Intent(MainActivity.this,
                        ListOneActivity.class));
        }
    };

    /*Customised listview which is used to extend BaseAdapter class.
    * */
    private View.OnClickListener clickListTwo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            MainActivity.this.startActivity(
                    new Intent(MainActivity.this,
                            ListTwoActivity.class));
        }
    };
}
