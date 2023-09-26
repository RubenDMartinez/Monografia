package UdeC.Monografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registro_Tienda extends AppCompatActivity {

    EditText  camp1, camp2, camp3, camp4, camp5, camp6, camp7;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro_tienda);

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
        String desc = camp2.getText().toString();
        String dire = camp3.getText().toString();
        String barr = camp4.getText().toString();
        String ciud = camp5.getText().toString();
        String depa = camp6.getText().toString();
        String celu = camp7.getText().toString();

        if (nomb.isEmpty()) {
            camp1.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (desc.isEmpty()) {
            camp2.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (dire.isEmpty()) {
            camp3.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (barr.isEmpty()) {
            camp4.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (ciud.isEmpty()) {
            camp5.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (depa.isEmpty()) {
            camp6.setError("Este campo no puede quedar vacio");
            retorno = false;
        } if (celu.isEmpty()) {
            camp7.setError("Este campo no puede quedar vacio");
        }
        return retorno;
    }

    public void CambioPri_Com (View view) {
        if (validar()) {
            Toast.makeText(this, "Tienda creada exitosamente", Toast.LENGTH_SHORT).show();
            Intent Cambiar = new Intent(this, Principal_Comp.class);
            startActivity(Cambiar);
        }
    }

    public void CambioPri_Com2 (View view) {
        Intent Cambiar = new Intent(this, Principal_Comp.class);
        startActivity(Cambiar);
    }

}
