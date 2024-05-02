package com.example.fantasyzoo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.fantasyzoo.Fragments.AnimalFragment;
import com.example.fantasyzoo.Fragments.ZookeeperFragment;

public class MainActivity extends AppCompatActivity {
    public static RequestQueue rq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rq = Volley.newRequestQueue(this);
        fragmentChanger(AnimalFragment.class);
        initGui();
    }

    void initGui() {
       findViewById(R.id.nav_animals).setOnClickListener(view -> fragmentChanger(AnimalFragment.class));
       findViewById(R.id.nav_zookeepers).setOnClickListener(view -> fragmentChanger(ZookeeperFragment.class));
//        findViewById(R.id.nav_watchlist).setOnClickListener(view -> fragmentChanger(WatchlistFragment.class));
//        findViewById(R.id.btn_search).setOnClickListener(view -> fragmentChanger(SearchFragment.class));
    }

    private void fragmentChanger(Class c) {
        // if (getSupportFragmentManager().getBackStackEntryCount() > 0)
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, c, null)
                .setReorderingAllowed(true)
                .addToBackStack("name") // Name can be null
                .commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager.getBackStackEntryCount() > 0) {
            fragmentManager.popBackStack();
        } else {
            showCloseAppDialog();
        }
    }

    private void showCloseAppDialog() {
        new AlertDialog.Builder(this)
                .setMessage("Do you wish to close the app?")
                .setPositiveButton("Yes", (dialogInterface, i) -> {
                    // Close the app
                    finish();
                })
                .setNegativeButton("No", (dialogInterface, i) -> {
                    // Dismiss the dialog
                    dialogInterface.dismiss();
                })
                .show();
    }

}