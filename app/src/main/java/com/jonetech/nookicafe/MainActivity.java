package com.jonetech.nookicafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String fOrderText;

    public static String EXTRA_MESSAGE = "com.jonetech.nookicafe.EXTRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToOrderPage();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * This function is used to initialize and display out toast messages of items ordered
     *
     * @param message
     */
    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    /**
     * This click listener shows users froyo order
     *
     * @param view
     */
    public void showFroyoOrder(View view) {
        fOrderText = getString(R.string.froyo_order_message);

        displayToast(fOrderText);
    }

    /**
     * This click listener shows users froyo order
     *
     * @param view
     */
    public void showIceCreamOrder(View view) {

        fOrderText = getString(R.string.ice_cream_order_message);
        displayToast(fOrderText);
    }

    /**
     * This click listener shows users froyo order
     *
     * @param view
     */
    public void showDonutOrder(View view) {

        fOrderText = getString(R.string.donut_order_message);
        displayToast(fOrderText);
    }

    /*
        Navigates from the MainActivity to the OrdersActivity
     */
    private void navigateToOrderPage() {

        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra(EXTRA_MESSAGE, fOrderText);
        startActivity(intent);
    }
}
