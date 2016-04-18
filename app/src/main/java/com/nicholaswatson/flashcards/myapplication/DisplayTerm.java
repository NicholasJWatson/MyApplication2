package com.nicholaswatson.flashcards.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayTerm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_term);

        //Shows just the description data in the TextView
        String holdDesc = getIntent().getStringExtra("descKey");
        TextView tv = (TextView) findViewById(R.id.placeDesc);
        tv.setText(holdDesc);
    }

        public void editTerms(View v) {
        String authorName = getString(R.string.myAuthor);
        EditText termPart = (EditText) findViewById(R.id.editTermText);
        EditText descPart = (EditText) findViewById(R.id.editDescText);
        FlashCard cc = new FlashCard(termPart.getText().toString(), descPart.getText().toString(), authorName);
        FlashCard.cards.add(cc);
            Intent intent = new Intent(DisplayTerm.this, SelectTerm.class);
            startActivity(intent);


        }

}
