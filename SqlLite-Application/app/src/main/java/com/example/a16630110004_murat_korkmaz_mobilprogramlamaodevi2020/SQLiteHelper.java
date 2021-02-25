package com.example.a16630110004_murat_korkmaz_mobilprogramlamaodevi2020;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public abstract class SQLiteHelper extends SQLiteOpenHelper {
    private static final int database_version = 1;
    private static final String database_name = "BEDB";
    private static final String listv_Byz_e ="Beyaz Eşya";
    private static final String BE_id = "id";
    private static final String BE_title = "baslik";
    private static final String BE_brand = "marka";
    private static final String[] COLUMS = {BE_id,BE_title,BE_brand};
    
    private static final String create_beyaz_eşya_table ="CREATE TABLE"
            
            + listv_Byz_e + "("
            + BE_id +"INTEGER PRIMARY KEY AUTOINCREMENT,"
            + BE_title + "TEXT, "
            + BE_brand + "TEXT)";

    public SQLiteHelper(Context context) {

        super(context, database_name, null, database_version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(create_beyaz_eşya_table); }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion){
        db.execSQL("DROP TABLE IF EXISTS " + listv_Byz_e);
    this.onCreate(db);
    }


    public void BE_Ekle(Beyaz_Eşya beyaz_eşya) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues degerler = new ContentValues();
        degerler.put(BE_title, beyaz_eşya.getBaslik());
        degerler.put(BE_brand, beyaz_eşya.getMarka());

        db.insert(listv_Byz_e, null, degerler);
        db.close();
    }
    
    public List<Beyaz_Eşya>BEGetir(){
        List<Beyaz_Eşya>Beyaz_Eşya = new ArrayList<>();
        String qurey ="Select * from " + listv_Byz_e;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(qurey,null);
        Beyaz_Eşya beyaz_eşya = null;
        if (cursor.moveToFirst()){
            do {
                beyaz_eşya = new Beyaz_Eşya();
                
                beyaz_eşya.setId(Integer.parseInt(cursor.getString(0)));
                beyaz_eşya.setbaslik(cursor.getString(1));
                beyaz_eşya.setmarka(cursor.getString(2));
                beyaz_eşya.add(beyaz_eşya);
            }while (cursor.moveToNext());
        }
        return beyaz_eşya;
    }
}
