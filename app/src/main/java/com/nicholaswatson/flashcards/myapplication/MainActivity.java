package com.nicholaswatson.flashcards.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Go from main activity to see terms
    public void clickSelectTerm(View view) {
        Intent intent = new Intent(this, SelectTerm.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addTerms(View v){
        String authorName = getString(R.string.myAuthor);
        //Contents of the text bars are gotten and added to cards array.
        EditText termPart  = (EditText)findViewById(R.id.termText);
        EditText descPart  = (EditText)findViewById(R.id.descText);
        FlashCard c = new FlashCard(termPart.getText().toString(), descPart.getText().toString(), authorName);
        FlashCard.cards.add(c);
    }
}
