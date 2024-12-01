package com.example.fitnesstrackerapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UnderAgeActivity extends AppCompatActivity {

    int[] arrExercises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_age);

        Toolbar toolbar1 = findViewById(R.id.toolbarUnder);
        setSupportActionBar(toolbar1);

        arrExercises = new int[]{

                R.id.bow_pose, R.id.bridge_pose, R.id.chair_pose, R.id.child_pose,R.id.cobler_pose,R.id.cow_pose,
                R.id.playji_pose,R.id.pauseji_pose,R.id.plank_pose,R.id.crunches_pose,R.id.situp_pose,R.id.rotation_pose,R.id.twist_pose,R.id.windmill_pose,
                R.id.legup_pose
        };

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.id_privacy){
            return true;
        }
        if(id==R.id.id_term){
            return true;
        }
        if(id==R.id.rate){
            return true;
        }
        if(id==R.id.more){
            return true;
        }
        if(id==R.id.share){
            return true;
        }

        return true;
    }

    public void Imagebuttonclicked(View view) {
        for (int i = 0; i < arrExercises.length; i++) {
            if(view.getId() == arrExercises[i]){
                 int val = i+1;
                 Log.i("First", String.valueOf(val));
                Intent intent = new Intent(UnderAgeActivity.this, thirdActvity.class);
                intent.putExtra("value", String.valueOf(val));
                startActivity(intent);
            }
        }
    }
}