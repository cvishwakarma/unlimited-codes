/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandliing;

/**
 *
 * @author DELL
 */
public class CountNumberOfWords {
    String words;
    int count = 0;

    public String getWords() {
        return words;
    }

    public CountNumberOfWords() {
        String string = "Welcome to java programming, its world most popular programming lanaguage to develop enterprize software and web application";
        this.words = string;
    }
    
    public int countNumberOfWordsBySplitting(String page)
    { 
        
        return count;
    }
    public int countNumberOfWords(String page) {
        char ch[] = new char[page.length()];
        for (int i = 0; i < page.length(); i++) {
            ch[i] = page.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
                count++;
            }

        }
        return count;
    }
}
