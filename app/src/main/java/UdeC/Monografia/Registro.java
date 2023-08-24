package UdeC.Monografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {
    EditText camp1, camp2, camp3, camp4, camp5, camp6, camp7, camp8, camp9, camp10, camp11, camp12, camp13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        camp1 = (EditText)findViewById(R.id.txtNom_Usu);
        camp2 = (EditText)findViewById(R.id.txtApe_Usu);
        camp3 = (EditText)findViewById(R.id.txtCed_Usu);
        camp4 = (EditText)findViewById(R.id.txtNac_Usu);
        camp5 = (EditText)findViewById(R.id.txtCel_Usu);
        camp6 = (EditText)findViewById(R.id.txtEml_Usu);
        camp7 = (EditText)findViewById(R.id.txtBar_Usu);
        camp8 = (EditText)findViewById(R.id.txtCiu_Usu);
        camp9 = (EditText)findViewById(R.id.txtDep_Usu);
        camp10 = (EditText)findViewById(R.id.txtDir_Usu);
        camp11 = (EditText)findViewById(R.id.txtApa_Usu);
        camp12 = (EditText)findViewById(R.id.txtUsu_Usu);
        camp13 = (EditText)findViewById(R.id.txtCon_Usu);
    }

    public boolean validar() {
        boolean retorno = true;

        String nomb = camp1.getText().toString();
        String apel = camp2.getText().toString();
        String cedu = camp3.getText().toString();
        String naci = camp4.getText().toString();
        String celu = camp5.getText().toString();
        String emai = camp6.getText().toString();
        String barr = camp7.getText().toString();
        String ciud = camp8.getText().toString();
        String depa = camp9.getText().toString();
        String dire = camp10.getText().toString();
        String apar = camp11.getText().toString();
        String usua = camp12.getText().toString();
        String cont = camp13.getText().toString();

        if (nomb.isEmpty()) {
            camp1.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (apel.isEmpty()) {
            camp2.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (cedu.isEmpty()) {
            camp3.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (naci.isEmpty()) {
            camp4.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (celu.isEmpty()) {
            camp5.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (emai.isEmpty()) {
            camp6.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (barr.isEmpty()) {
            camp7.setError("Este campo no puede quedar vacio");
        } if (ciud.isEmpty()) {
            camp8.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (depa.isEmpty()) {
            camp9.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (dire.isEmpty()) {
            camp10.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (apar.isEmpty()) {
            camp11.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (usua.isEmpty()) {
            camp12.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (cont.isEmpty()) {
            camp13.setError("Este campo no puede quedar vacio");
            retorno = false;
        }
        return retorno;
    }

    public void Cambio(View view) {
        if (validar()) {
            Toast.makeText(this, "Datos agregados", Toast.LENGTH_SHORT).show();
            Intent Cambiar = new Intent(this, Iniciar_Sesion.class);
            startActivity(Cambiar);
        }
    }
}

/*      datos = new ArrayList<String>();
        datos.set(0,String.valueOf("findViewById(R.id.txtNom)"));
        datos.set(1,String.valueOf("findViewById(R,id,txtApe)"));
        datos.set(2,String.valueOf("findViewById(R.id.txtCed)"));
        datos.set(3,String.valueOf("findViewById(R.id.txtNac)"));
        datos.set(4,String.valueOf("findViewById(R.id.txtCel)"));
        datos.set(5,String.valueOf("findViewById(R,id,txtEml)"));
        datos.set(6,String.valueOf("findViewById(R.id.txtDir)"));
        datos.set(7,String.valueOf("findViewById(R.id.txtCiu)"));
        datos.set(8,String.valueOf("findViewById(R,id,txtBar)"));
        datos.set(9,String.valueOf("findViewById(R.id.txtUsu)"));
        datos.set(10,String.valueOf("findViewById(R.id.txtCon)"));
*/

/*

public class Dato {

        public Dato (String Nomb, String Apel, String Ced, String Naci, String Celu, String Emai, String Dire, String Ciud, String Barr, String Usua, String Contr) {

        }

    }

        EditText camp1 = findViewById(R.id.txtNom);
        EditText camp2 = findViewById(R.id.txtApe);
        EditText camp3 = findViewById(R.id.txtCed);
        EditText camp4 = findViewById(R.id.txtNac);
        EditText camp5 = findViewById(R.id.txtCel);
        EditText camp6 = findViewById(R.id.txtEml);
        EditText camp7 = findViewById(R.id.txtDir);
        EditText camp8 = findViewById(R.id.txtCiu);
        EditText camp9 = findViewById(R.id.txtBar);
        EditText camp10 = findViewById(R.id.txtUsu);
        EditText camp11 = findViewById(R.id.txtCon);

        String nomb = camp1.getText().toString();
        String apel = camp2.getText().toString();
        String cedu = camp3.getText().toString();
        String naci = camp4.getText().toString();
        String celu = camp5.getText().toString();
        String emai = camp6.getText().toString();
        String dire = camp7.getText().toString();
        String ciud = camp8.getText().toString();
        String barr = camp9.getText().toString();
        String usua = camp10.getText().toString();
        String cont = camp11.getText().toString();

        Dato datosN = new Dato(nomb, apel, cedu, naci, celu, emai, dire, ciud, barr, usua, cont);
        datos.add(datosN);
*/