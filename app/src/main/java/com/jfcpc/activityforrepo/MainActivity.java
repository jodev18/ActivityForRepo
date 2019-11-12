package com.jfcpc.activityforrepo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YoYo.with(Techniques.Tada)
                .duration(1000)
                .repeat(5)
                .playOn(findViewById(R.id.hworld));
    }
}
