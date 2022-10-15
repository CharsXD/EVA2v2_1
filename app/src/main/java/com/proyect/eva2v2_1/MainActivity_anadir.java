package com.proyect.eva2v2_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.proyect.eva2v2_1.databinding.ActivityMainAnadirBinding;

public class MainActivity_anadir extends AppCompatActivity {

    public static Object Class;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_anadir);





    }

    public void back(View view){

        Intent back = new Intent(this, MainActivity2.class);
        startActivity(back);

    }


}