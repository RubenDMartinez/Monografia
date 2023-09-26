package UdeC.Monografia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Iniciar_Sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iniciar_sesion);
    }

    public void CambioReg_Usu (View view) {
        Intent Cambiar = new Intent(this, Registro_Usuario.class);
        startActivity(Cambiar);
    }

    public void CambioPri_Usu (View view) {
        Intent Cambiar = new Intent(this, Principal_Comp.class);
        startActivity(Cambiar);
    }

    public void CambioReg_Tie (View view) {
        Intent Cambiar = new Intent(this, Registro_Tienda.class);
        startActivity(Cambiar);
    }

}