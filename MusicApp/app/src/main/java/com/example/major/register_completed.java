package com.example.major;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;


public class register_completed extends AppCompatActivity {

    private Button login_btn;
    private Layout activity_register_completed;

    public register_completed(register_completed register_completed) {
    }


    private void init(){

        login_btn = (Button) findViewById(R.id.login_btn);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_completed);

        activity_register_completed =new register_completed(this);


        Button login_btn = (Button) this.findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            public void setLogin_screen(Object login_screen) {
                this.login_screen = login_screen;
            }

            private Object login_screen;

            @Override
            public void onClick(View v) {
                new Intent((activity_register_completed) this,login_screen.class);
                startActivity ((Intent) login_screen);

            }
        });

    }
}
