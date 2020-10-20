package com.example.ejerciciosmas40.util;

import com.example.ejerciciosmas40.models.Ejercicio;
import com.example.ejerciciosmas40.models.Registro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class resources {

    public static final Ejercicio[] banco_ejercicios = {

            new Ejercicio("60 minutos de Ejercicio Aeróbico para Adultos Mayores Activos (rutina completa)",
                    "-QYqhmQj_ZI",
                    "En este video te dejo una rutina de 60 minutos de Ejercicio aeróbico para adultos mayores, esta rutina incluye calentamiento y estiramiento.",
                    "BASICOS",
                    "AEROBICOS"),
            new Ejercicio("Clase Rumba Adulto Mayor",
                    "OreDQTfMeBk",
                    "Clase Rumba Adulto Mayor",
                    "BASICOS",
                    "AEROBICOS"),
            new Ejercicio("Ejercicios para personas mayores | Clase 5: Resistencia general (con articulación de cadera)",
                    "JnJkpdsFiMk",
                    "En este video, continuamos trabajando en la resistencia general aeróbica junto a ejercicios para movilidad articular de la zona de cadera.",
                    "BASICOS",
                    "AEROBICOS"),
            new Ejercicio("ZUMBA para BAJAR de PESO en CASA, QUEMAGRASA TOTAL,FIT 45 MINUTOS",
                    "dRH7A_BQbNQ",
                    "Comenzamos con una una nueva clase de ZUMBA. 45 Minutos de clase en la que vamos a BAILAR, nos vamos a DIVERTIR y vamos a SUDAR muchísimo! Estáis preparados?",
                    "INTERMEDIO",
                    "AEROBICOS"),
            new Ejercicio("Clase de Aeróbicos #4 Por William Ríos",
                    "zHpbOBp6pp4",
                    "Vídeos para mejorar tu salud con actividad física.",
                    "INTERMEDIO",
                    "AEROBICOS"),
            new Ejercicio("Clase de Aeróbic",
                    "IPNbBXR8EA0",
                    "Vídeos para mejorar tu salud con actividad física.",
                    "INTERMEDIO",
                    "AEROBICOS"),
            new Ejercicio("Clase de baile para principiantes | Rutinas en casa | Ejercicios para adelgazar rápido",
                    "ejDHYOvDdTM",
                    "no cuento con los derechos de autor de las canciones utilizadas en esta clase, solo es con fines de  deportivos y de entretenimiento.",
                    "INTERMEDIO",
                    "AEROBICOS"),
            new Ejercicio("30-Minute Dance and Cardio Kickboxing Workout",
                    "EcqYeThduWk",
                    "Get ready to PUSH your limits with this dance and cardio kickboxing workout from Joseph D. You're in for a killer workout, and Joseph's infectious energy will have you smiling while you kick, pop it, and squat. Get ready to sweat!",
                    "AVANZADO",
                    "AEROBICOS"),
            new Ejercicio("Baja de peso rápido en casa | Clase de baile para pricipiantes",
                    "GtDiAZMDWKA",
                    "Muchas gracias por ver mis rutinas desde su hogar en estos tiempos difíciles les mando muchos saludos y bendiciones.Les recuerdo mi nuevo canal enfocado en rutinas cardiovasculares, aerobicas y de tonificación.",
                    "AVANZADO",
                    "AEROBICOS"),
            new Ejercicio("Quema grasa abdominal súper rápido en 1 semana | Eva Fitness",
                    "jfgtDE6ReUA",
                    "#BellyFat, #EvaFitness #MiraPham",
                    "AVANZADO",
                    "AEROBICOS"),
            new Ejercicio("10 minutos - Quemando grasa obstinada del vientre // Amg Fitness",
                    "H-ilNnpmQsc",
                    "10 minutos - Quemando grasa obstinada del vientre",
                    "AVANZADO",
                    "AEROBICOS"),
            new Ejercicio("YOGA PARA PRINCIPIANTES | DIA 1 Todo cuerpo - 25 min | Elena Malova",
                    "a01D1PzTVFc",
                    "- practica yoga tantas veces a la semana cuanto sea cómodo para ti, importante es disfrutar el proceso\n" +
                            "- puedes realizar esas rutinas tanto en la mañana como en la noche",
                    "BASICOS",
                    "YOGA"),
            new Ejercicio("Yoga para principiantes.",
                    "1J8CRcoFekE",
                    "Hacer yoga puede convertirse en una de las claves para nuestro bienestar. Dicen que para cada cosa hay una edad, pero no para empezar a sentirse bien. \n" +
                            "\n" +
                            "En este vídeo tienes algunos de los ejercicios más básicos para empezar a cogerle el gustillo a este arte milenario. No requieren conocimientos previos ni una gran forma física, aunque deben hacerse escuchando al cuerpo y sin forzar.",
                    "BASICOS",
                    "YOGA"),
            new Ejercicio("Yoga para RELAJAR cuello y hombros | Aliviar dolores cervicales | Elena Malova",
                    "aOW9fND3lFc",
                    "ejercicios para aliviar dolores de cullo y hombros, vamos a relajar musculos, estirar, respirar y mejorar circulación. Esta secuencia puedes hacer tanto en la mañana como en la noche, durante el día, siempre cuando sientes que es necesario relajar tus cervicales.",
                    "BASICOS",
                    "YOGA"),
            new Ejercicio("Yoga FLOW para intermedios | Clase 30 min en español | Elena Malova",
                    "r42IhQ5WHz0",
                    "Haz yoga en cualquier hora del día, con el estómago vacio dejando pasar por lo menos 2 horas después de la última comida. Haz yoga de 3 a 6 veces por semana, pero escucha el cuerpo y toma días libres para recuperación cuando sea necesario. Para mujeres durante la menstruación recomiendo hacer rutina especial",
                    "INTERMEDIO",
                    "YOGA"),
            new Ejercicio("YOGA EN CASA PARA TODO CUERPO | NIVEL INTERMEDIO INTENSO | ELENA MALOVA",
                    "zyFoxUx22g8",
                    "*Las rutinas puedes hacer solo o acompañado, apto para los hombres y mujeres, para la gente mayor de 18 años sin restrición médica alguna (los menores deben entrenar bajo supervisión de un adulto). Consulte a un doctor antes de comenzar cualquier programa de ejercicios\n" +
                            "*Ni Elena Malova ni cualquiera otra persona del canal MalovaElena será responsable de cualquier herida o lesión sostenida entrenándose en su casa, gimnasio o en otra parte.",
                    "INTERMEDIO",
                    "YOGA"),
            new Ejercicio("Yoga para la Mañana (20 min) - Nivel Intermedio",
                    "6KYl_d-Qijw",
                    "Yoga para la Mañana (20 min) - Nivel Intermedio\n" +
                            "**NUEVO** MANUAL DE LUZ 2020 – GRATUITO\n" +
                            "- Aprenderás a utilizar la energía que trae este 2020 a tu favor\n" +
                            "- Recordarás cuáles son tus herramientas divinas de creación\n" +
                            "- Tiempo de recordar tu poder personal y utilizarlo",
                    "INTERMEDIO",
                    "YOGA"),
            new Ejercicio("Yoga Vinyasa INTERMEDIO-AVANZADO todo cuerpo en 70 min | MalovaElena",
                    "EC9sC0suyzM",
                    "*Las rutinas puedes hacer solo o acompañado, apto para los hombres y mujeres, para la gente mayor de 18 años sin restrición médica alguna (los menores deben entrenar bajo supervisión de un adulto). Consulte a un doctor antes de comenzar cualquier programa de ejercicios\n" +
                            "*Ni Elena Malova ni cualquiera otra persona del canal MalovaElena será responsable de cualquier herida o lesión sostenida entrenándose en su casa, gimnasio o en otra parte.",
                    "AVANZADO",
                    "YOGA"),
            new Ejercicio("Clase FUERTE nivel intermedio avanzado | Brenda Yoga",
                    "luOsqGIzbk8",
                    "Esta es una clase nivel intermedio avanzado donde conseguirás fuerza y flexibilidad para lograr koundinyasana\n",
                    "AVANZADO",
                    "YOGA"),
            new Ejercicio("Yoga dinámico nivel III avanzado 55 min | Día 11 Cuerpo Perfecto en 4 semanas",
                    "FqeubkXNXck",
                    "*Las rutinas puedes hacer solo o acompañado, apto para los hombres y mujeres, para la gente mayor de 18 años sin restrición médica alguna (los menores deben entrenar bajo supervisión de un adulto). Consulte a un doctor antes de comenzar cualquier programa de ejercicios\n" +
                            "*Ni Elena Malova ni cualquiera otra persona del canal MalovaElena será responsable de cualquier herida o lesión sostenida entrenándose en su casa, gimnasio o en otra parte.\n",
                    "AVANZADO",
                    "YOGA"),

    };
}
