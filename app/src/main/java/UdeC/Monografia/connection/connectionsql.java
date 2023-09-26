package UdeC.Monografia.connection;

import android.os.StrictMode;
import android.util.Log;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionsql {
    public static String ip  = "172.18.5.63:1433";
    public static String db = "aplicacion";
    public static String username = "sa";
    public static String password = "aplicacion";
    public static Connection connexion(){
        Connection conexion = null;
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://172.18.2.21;databaseName=aplicacion;user=sa;password=aplicacion;");

        }catch (Exception e){
            Toast.makeText(null, e.getMessage(), Toast.LENGTH_SHORT).show();
            Log.e("Error de conexion", e.getMessage());
        }
        return conexion;
    }

}
