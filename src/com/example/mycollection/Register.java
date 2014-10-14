package com.example.mycollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.mycollection.com.example.mycollection.utils.Constants;

/**
 * Created by lilian on 10/10/14.
 */
public class Register extends Activity implements  view.onClickLIstener{

    //declaring variables
    Button btnBack,btnLogin;
    EditText etfull,etpas,etmail,etuser;


    Constants myconstants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        //initializing variables
        btnBack=(Button)findViewById(R.id.btnback);
        btnBack.setOnClickListener(this);

        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        etfull=(EditText)findViewById(R.id.etfull);
        etuser=(EditText)findViewById(R.id.etuser);
        etpas=(EditText)findViewById(R.id.etpas);
        etmail=(EditText)findViewById(R.id.etmail);

        myconstants=new Constants();



    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnback:
                startActivity(new Intent(getApplicationContext(),Main.class));

                break;

            case R.id.btnLogin:
                startActivity(new Intent(getApplicationContext(),Logins.class));




                break;

        }

    }
}