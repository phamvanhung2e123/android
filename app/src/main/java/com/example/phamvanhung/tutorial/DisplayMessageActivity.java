package com.example.phamvanhung.tutorial;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String  message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        setContentView(textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            openSettings();
            return true;
        }
        if (id == R.id.action_search){
           openSearch();
           return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void openSearch() {
        Toast.makeText(this, "Search button pressed", Toast.LENGTH_SHORT).show();
    }

    private void openSettings() {
        Toast.makeText(this, "Settings button pressed", Toast.LENGTH_SHORT).show();
    }
}
