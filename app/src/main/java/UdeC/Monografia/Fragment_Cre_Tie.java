package UdeC.Monografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Fragment_Cre_Tie extends AppCompatActivity {

    EditText camp1, camp2, camp3, camp4, camp5, camp6, camp7;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_cre_tie);

        camp1 = (EditText)findViewById(R.id.txtNom_Tie);
        camp2 = (EditText)findViewById(R.id.txtDes_Tie);
        camp3 = (EditText)findViewById(R.id.txtDir_Tie);
        camp4 = (EditText)findViewById(R.id.txtBar_Tie);
        camp5 = (EditText)findViewById(R.id.txtCiu_Tie);
        camp6 = (EditText)findViewById(R.id.txtDep_Tie);
        camp7 = (EditText)findViewById(R.id.txtCel_Tie);
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
        }
        return retorno;
    }

    public void CambioPrinST(View view) {
        if (validar()) {
            Toast.makeText(this, "Datos agregados", Toast.LENGTH_SHORT).show();
            Intent Cambiar = new Intent(this, Registro.class);
            startActivity(Cambiar);
        }
    }

}
