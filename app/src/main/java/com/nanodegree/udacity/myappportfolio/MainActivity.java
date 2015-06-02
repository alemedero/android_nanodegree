package com.nanodegree.udacity.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void openSpotifyStreamerApp(View view){
        showToast("This button will launch my Spotify Streamer APP!");
    }

    public void openScoresApp(View view){
        showToast("This button will launch my Scores APP!");
    }

    public void openLibraryApp(View view){
        showToast("This button will launch my Library APP!");
    }

    public void openBuildItBiggerApp(View view){
        showToast("This button will launch my Build It Bigger APP!");
    }

    public void openXYZReaderApp(View view){
        showToast("This button will launch my XYZ Reader APP!");
    }

    public void openCapstoneOwnApp(View view){
        showToast("This button will launch my Capstone Own APP!");
    }
}
