package org.tensorflow.lite.examples.classification;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Marker1 extends AppCompatActivity {

    private TextView hospital,number,oxy,woxy,vaccine;
    private Button btn;
    private DatabaseReference mDatabase,mDatabase1,mDatabase2,mDatabase3,mDatabase4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marker1);
        btn = findViewById(R.id.btn);
        hospital = findViewById(R.id.hosp);
        number = findViewById(R.id.num);
        oxy = findViewById(R.id.oxy);
        woxy = findViewById(R.id.woxy);
        vaccine = findViewById(R.id.vac);


        mDatabase = FirebaseDatabase.getInstance().getReference().child("hospital1").child("123").child("name");
        mDatabase1 = FirebaseDatabase.getInstance().getReference().child("hospital1").child("123").child("num");
        mDatabase2 = FirebaseDatabase.getInstance().getReference().child("hospital1").child("123").child("oxy");
        mDatabase3 = FirebaseDatabase.getInstance().getReference().child("hospital1").child("123").child("vac");
        mDatabase4 = FirebaseDatabase.getInstance().getReference().child("hospital1").child("123").child("woxy");

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()){
                            String data = snapshot.getValue().toString();
                            hospital.setText(data);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                mDatabase1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()){
                            String data = snapshot.getValue().toString();
                            number.setText(data);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                mDatabase2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()){
                            String data = snapshot.getValue().toString();
                            oxy.setText(data);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                mDatabase3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()){
                            String data = snapshot.getValue().toString();
                            vaccine.setText(data);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

                mDatabase4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()){
                            String data = snapshot.getValue().toString();
                            woxy.setText(data);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }
}