package com.example.rajat.popuptry2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class PopUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pop_up);
        TextView txt = (TextView) findViewById(R.id.mytxt);
        Button dismissbutton = (Button) findViewById(R.id.closBtn);
        txt.setText("Hello I am a popup");
        dismissbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PopUpActivity.this,MainActivity.class);
                startActivity(i);
                PopUpActivity.this.finish();
            }
        });
    }
}
