package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Encryption-Decryption
 * Marcell Pather 217053947
 * 2/17/2020
 */

    // Added: Saving the word and its encrypted version in a hashmap. For no reason :)
    // Or maybe so that in case the same word is entered, the algorithm does not need
    // to be run and the correct key can be called.

public class App 
{
    public static void main( String[] args )
    {
        HashMap <String, String> wordsList = new HashMap<>();

        String newWord = "";
        System.out.println("Enter the word you want to encrypt: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            int w = (int)word.charAt(i);
            w++;
            char c = (char)w;
            newWord += c;

            wordsList.put(word, newWord);
        }
        System.out.print(newWord);

        //Decryption Section
    }
}
