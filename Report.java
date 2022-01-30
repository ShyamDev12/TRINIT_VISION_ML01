package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Report extends AppCompatActivity {

    TextInputLayout name,email,phone,covid,detail,date;
    Button btn,back;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        //Hooks to all xml elements in activity_sign_up.xml
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        covid = findViewById(R.id.covid);
        detail = findViewById(R.id.detail);
        date = findViewById(R.id.date);
        btn = findViewById(R.id.but);
        back = findViewById(R.id.back);


        //Save data in FireBase on button click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("people");

                String name1 = name.getEditText().getText().toString();
                String email1 = email.getEditText().getText().toString();
                String phone1 = phone.getEditText().getText().toString();
                String covid1 = covid.getEditText().getText().toString();
                String detail1 = detail.getEditText().getText().toString();
                String date1 = date.getEditText().getText().toString();

                UserHelperClass helperClass = new UserHelperClass(name1, email1, phone1, covid1, detail1,date1);

                reference.child(phone1).setValue(helperClass);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Report.this,Dashboard.class));
            }
        });

    }
}