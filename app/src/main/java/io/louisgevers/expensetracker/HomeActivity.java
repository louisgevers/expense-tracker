package io.louisgevers.expensetracker;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavigationUI.setupWithNavController(navView, Navigation.findNavController(this, R.id.nav_host_fragment));
    }

    public void onClickGoFromHomeToProject(View view) {
        Navigation.findNavController(view).navigate(R.id.action_navigation_home_to_projectFragment);
    }

}
