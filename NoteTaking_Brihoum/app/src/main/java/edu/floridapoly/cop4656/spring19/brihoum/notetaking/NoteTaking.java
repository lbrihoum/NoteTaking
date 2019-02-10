package edu.floridapoly.cop4656.spring19.brihoum.notetaking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


// THIS FILE IS FOR MAINACTIVITY.XML

public class NoteTaking extends AppCompatActivity {

    public final static String extraMessage = "Heyo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void noteScreen(View view) {
        // Intent will have the button go to the new activity (or screen) takingNotes.
        Intent startNewActivity = new Intent(this, takingNotes.class);
        //EditText theEditText = theEditText.getText().toString();
        //startNewActivity.putExtra(extraMessage, true);
        startActivity(startNewActivity);
    }

}
