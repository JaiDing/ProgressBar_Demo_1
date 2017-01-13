package com.mumu.progressbar_demo_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar ProgressBar_1;
    private Button button_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressBar_1 = (ProgressBar) findViewById(R.id.ProgressBar_1);
        button_1 = (Button) findViewById(R.id.Button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ProgressBar_1.getVisibility() == view.GONE) {
                    ProgressBar_1.setVisibility(View.VISIBLE);
                }else {
                    ProgressBar_1.setVisibility(View.GONE);
                }
            }
        });
    }
}
