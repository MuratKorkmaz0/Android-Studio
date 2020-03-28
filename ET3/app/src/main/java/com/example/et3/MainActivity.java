package com.example.et3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout container =new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);

        LinearLayout Layout1 =new LinearLayout(this);
        Layout1.setOrientation(LinearLayout.HORIZONTAL);

        TextView textView1 =new TextView(this);
        textView1.setText(R.string.ad);
        textView1.setTextSize(18);
        textView1.setTypeface(Typeface.MONOSPACE,Typeface.BOLD);
        textView1.setTextColor(Color.BLACK);

        EditText editText1 =new EditText(this);
        editText1.setHint(R.string.ad);


        Layout1.addView(textView1);
        Layout1.addView(editText1);

        LinearLayout Layout2 =new LinearLayout(this);
        Layout2.setOrientation(LinearLayout.HORIZONTAL);

        TextView textView2 =new TextView(this);
        textView2.setText(R.string.soyad);
        textView2.setTextSize(18);
        textView2.setTypeface(Typeface.MONOSPACE,Typeface.BOLD);
        textView2.setTextColor(Color.BLACK);

        EditText editText2 =new EditText(this);
        editText2.setHint(R.string.soyad);

        Layout2.addView(textView2);
        Layout2.addView(editText2);

        ButtonBarLayout Layout3 =new LinearLayout(this);
        Layout3.setOrientation(LinearLayout.HORIZONTAL);
        Button button1 =new Button(this);
        Button.setText(R.string.kaydet);
        

        container.addView(Layout1);
        container.addView(Layout2);
        container.addView(Layout3);

        setContentView(container);



    }
}
