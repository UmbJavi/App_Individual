package com.umb.javigil.app_individual;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //public String User= ((EditText)findViewById(R.id.tx_Name)).getText().toString();
    //public String Phone= ((EditText)findViewById(R.id.tx_Phone)).getText().toString();
    //public String eMail= ((EditText)findViewById(R.id.tx_eMail)).getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void playActivityA(View view){
        Intent x1=new Intent(this, AActivity.class);
        startActivity(x1);
    }
    public void playActivityB(View view){
        Intent x2=new Intent(this, BActivity.class);
        startActivity(x2);
    }
    public void closeApp(View view){

        //finish();
        Intent intent = new Intent(this,MainActivity.class);
        System.exit(0);
    }

}