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

    public void CambioReg (View view) {
        Intent Cambiar = new Intent(this, Registro.class);
        startActivity(Cambiar);
    }

    public void CambioIni (View view) {
        Intent Cambiar = new Intent(this, Principal_ST.class);
        startActivity(Cambiar);
    }
}