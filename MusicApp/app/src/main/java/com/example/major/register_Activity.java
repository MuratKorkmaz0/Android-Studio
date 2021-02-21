package com.example.major;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Create by MSOFT.
 */
public class register_Activity extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button Register_btn;
    EditText E_name_surname, E_user_password, E_confirm_password, E_e_mail;
    private String name_surname;
    private String user_password;
    private String confirm_password;
    private String e_mail;

    public register_Activity (register_Activity) {
        setContentView(R.id.register_layout);
    }

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_register_);
        openHelper=new register_Activity (this);
        Register_btn =(Button) findViewById(R.id.register_btn);
        E_name_surname =(EditText) findViewById(R.id.name_surname);
        E_user_password =(EditText) findViewById(R.id.user_password);
        E_confirm_password =(EditText) findViewById(R.id.confirm_password);
        E_e_mail =(EditText) findViewById(R.id.e_mail);

        Register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                db=openHelper.getWritableDatabase();
                String name_surname= E_name_surname.getText().toString();
                String e_mail= E_e_mail.getText().toString();
                String user_password= E_user_password.getText().toString();
                String confirm_password= E_user_password.getText().toString();
                insertdata(E_user_password, E_e_mail, E_name_surname, E_confirm_password);
                Toast.makeText(getApplicationContext(), "register successfully", Toast.LENGTH_LONG).show();
           }
        });



    }

    private void insertdata(EditText e_user_password, EditText e_e_mail, EditText e_name_surname, EditText e_confirm_password) {
    }

    public void insertdata(String name_surname,String user_password, String confirm_password, String e_mail) {
        this.name_surname = name_surname;
        this.user_password = user_password;
        this.confirm_password = confirm_password;
        this.e_mail = e_mail;

        ContentValues contentValues = new ContentValues();
        contentValues.put(database_helper.COL_2, name_surname);
        contentValues.put(database_helper.COL_3, e_mail);
        contentValues.put(database_helper.COL_4, user_password);
        contentValues.put(database_helper.COL_5, confirm_password);
        Long id = db.insert(database_helper.TABLE_NAME, null, contentValues);


    }
}
