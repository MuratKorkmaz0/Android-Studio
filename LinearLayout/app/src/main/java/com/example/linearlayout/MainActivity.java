package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.text.AutoText;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Kodlarda kullanılacak olan tanımlamaların girildiği, eklendiği yer.//
    private ScrollView sv;
    private LinearLayout pnr ;
    private TextView txtView;
    private Button btn;
    private LinearLayout.LayoutParams txtLp, btnLp;

//Ekran tasarımlarını alttaki bu fonksiyon içine yazıyoruz.//
//Void bu fonksiyonun herhangi bir değer döndürmeyeceğini belirten ifadedir.//
//"init" fonksiyonun da kontrollerin oluşturmasını sağladık.//
//Dikeyde bir dizilim yapmak için orientation özelliğine "Vertical" diyerek dikeyde bir dizilim elde ettik.//
    private void init() {

        sv = new ScrollView(this);
        pnr = new LinearLayout(this);
        pnr.setOrientation(LinearLayout.VERTICAL);

//"i" burada döngü değişkenidir."i" değeri "1" olarak tanımlanmıştır, "i" değeri "5" den küçük ve "5" olduğu sürece bu döngü çalışmaya devam edecek.//

        for (int i = 1; i <=5; i++) {

//Genişlik ve yükseklik değerlerini belirttiğimiz satır.Piksel girerek örneğin "750, 150" gibi piksel değerlerini atayabiliriz.
//"ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT" şeklinde de yazabiliriz.Bu şekilde olması düzen açısından daha sağlıklı olacaktır.//

        txtLp =  new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        txtLp.setMargins(0,100,0,100);
        //"textViev(txtLp)" için yukarıdan, aşağıdan, sağ ve sol boşlukların kaç pixel olacağını ayarladığımız satır.//
        txtLp.gravity = Gravity.CENTER;
        txtView = new TextView(this);
        txtView.setText(i+". TextView");
        txtView.setTextSize(10);
        txtView.setLayoutParams(txtLp);
        pnr.addView(txtView);


//Butonu LinearLayout içine yerleştirmiş oluyoruz.Buton genişlik ve yükseklik bilgilerini LinearLayout.LayoutParams kullanarak değiştiriyoruz.Piksel girerek örneğin "250, 125" gibi piksel değerlerini atayabiliriz.
//"ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT" şeklinde de yazabiliriz.Bu şekilde olması düzen açısından daha sağlıklı olacaktır.// you've got something they don't

        btnLp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btnLp.gravity = Gravity.RIGHT;
        btn = new Button(this);
        btn.setText(i+". Button");
        btn.setTextSize(5);
        btn.setLayoutParams(btnLp);
        pnr.addView(btn);
      }


//ekran kaydırma özelliği andriod de gömülü olmadığı için bu özelliği elle yamamız gerekiyor.Tasarım olarak ilk bu özelliği atayabilmek için aldaki satırda "setContentView(sv);" olarak değişikliğe gidiyoruz.//
        //LinearLayout'umuzu "pnr" olarak daha önce belirlediğimiz için buraya o tanımı buraya yazıyoruz.//
        sv.addView(pnr);




    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //"init" ile kodlanan kontrollerinin oluşturulmasını ve uygulamada gösterilmiş olmasını sağlamış olduk.//
        init();
        setContentView(sv);
//Yukarıda bu özelleiğin değişme sebebini belittim. //"pnr" burada LinearLayout ve onun içindeki kontrollerin ekran tasarımı olarak atanmasını istediğimizi burada belirtiyoruz.//

    }
}
