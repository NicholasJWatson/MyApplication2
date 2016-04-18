package com.nicholaswatson.flashcards.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SelectTerm extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Loops through array looks for fCard i
        FlashCard fCard;
        ArrayList <String> termArr = new ArrayList<>();
        for(int i = 0; i < FlashCard.cards.size(); i++){
            //Adds each card to getTerm.  Grabs only the Term data to display
            fCard = FlashCard.cards.get(i);
            termArr.add(fCard.getTerm());
        }
        //Put items in the array into the list view in the order they are received
        ListView listTerms = getListView();
        ArrayAdapter<String>listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                termArr);
        listTerms.setAdapter(listAdapter);
    }

    //Found on stackoverflow.  Allows user to get a handle on items in the array
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
            //Displays only the description in the DisplayTerm
            FlashCard fCard;
            fCard = FlashCard.cards.get(position);
            Intent intent = new Intent(SelectTerm.this, DisplayTerm.class);
            intent.putExtra("descKey", fCard.getDescription());
            startActivity(intent);
    }
}
