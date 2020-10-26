package com.umb.javigil.app_individual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        TextView Tx1=(TextView)findViewById(R.id.txFinal_Name);
        TextView Tx2=(TextView)findViewById(R.id.txFinal_Phone);
        TextView Tx3=(TextView)findViewById(R.id.txFinal_eMail);

        Bundle Extra= getIntent().getExtras();
        String Dat1= Extra.getString("Dt1");
        String Dat2= Extra.getString("Dt2");
        String Dat3= Extra.getString("Dt3");
        String Dat4= "Hola, " + Dat1;

        Tx1.setText(Dat4);
        Tx2.setText(Dat2);
        Tx3.setText(Dat3);
    }

}