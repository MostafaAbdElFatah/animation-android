package com.mostafa.animations;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;

public class DetailsActivity extends AppCompatActivity {

    View root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int i=3;
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        root = findViewById(R.id.root);
    }
}
