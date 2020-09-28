package com.example.ejerciciosmas40;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseOpenHelper extends SQLiteOpenHelper {

    public DataBaseOpenHelper(@Nullable Context context) {
        super(context, UtilitiesDataBase.DATABASE_NAME,null, UtilitiesDataBase.VERSION);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL(UtilitiesDataBase.TablaPersona.CREATE_TABLE_PERSONA);

        insert(db, 164,2,21, "Andres","media", "normal", 50, false);
    }

    private void insert(SQLiteDatabase db,int altura, int frecuencia,int edad, String nombre, String dificultad, String ej_deseado, float peso, boolean equipo){
        ContentValues registro = new ContentValues();
        registro.put(UtilitiesDataBase.TablaPersona.ALTURA,altura);
        registro.put(UtilitiesDataBase.TablaPersona.FRECUENCIA,frecuencia);
        registro.put(UtilitiesDataBase.TablaPersona.EDAD,edad);
        registro.put(UtilitiesDataBase.TablaPersona.NOMBRE,nombre);
        registro.put(UtilitiesDataBase.TablaPersona.DIFICULTAD,dificultad);
        registro.put(UtilitiesDataBase.TablaPersona.EJ_DESEADO,ej_deseado);
        registro.put(UtilitiesDataBase.TablaPersona.PESO,peso);
        registro.put(UtilitiesDataBase.TablaPersona.EQUIPO,equipo);

        db.insert(UtilitiesDataBase.TablaPersona.TABLE_NAME,null,registro);
    }

    public  void  onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS "+UtilitiesDataBase.TablaPersona.TABLE_NAME);
        onCreate(db);
    }

}
