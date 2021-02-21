package com.example.major;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login_screen extends AppCompatActivity {

    private Button register_btn;
    private Button login_btn;
    private Button facebook_btn;
    private EditText user_name;
    private EditText user_password;
    private login_screen login_screen;
    private Layout register_Activity;

    public login_screen(com.example.major.login_screen login_screen) {
    }


    private void init (){

        user_name = (EditText) findViewById(R.id.user_name);
        user_password = (EditText) findViewById(R.id.user_password);
        register_btn = (Button) findViewById(R.id.register_btn);
        login_btn = (Button) findViewById(R.id.login_btn);
        facebook_btn = (Button) findViewById(R.id.facebook_btn);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        login_screen = new login_screen(this);


        //Kullanıcı adı edittext.//
        EditText user_name =new EditText(this);
        user_name.setHint(R.string.user_name);

        //Kullanıcı şifre editText.//
        EditText user_password =new EditText(this);
        user_password.setHint(R.string.user_password);

        //login buton komut satırı.//
        Button login_btn = (Button) this.findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        //Register buton komut satırı.//
        Button register_btn =(Button) this.findViewById(R.id.register_btn);
        register_btn.setOnClickListener(new View.OnClickListener() {
            private Object register_Activity;

            @Override
            public void onClick(View v) {
                new Intent((login_screen) this,register_Activity.class);
                startActivity ((Intent)register_Activity);


            }
        });

        //Facebook ile giriş buton komut satırı.//
        Button facebook_btn =(Button) this.findViewById(R.id.facebook_btn);
        facebook_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}

