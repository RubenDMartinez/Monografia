package UdeC.Monografia.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexion extends SQLiteOpenHelper {

    final String Tab_Usu = "CREATE  TABLE  Usuarios (" +
            "cedula_usu INT NOT NULL, " +
            "nombre_usu varchar NOT NULL, " +
            "apellido_usu varchar(100) NOT NULL, " +
            "fecha_usu varchar(100) NOT NULL, " +
            "celular_usu INT NOT NULL UNIQUE, " +
            "foto_usu varchar(100), " +
            "user_usu varchar(100) NOT NULL UNIQUE, " +
            "correo_usu varchar(100) NOT NULL UNIQUE, " +
            "contrase_usu ntext NOT NULL, " +
            "dcalle_usu varchar(100), " +
            "dbarrio_usu varchar(100), " +
            "dciudad_usu varchar, " +
            "ddeparta_usu varchar,  " +
            "dapartam_usu varchar)";

    public Conexion(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
