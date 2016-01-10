package fr.handistrap.handistrap4;

/**
 * Created by Ozerioss on 25/11/2015.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
public class BDD_SQL extends SQLiteOpenHelper{
    private static final String TABLE_COORDONNEES= "table_coordonnées";
    private static final String COL_ID="id";
    private static final String COL_LATITUDE="latitude";
    private static final String COL_LONGITUDE="longitude";
    private static final String CREATE_BDD = "CREATE TABLE" + TABLE_COORDONNEES +" (" + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_LATITUDE + "TEXT NOT NULL, " + COL_LONGITUDE + "TEXT NOT NULL );";

    public MaBaseSQLite(Context context, String name, CursorFactory factory, int version){
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db){
        //création BDD
        db.execSQL(CREATE_BDD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        db.execSQL("DROP TABLE" + TABLE_COORDONNEES +";");
        onCreate(db);
    }






}
