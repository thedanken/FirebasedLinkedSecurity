package com.example.firebaselinkedsecurity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import com.example.firebaselinkedsecurity.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Navigation.findNavController(this, R.id.nav_host_fragment)
                .setGraph(R.navigation.nav_graph);
    }
}
