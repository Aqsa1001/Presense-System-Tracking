package com.razi.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.database.core.Context;

import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {
    private final static int LOGIN_PERMISSION = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button signInBtn = (Button) findViewById(R.id.signin);
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(
                        AuthUI.getInstance().createSignInIntentBuilder()
                                .setAvailableProviders(Arrays.asList(
                                        new AuthUI.IdpConfig.EmailBuilder().build()
                                ))
                                .setIsSmartLockEnabled(false) // Disable Smart Lock
                                .build(),
                        LOGIN_PERMISSION);
            }


        });
        }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == LOGIN_PERMISSION) {
            startNewActivity(resultCode,data);
        }
        else
        {
            Toast.makeText(this, "errrrrrrrrrrorrrrrrrr", Toast.LENGTH_SHORT).show();
            Log.i("Error","signin error");
        }
    }
    private void startNewActivity(int resultCode, Intent data)
    {
        if (resultCode==RESULT_OK)
        {
            Intent intent= new Intent(MainActivity2.this,ListOnline.class);
            startActivity(intent);
            finish();
        }
        else
        {
            Toast.makeText(this, "Login failed!!!!", Toast.LENGTH_SHORT).show();
        }
    }

}