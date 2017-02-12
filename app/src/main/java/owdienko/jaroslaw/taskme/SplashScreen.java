package owdienko.jaroslaw.taskme;

/**
 * Created by Jaroslaw Owdienko on 2/9/2017. All rights reserved TaskMe!
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import owdienko.jaroslaw.taskme.Data.DBHandler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        DBHandler.getInstance(this);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}