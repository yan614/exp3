package com.example.exp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button Another;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Another=findViewById(R.id.Another);
        Another.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                //启动能够相应设置的这个action的活动，在清单中已设置过action属性
                intent.setAction("startAnotherActivity");
                startActivity(intent);
            }
        });
    }
}
