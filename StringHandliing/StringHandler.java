/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandliing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class StringHandler {

    public static void main(String[] args) {
        countNumberOfWords();
        calculateNumInString();
        permuteString();
    }

    private static void countNumberOfWords() {
        CountNumberOfWords cnow = new CountNumberOfWords();
        String wordsInPage = cnow.getWords();
        int countWords = cnow.countNumberOfWords(wordsInPage);
        System.out.println("Number of Words is " + countWords);
        System.out.println(cnow.countNumberOfWordsBySplitting(wordsInPage));
    }

    private static void calculateNumInString() {
        SplitStringAndCharacters ssac = new SplitStringAndCharacters();
        System.out.println("Calulation of adding number "+ssac.addTwoNumberInString("20 30 40"));
        System.out.println("total is "+ssac.calcualteStringValue("2*3+11-5/2"));
    }

    private static void permuteString() {
        try {
            Permutation pm = new Permutation();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string: to perform permutation");
            String str = br.readLine();
            pm.permuteString(str);
        } catch (IOException ex) {
            Logger.getLogger(StringHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
}
