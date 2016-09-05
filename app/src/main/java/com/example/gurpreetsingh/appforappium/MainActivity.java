package com.example.gurpreetsingh.appforappium;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button submit;
    String namevalue,emailvalue,passwordvalue;
    EditText name,email,password;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        submit=(Button)findViewById(R.id.button1);

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                namevalue=name.getText().toString();
                emailvalue=email.getText().toString();
                passwordvalue=password.getText().toString();
//                Toast.makeText(getApplicationContext(),namevalue+emailvalue+passwordvalue,Toast.LENGTH_LONG).show();
                if((namevalue.equals(""))||(emailvalue.equals(""))||(passwordvalue.equals(""))){
                    Toast.makeText(getApplicationContext(),"Enter data first",Toast.LENGTH_LONG).show();
                }
                else{
                Toast.makeText(getApplicationContext(),"Your data has been successfully submitted",Toast.LENGTH_LONG).show();}
            }
        });


    }
}
