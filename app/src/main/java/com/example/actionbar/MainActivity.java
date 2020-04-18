package com.example.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings){
            return true;
        }else if (id == R.id.order_action){
            Intent intent = new Intent(MainActivity.this, OrderActivity.class);
            startActivity(intent);
        }else if (id == R.id.home_delivery){
            Intent intent = new Intent(MainActivity.this, HomeDeliveryActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
