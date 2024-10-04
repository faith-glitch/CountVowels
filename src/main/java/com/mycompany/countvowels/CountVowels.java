/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.countvowels;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class CountVowels {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input text
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Count the vowels, and display the results
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels in a string: " + vowelCount);
        
          scanner.close();
    }

    public static int countVowels(String sentence) {
        // Promt user to input text, count vowels and display results
        sentence = sentence.toLowerCase();
        
        int count = 0;
        
        //Loop the characters in the string
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            // Verify if each character is a vowel
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        
        return count;
    }

}     
    
    

