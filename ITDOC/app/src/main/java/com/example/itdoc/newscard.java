package com.example.itdoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.itdoc.ui.login.LoginActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class newscard extends AppCompatActivity {


BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newscard);


        bottomNavigationView = findViewById(R.id.bottomNav);


        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home_Fragment()).commit();

        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;
                 switch (menuItem.getItemId()){
                     case R.id.navigation_pill:
                     { Intent intentvh = new Intent(newscard.this, Recipies.class );
                         startActivity(intentvh);}

                         break;
                     case R.id.navigation_read:
                         fragment = new Profile_fragment();
                         break;
                     case R.id.navigation_profile:
                         fragment = new Profile_fragment();
                         break;
                 }
                 getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();

                return false;
            }
        });
    }
   /* private void setUp_Bottom_Navigation(){
        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomNavViewBar);
        //BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView);
*/
    }

