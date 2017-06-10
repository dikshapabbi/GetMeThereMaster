package com.GetMeThere.GetMeThereLogin.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.GetMeThere.GetMeThereLogin.MapsActivity;
import com.GetMeThere.GetMeThereLogin.R;


public class Transport_Activity extends AppCompatActivity {

    public AppCompatButton btn_pdf;

    public void init(){
        btn_pdf = (AppCompatButton) findViewById(R.id.btn_pdf);
        btn_pdf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent pdf = new Intent(Transport_Activity.this,PDF_Activity.class);
                startActivity(pdf);
            }
        });
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport_);
        init();
    }
}
