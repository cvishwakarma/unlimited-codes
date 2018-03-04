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
public class SplitStringAndCharacters {

    String s1 = "20 30";
    String arr1[] = s1.split(" ");
    String s2 = "1c2(h3a-+4)/.n5~!dajf,~l20#.j9ti#$219*69&6^09";
    String s3 = "ChandrashekharVishwakarmaSoftwareDeveloper";
    String s = "2*3+11-5/2";
    int total = 0;

    public SplitStringAndCharacters() {
        String arr2[] = s2.split("[[a-z][0-9]]*");
        String arr3[] = s3.split("[A-Z]*", s3.length());
        String arr4[] = s3.split("");
        char ch[] = s3.toCharArray();
    }

    public int addTwoNumberInString(String str) {
        String arr[] = str.split(" ");
        for (String s : arr) {
            total += Integer.parseInt(s.trim());
        }
        return total;
    }

    public int calcualteStringValue(String string) {
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case '+':
                    total += string.charAt(i - 1) + string.charAt(i + 1);
                    break;
                case '-':
                    total += string.charAt(i - 1) - string.charAt(i + 1);

                    break;
                case '*':
                    total += string.charAt(i - 1) * string.charAt(i + 1);

                    break;
                case '/':
                    total += string.charAt(i - 1) / string.charAt(i + 1);
                    break;
                default:
                    System.out.println("Error");

            }

        }
        return total;

    }
}
