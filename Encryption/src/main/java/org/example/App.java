package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Encryption-Decryption
 * Marcell Pather 217053947
 * 2/17/2020
 */

public class App 
{
    public static void main( String[] args )
    {
        String newWord = "";
        System.out.println("Enter the word you want to encrypt: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            int w = (int)word.charAt(i);
            w++;
            char c = (char)w;
            newWord += c;
        }
        System.out.println("Input Word: " + word);
        System.out.println("Encrypted Version: " + newWord);

        //Decryption Section
        StringBuilder dec = new StringBuilder();
        for (int i = 0; i < newWord.length(); i++){
            dec.append((char)((int)newWord.charAt(i) - 1));
        }

        System.out.println("Decrypted version: " + dec.toString());
    }
}
