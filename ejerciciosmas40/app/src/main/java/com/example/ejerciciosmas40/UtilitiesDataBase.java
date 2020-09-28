package com.example.ejerciciosmas40;

public final class UtilitiesDataBase {
    static final String DATABASE_NAME="persona";
    static final int VERSION=1;

    public class TablaPersona{
        static final String TABLE_NAME="persona";
        static final String ID="id";
        static final String NOMBRE="nombre";
        static final String ALTURA="altura";
        static final String FRECUENCIA="frecuencia";
        static final String EDAD="edad";
        static final String DIFICULTAD="dificultad";
        static final String EJ_DESEADO="ej_deseado";
        static final String PESO="peso";
        static final String EQUIPO="equipo";


        static final String CREATE_TABLE_PERSONA="CREATE TABLE "+TABLE_NAME+" ("+ID+"INTEGER PRIMARY KEY AUTOINCREMENT, "+
                                                  NOMBRE+" TEXT, "+ALTURA+" INTEGER, "+FRECUENCIA+" INTEGER, "+EDAD+" INTEGER, "+DIFICULTAD+" TEXT, "+
                                                  EJ_DESEADO+" TEXT, "+PESO+" INTEGER, "+EQUIPO+"BOOLEAN)";

        static  final  String CONSULTAR_ALL_TABLE="SELECT * FROM"+TABLE_NAME;

    }


}

