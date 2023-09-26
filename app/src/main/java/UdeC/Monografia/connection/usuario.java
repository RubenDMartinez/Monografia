package UdeC.Monografia.connection;

import static java.lang.String.valueOf;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usuario extends AppCompatActivity {

    public usuario() {
        con = sql.connexion();
    }
    Connection con = null;
    connectionsql sql = new connectionsql();

    public void agregarusuario (int cedula, String nombre, String apellido, String fecha,
                                int celular, String foto, String user, String correousu,  String contrase,
                                String calleusu, String barriousu, String ciudadusu, String departamentousu,
                                String apartamentousu){
        try {
            con = sql.connexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO usuario (cedula_usu, nombre_usu, " +
                    "apellido_usu, fecha_usu, celular_usu, foto_usu, user_usu, correo_usu, contrase_usu, " +
                    "dcalle_usu, dbarrio_usu, dciudad_usu, ddeparta_usu, dapartam_usu) " +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            ps.setString(1, valueOf(cedula));
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, fecha);
            ps.setString(5, valueOf(celular));
            ps.setString(6, foto);
            ps.setString(7, user);
            ps.setString(8, correousu);
            ps.setString(9, contrase);
            ps.setString(10, calleusu);
            ps.setString(11, barriousu);
            ps.setString(12, ciudadusu);
            ps.setString(13, departamentousu);
            ps.setString(14, apartamentousu);
            Toast.makeText(this, "Registro guardado", Toast.LENGTH_SHORT).show();
        }catch (SQLException e){
            Toast.makeText(null, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
