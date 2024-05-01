package com.example.fantasyzoo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fantasyzoo.Fragments.AnimalFragment;
import com.example.fantasyzoo.Fragments.ZookeeperFragment;

public class MainActivity extends AppCompatActivity {

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

}