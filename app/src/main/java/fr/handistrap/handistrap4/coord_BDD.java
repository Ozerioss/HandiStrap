package fr.handistrap.handistrap4;

/**
 * Created by Ozerioss on 25/11/2015.
 */


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class coord_BDD {

    private static final int VERSION_BDD = 1;
    private static final String NOM_BDD = "coordonnees.db";

    private static final String TABLE_LIVRES = "TABLE_COORDONNEES";
    private static final String COL_ID = "ID";
    private static final int NUM_COL_ID = 0;
    private static final String COL_LATITUDE = "latitude";
    private static final int NUM_COL_LATITUDE = 1;
    private static final String COL_LONGITUDE = "longitude";
    private static final int NUM_COL_TITRE = 2;


    private SQLiteDatabase bdd;

    private  SQLiteDatabase maBaseSQLite;

    public coord_BDD(Context context){

        maBaseSQLite = new SQLiteDatabase(context, NOM_BDD, null, VERSION_BDD);
    }

    public void open (){
        bdd= maBaseSQLite.getWritableDatabase();
    }

    public void close(){
        bdd.close();
    }

    public SQLiteDatabase getBdd(){
        return bdd;
    }


}

