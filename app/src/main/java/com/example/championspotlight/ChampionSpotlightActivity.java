package com.example.championspotlight;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.Menu;

public class ChampionSpotlightActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champion_spotlight);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = new HomePageFragment();
        if (fragment != null) {
            fm.beginTransaction()
                    .replace(R.id.contraint_layout_spotlight_container, fragment)
                    .commit();
        }


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.champion_spotlight, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;

        switch (id) {

            case R.id.nav_stats_skins: {
                fragment = new StatsSkinsFragment();
                setTitle(R.string.menu_stats_skins);
                break;
            }

            case R.id.nav_passive: {
                fragment = new PassiveFragment();
                setTitle(R.string.passive_header);
                break;
            }

            case R.id.nav_q: {
                fragment = new QFragment();
                setTitle(R.string.q_header);
                break;
            }

            case R.id.nav_w: {
                fragment = new WFragment();
                setTitle(R.string.w_header);
                break;
            }

            case R.id.nav_e: {
                fragment = new EFragment();
                setTitle(R.string.e_header);
                break;
            }

            case R.id.nav_r: {
                fragment = new RFragment();
                setTitle(R.string.r_header);
                break;
            }
        }

        FragmentManager fm = getSupportFragmentManager();
        if (fragment != null) {
            fm.beginTransaction()
                    .replace(R.id.contraint_layout_spotlight_container, fragment)
                    .commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
