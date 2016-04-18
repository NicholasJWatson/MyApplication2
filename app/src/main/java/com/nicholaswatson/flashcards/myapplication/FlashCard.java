package com.nicholaswatson.flashcards.myapplication;

import java.util.ArrayList;

/**
 * Created by DellUser on 3/30/2016.
 */

public class FlashCard {

    private String term;
    private String description;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    private String author;


    @Override
    public String toString(){
      return getAuthor() + getDescription() + getTerm();
    }

    public FlashCard(String term, String description, String author){

        this.term = term;
        this.description = description;
        this.author = author;


    }
    public static ArrayList<FlashCard> cards = new ArrayList<FlashCard>(){{
        add(new FlashCard("Term 1", "Description 1", "Miska"));
        add(new FlashCard("Term 2", "Description 2", "Watson"));
        add(new FlashCard("Term 3", "Description 3", "McCarty"));
        add(new FlashCard("Term 4", "Description 4", "Landon"));
        add(new FlashCard("Term 5", "Description 5", "Jordan"));
    }};


}
