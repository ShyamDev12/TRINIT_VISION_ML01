package org.tensorflow.lite.examples.classification;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {

    EditText mail , password;
    Button btn;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //getSupportActionBar().setTitle("Login Forum");

        mail = (EditText)findViewById(R.id.mail);
        password = (EditText)findViewById(R.id.password);
        btn = (Button)findViewById(R.id.btn);

        firebaseAuth = FirebaseAuth.getInstance();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = mail.getText().toString().trim();
                String pass = password.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    Toast.makeText(Login.this,"Please Enter Email",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(pass)){
                    Toast.makeText(Login.this,"Please Enter Password",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(pass.length() < 6){
                    Toast.makeText(Login.this,"Password too short",Toast.LENGTH_SHORT).show();

                }

                firebaseAuth.signInWithEmailAndPassword(email, pass)
                        .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {

                                    startActivity(new Intent(getApplicationContext(),Report.class));

                                } else {

                                    Toast.makeText(Login.this,"Login Failed or User not Available",Toast.LENGTH_SHORT).show();

                                }
                            }
                        });



            }
        });



    }
}