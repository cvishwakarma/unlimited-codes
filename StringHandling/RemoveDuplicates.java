/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "chandrashekhar";
        System.out.println(removeDuplicates(str));

    }

    public static String removeDuplicates(String str) {
        Set<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }

        }
        return sb.toString();

    }
}
