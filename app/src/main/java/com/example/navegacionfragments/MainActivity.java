package com.example.navegacionfragments;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Cargar el fragmento
        replaceFragment(new Fragment1());

        // Configurar los botones para cambiar de fragmento
        findViewById(R.id.btn_rojo).setOnClickListener(view -> replaceFragment(new Fragment1()));
        findViewById(R.id.btn_azul).setOnClickListener(view -> replaceFragment(new Fragment2()));
        findViewById(R.id.btn_verde).setOnClickListener(view -> replaceFragment(new Fragment3()));
    }

    // Método para reemplazar fragmentos
    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}