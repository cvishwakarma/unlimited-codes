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
public class Permutation {
    int countPermutaion = 0;

    public int getCountPermutaion() {
        return countPermutaion;
    }
    public Permutation() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string: to perform permutation");
            String str = br.readLine();
            permuteString(str);
        } catch (IOException ex) {
            Logger.getLogger(Permutation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    public  void permuteString(String str) {
        int len = str.length();
        int numberOfWays = 0;
        boolean[] used = new boolean[len];
        StringBuffer sb = new StringBuffer();
        char[] in = str.toCharArray();
        System.out.println("Result are :    ");
        doPermute(in, sb, used, len, 0);

    }

    public  void doPermute(char[] in, StringBuffer sb, boolean[] used, int len, int level) {
        if (level == len) {
            System.out.println(sb.toString());
            return;
        }
        for (int i = 0; i < len; ++i) {
            if (used[i]) {
              this.countPermutaion++;
                continue;
                
            }
            sb.append(in[i]);
            used[i] = true;
            doPermute(in, sb, used, len, level+1);
            used[i] = false;
            sb.setLength(sb.length() - 1);
        }
    }

}
