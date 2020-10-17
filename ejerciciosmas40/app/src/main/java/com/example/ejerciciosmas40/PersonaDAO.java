package com.example.ejerciciosmas40;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class PersonaDAO {

    private DataBaseOpenHelper dataBaseOpenHelper;
    private SQLiteDatabase db;

    public PersonaDAO(Context context){
        dataBaseOpenHelper = new DataBaseOpenHelper(context);
        db = dataBaseOpenHelper.getWritableDatabase();
    }

    public long insertarPersona(Persona persona){
        ContentValues registro = new ContentValues();
        registro.put(UtilitiesDataBase.TablaPersona.NOMBRE, persona.getNombre());
        registro.put(UtilitiesDataBase.TablaPersona.EDAD, persona.getEdad());
        registro.put(UtilitiesDataBase.TablaPersona.PESO, persona.getPeso());
        registro.put(UtilitiesDataBase.TablaPersona.ALTURA, persona.getAltura());
        registro.put(UtilitiesDataBase.TablaPersona.FRECUENCIA, persona.getFrecuencia());
        registro.put(UtilitiesDataBase.TablaPersona.DIFICULTAD, persona.getDificultad());
        registro.put(UtilitiesDataBase.TablaPersona.EJ_DESEADO, persona.getEj_deseado());
        registro.put(UtilitiesDataBase.TablaPersona.EQUIPO, persona.isEquipo());
        long id = db.insert(UtilitiesDataBase.TablaPersona.TABLE_NAME, UtilitiesDataBase.TablaPersona.ID, registro);
        db.close();
        return id;
    }

    public boolean isPersonaRegistered(){
        String query = "SELECT count(*) FROM "+UtilitiesDataBase.TablaPersona.TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        if(cursor.moveToFirst()){
            int count = cursor.getInt(0);
            if (count > 0) return true;
        }
        return false;
    }

    

}
