package com.example.rafael.actividad4;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opcion1:
                Toast.makeText(getApplicationContext(), "Este es el 1º ITEM",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion2:
                Toast.makeText(getApplicationContext(), "Este es el 2º ITEM",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion3:
                Toast.makeText(getApplicationContext(), "Este es el 3º ITEM",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion4:
                Toast.makeText(getApplicationContext(), "Este es el 4º ITEM",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion5:
                Toast.makeText(getApplicationContext(), "Este es el 5º ITEM",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion6:
                Toast.makeText(getApplicationContext(), "Este es el 6º ITEM",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opcion7:
                Toast.makeText(getApplicationContext(), "Este es el 7º ITEM",
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;

        }
    }
}
