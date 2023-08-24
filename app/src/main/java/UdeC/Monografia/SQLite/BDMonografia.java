package UdeC.Monografia.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDMonografia extends SQLiteOpenHelper {

    final String Crear_Tab_Usu = "CREATE TABLE Usuario (nomb TEXT. apel TEXT, cedu INTEGER, fnac TEXT, celu INTEGER, emai TEXT, barr TEXT, ciud TEXT, depa TEXT, dire TEXT, apar INTEGER, user TEXT, cont NTEXT)";

    public BDMonografia(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}


/*
    private static final String MonografiaBD = "aplicacion.db";
    private static final int VERSION_ACTUAL = 1;
    private final Context contexto;

    interface Tablas {
        String prod_mult = "producto_multimedia";
        String tnda = "tienda";
        String tnda_user = "tienda_usuario";
        String user = "usuario";
    }
*/