package com.hit.pretstreet.pretstreet.navigation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.hit.pretstreet.pretstreet.ApplicationContext;
import com.hit.pretstreet.pretstreet.R;
import com.hit.pretstreet.pretstreet.core.customview.NotificationBadge;
import com.hit.pretstreet.pretstreet.core.utils.Utility;
import com.hit.pretstreet.pretstreet.navigation.adapters.NavDrawerAdapter;
import com.hit.pretstreet.pretstreet.navigation.interfaces.NavigationClick;
import com.hit.pretstreet.pretstreet.navigation.models.NavDrawerItem;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, NavigationClick {
    NotificationBadge mBadge;
    NavDrawerAdapter navDrawerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        toolbar.setPadding(0, Utility.getStatusBarHeight(HomeActivity.this), 0, 0);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, null, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        final NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View v = navigationView.getHeaderView(0);
        mBadge = (NotificationBadge) v.findViewById(R.id.badge);
        mBadge.setNumber(10);

        NavDrawerItem[] navArray = new NavDrawerItem[]{
                new NavDrawerItem("nav_home", "Home"),
                new NavDrawerItem("nav_account", "Account"),
                new NavDrawerItem("nav_offers", "Offers"),
                new NavDrawerItem("nav_following", "Following"),
                new NavDrawerItem("nav_addstore", "Add Store"),
                new NavDrawerItem("nav_about", "About Pretstreet"),
                new NavDrawerItem("nav_contact", "Contact Us"),
                new NavDrawerItem("nav_support", "Support"),
                new NavDrawerItem("nav_terms", "Terms & Conditions"),
                new NavDrawerItem("nav_rateus", "Privacy Policy")};
        navDrawerAdapter = new NavDrawerAdapter(HomeActivity.this, navArray, HomeActivity.this);
        RecyclerView rv_nav = (RecyclerView) findViewById(R.id.rv_nav);
        Utility.setListLayoutManager(rv_nav, HomeActivity.this);
        rv_nav.setAdapter(navDrawerAdapter);

        Button iv_menu = (Button) toolbar.findViewById(R.id.iv_menu);
        iv_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!drawer.isHovered())
                    drawer.openDrawer(Gravity.LEFT);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void menuOnClick(String id) {
        String itemId = id;
        Toast.makeText(ApplicationContext.getApplicationInstance(), id, Toast.LENGTH_SHORT).show();

        switch (itemId) {
            case "nav_about":
                break;
            case "nav_account":
                break;
            case "nav_addstore":
                break;
            case "nav_contact":
                break;
            case "nav_following":
                break;
            case "nav_home":
                break;
            case "nav_offers":
                break;
            case "nav_privacypolicy":
                break;
            case "nav_rateus":
                break;
            case "nav_support":
                break;
            case "nav_terms":
                break;
            default:
                break;
        }
    }
}