package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// Create 3 size 5 arrays: nouns, adjectives, and verbs
        String[] noun = {"book", "banana", "wand", "coffee", "kazoo"};
        String[] adjective ={"furry", "mental", "illegal", "massive", "raw"};
        String[] verb ={"read", "eat", "shop", "knock", "die"};

    /*get a random number from the range of zero to the number
        passed in as a parameter. */
        Random word = new Random();
        int indexNoun = word.nextInt(noun.length);
        Random description = new Random();
        int indexAdjective = description.nextInt(adjective.length);
        Random action = new Random();
        int indexVerb = action.nextInt(verb.length);

        /* Write a small story that randomly gets words from each array to
        fill in blank points in the story based on the word type.
         */
        System.out.println("Learning to " + verb[word.nextInt(5)]+ " can be a(n) " +adjective[word.nextInt(5)]+
         " challenge." +"\n"+ "There is so much information to " +verb[word.nextInt(5)]+ " and retain." +
                "\n" + "Although there are a lot of " +noun[word.nextInt(5)]+"s, it can be " +adjective[word.nextInt(5)]+
                " to know when to use them." +"\n");

    }
}
