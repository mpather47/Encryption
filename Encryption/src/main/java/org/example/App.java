package org.example;

import java.sql.SQLOutput;
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
        System.out.print(newWord);

        //Decryption Section
        System.out.print("\nEnter a word to decrypt: ");
        String decryptWord = sc.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < decryptWord.length(); i++) {
            int w = decryptWord.charAt(i);
            w--;
            char c = (char)w;
            output.append(c);
        }
        System.out.println(output);
    }
}
