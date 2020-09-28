package com.example.ejerciciosmas40;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class PersonaDAO {

    private DataBaseOpenHelper dataBaseOpenHelper;
    private SQLiteDatabase db;

    public PersonaDAO(Context context){
        dataBaseOpenHelper = new DataBaseOpenHelper(context);
    }

    public  long insertarPersona(Persona persona){
        ContentValues registro = new ContentValues();
        registro.put(UtilitiesDataBase.TablaPersona.NOMBRE, persona.getNombre());
        registro.put(UtilitiesDataBase.TablaPersona.EDAD, persona.getEdad());
        registro.put(UtilitiesDataBase.TablaPersona.NOMBRE, persona.getNombre());


        return
    }

}
