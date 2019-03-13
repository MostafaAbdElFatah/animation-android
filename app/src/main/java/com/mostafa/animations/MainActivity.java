package com.mostafa.animations;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        textView = findViewById(R.id.textView);

    }

    public void showDetailsActivity(View view) {
        Pair[] pairs = new Pair[3];
        pairs[0] = new Pair<View,String>(imageView1,"image_1_Animation");
        pairs[1] = new Pair<View,String>(imageView2,"image_2_Animation");
        pairs[2] = new Pair<View,String>(textView,"text_Animation");
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,pairs);
            Intent intent =new Intent(MainActivity.this,DetailsActivity.class);
            startActivity(intent,options.toBundle());
        }else {
            Intent intent =new Intent(this,DetailsActivity.class);
            startActivity(intent);
        }
    }
}
