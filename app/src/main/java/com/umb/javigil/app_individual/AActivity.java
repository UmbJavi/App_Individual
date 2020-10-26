package com.umb.javigil.app_individual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }


    public void playActivityB (View view){
        EditText t1=(EditText)findViewById(R.id.tx_Name);
        EditText t2=(EditText)findViewById(R.id.tx_Phone);
        EditText t3=(EditText)findViewById(R.id.tx_eMail);

        String Txt1=t1.getText().toString();
        String Txt2=t2.getText().toString();
        String Txt3=t3.getText().toString();

        Intent i= new Intent(this, BActivity.class);

        i.putExtra("Dt1",Txt1);
        i.putExtra("Dt2",Txt2);
        i.putExtra("Dt3",Txt3);

        startActivity(i);
    }
    public void closeApp(){

        finish();
        //Intent intent = new Intent(this,MainActivity.class);
        // System.exit(0);
    }
}
