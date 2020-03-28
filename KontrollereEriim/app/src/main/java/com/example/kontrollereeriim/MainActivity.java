package com.example.kontrollereeriim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activity_main.xml de belirlediğimiz id'leri kullanarak kod satırlarını MainActivity.Java'ya import etmeye örnek.//

        final EditText txtinput =(EditText) this.findViewById(R.id.txtinput);
        final TextView txtnamsurname = (TextView) this.findViewById(R.id.txtnamesurname);
        Button btnsend = (Button) this.findViewById(R.id.btnsend);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String namesurname = txtinput.getText().toString();
                txtnamsurname.setText(namesurname);
                Toast.makeText(MainActivity.this, "Gönderildi!",Toast.LENGTH_LONG).show();//Butona bastıktan sonra ekrana gelecek mesaj ve süresinin ayarlandığı satır.//


            }
        });

    }
}
