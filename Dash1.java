package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dash1 extends AppCompatActivity {

    CardView one;
    CardView two;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash1);
//        four=findViewById(R.id.four);
//        four.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(Dashboard.this, MainActivity.class));
//            }
//        });


        btn = findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dash1.this, Muco.class));
            }
        });

        two = findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dash1.this, ClassifierActivity.class));
            }
        });
//        });
//        three=findViewById(R.id.three);
//        three.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(Dashboard.this,three.class));
//            }
//        });
        one = findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dash1.this, Map.class));
            }
        });
    }
}