package edu.floridapoly.cop4656.spring19.brihoum.notetaking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

// I couldn't rename the class to be Uppercase :( Sorry

public class takingNotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taking_notes);

        // Get the message from Intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(NoteTaking.extraMessage);

        // Create the textview
        TextView textView = new TextView(this);


    }
}
