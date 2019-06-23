package com.goodiebag.protractorview.example;


//import android.content.Context;
//import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//import android.view.View;
import android.widget.ImageButton;
//import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton button = (ImageButton) findViewById(R.id.level);

  //      button.setOnClickListener(new OnClickListener() {

    //        @Override
      //      public void onClick(View v) {
        //      Intent intent = new Intent(MainActivity.this,
            //            Noise_Level.class);
              //  startActivity(intent); // startActivity allow you to move
            //}
        //});


}
}