package com.example.smartstudyresource;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText email,password,name,confirm_password,phone_number,user_class,department;
    Button signUp;
    FirebaseAuth mAuth;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.singUpEmail);
        password=findViewById(R.id.singUpPassword);
        signUp=findViewById(R.id.signUpButton);
        confirm_password=findViewById(R.id.singUpPassword2);
        phone_number=findViewById(R.id.phone_number_id);
        user_class=findViewById(R.id.class_id);
        department=findViewById(R.id.depertment_id);
        name=findViewById(R.id.name_id);

        databaseReference= FirebaseDatabase.getInstance().getReference("User");

        mAuth=FirebaseAuth.getInstance();

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check valid user

                String pass=password.getText().toString().trim();
                String pass2=confirm_password.getText().toString().trim();

                if (pass.length()<6){
                    Toast.makeText(getApplicationContext(),"Please enter more than 6 char.",Toast.LENGTH_SHORT).show();
                }
                else if (!pass.equals(pass2)){
                    Toast.makeText(getApplicationContext(),"Please ensure password",Toast.LENGTH_SHORT).show();
                }

                //-----------------
                registerUser();
            }
        });
    }

    private void registerUser() {

        String userEmail=email.getText().toString();

        String userPassword=password.getText().toString();


        mAuth.createUserWithEmailAndPassword(userEmail,userPassword)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            FirebaseUser mUser=mAuth.getCurrentUser();

                            String u_id=mUser.getUid();
                            String u_email=mUser.getEmail();
                            String u_name=name.getText().toString().trim();
                            String u_password=password.getText().toString().trim();
                            String u_phone=phone_number.getText().toString().trim();
                            String u_class=user_class.getText().toString().trim();
                            String u_department=department.getText().toString();



                            User user=new User(u_id,u_email,u_name,u_password,u_phone,u_class,u_department);

                            databaseReference.child(u_id).setValue(user);



                            Toast.makeText(getApplicationContext(),"Register Successfull",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Home.class));
                            finish();
                        }else {
                            Toast.makeText(getApplicationContext(),"Failed to create account",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
