package edu.montclair.dhana.drivetomsu; //package name

import androidx.appcompat.app.AppCompatActivity; //import packages

import android.content.Intent; // import intent
import android.os.Bundle; //import bundle
import android.view.View; // import view
import android.widget.Button; //import button

public class MainActivity extends AppCompatActivity {
    private Button gps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       gps = findViewById(R.id.next); // gps variable assigned to the button next

        gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, gps.class); //intent from Mainactivity to Gps Activity
                startActivity(intent);
                finish();
            }
        });
    }
}