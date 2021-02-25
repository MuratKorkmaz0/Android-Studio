package com.example.a16630110004_murat_korkmaz_mobilprogramlamaodevi2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    ListView liste ;
    Context context =this;
    List<Beyaz_Eşya> listv_Byz_e;
    SQLiteHelper db=new SQLiteHelper(context);
    ArryAdapter<String> mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listv_Byz_e = (ListView) findViewById(R.id.listv_Byz_e);
        db.onUpgrade(db.getReadableDatabase(),1,2);

        db.BE_Ekle(new Beyaz_Eşya("sehpa", "IKEA"));
        db.BE_Ekle(new Beyaz_Eşya("masa", "Bellona"));
        db.BE_Ekle(new Beyaz_Eşya("Koltuk", "Istikbal"));
        db.BE_Ekle(new Beyaz_Eşya("Sehpa", "Mondi"));

        listv_Byz_e= db.BEGetir();
        List<String> baslik=new ArrayList<>();
        for (int i=0;i<listv_Byz_e.size();i++)
        {
            baslik.add(i,listv_Byz_e.get(i).getBaslik());
        }
        mAdapter =new
                ArryAdapter<>(context, R.layout.line_layout,R.id.list_text,baslik);
        listv_Byz_e.setAdapter(mAdapter);

    }
}
