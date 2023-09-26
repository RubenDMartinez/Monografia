package UdeC.Monografia;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class Principal_Comp extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    //Variables para carga del fragment principal
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_comp);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer);
        navigationView=   findViewById(R.id.navigationView);

        //Establecer evento OnClick al NavigationView
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        //Cargar fragment principal
        /*fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container, new Fragment_Crea_Tien());
        fragmentTransaction.commit();*/
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        drawerLayout.closeDrawer(GravityCompat.START);

        if (menuItem.getItemId() == R.id.Mi_Tie) {

            Toast.makeText(this, "Crear nueva tienda", Toast.LENGTH_SHORT).show();
            Intent Cambiar = new Intent(this, Registro_Tienda.class);
            startActivity(Cambiar);
            ;
            /*fragmentManager = getSupportFragmentManager();
            fragmentTransaction =fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container, new Fragment_Crea_Tien());
            fragmentTransaction.commit();

            Context context = getApplicationContext();
            CharSequence  text = "Registrar nueva tienda.";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();*/
        }

        if (menuItem.getItemId() == R.id.Mis_Com) {

        }

        if (menuItem.getItemId() == R.id.Cer_Ses) {
            Toast.makeText(this, "Sesion cerrada", Toast.LENGTH_SHORT).show();
            Intent Cambiar = new Intent(this, Iniciar_Sesion.class);
            startActivity(Cambiar);
        }
        return false;
    }
}