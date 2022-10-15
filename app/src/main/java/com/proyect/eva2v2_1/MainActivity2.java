package com.proyect.eva2v2_1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.tabs.TabLayout;
import com.proyect.eva2v2_1.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TabLayout tl = (TabLayout) findViewById(R.id.tabbarv);
        tl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                switch (position) {

                    case 0:
                        estadisticas e = new estadisticas();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment1,e).commit();
                        break;
                    case 1:
                        dispositivos d = new dispositivos();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment1,d).commit();

                        break;
                    case 2:
                        ajustes a = new ajustes();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment1,a).commit();

                        break;




                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }

    public void add(View view){

        Intent add= new Intent(this, MainActivity_anadir.class);
        startActivity(add);

    }

    public void ajustesw(View view){

        Intent ajustesw= new Intent(this, SettingsActivity.class);
        startActivity(ajustesw);

    }
}