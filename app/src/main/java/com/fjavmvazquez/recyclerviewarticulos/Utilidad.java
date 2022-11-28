package com.fjavmvazquez.recyclerviewarticulos;

import java.util.ArrayList;

public class Utilidad {
   private static ArrayList<Articulo> mArticuloArrayList;

 public static ArrayList<Articulo> llenar(){
        mArticuloArrayList = new ArrayList<>();
       mArticuloArrayList.add(new Articulo(R.drawable.fondo,"Programación","Una vez que se ha creado el objeto DataOutputStream, puede usarlo para escribir datos binarios en el archivo.","11/12/2020"));
       mArticuloArrayList.add(new Articulo(R.drawable.anime,"Naruto","Naruto, romanizada como NARUTO, es una serie animada de origen japonés basada en el manga del mismo nombre, escrito e ilustrado por Masashi Kishimoto.",
               "10/10/2022"));
       mArticuloArrayList.add(new Articulo(R.drawable.data,"Bases de datos","Una base de datos es una herramienta para recopilar y organizar información. Las bases de datos pueden almacenar información sobre personas, productos, pedidos u otras cosas. Muchas bases de datos " +
               "comienzan como una lista en una hoja de cálculo o en un programa de procesamiento de texto.","10/12/2011"));
       mArticuloArrayList.add(new Articulo(R.drawable.linux,"Linux", "Linux es un sistema operativo semejante a Unix, de código abierto y desarrollado por una comunidad, para computadoras, servidores, " +
               "mainframes, dispositivos móviles y dispositivos embebidos.","27/11/2022"));
 return mArticuloArrayList;
 }

}
