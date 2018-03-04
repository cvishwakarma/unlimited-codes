/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

/**
 *
 * @author DELL
 */
public class CalcString {

    String str = "20 30";

    public static void main(String[] args) {
        CalcString cs = new CalcString();
        System.out.println(cs.addToNum(cs.str));
    }

    private Integer addToNum(String str) {
        String[] numbers = str.split(" ");
        int total = 0;
        for (String number : numbers) {
            total += Integer.parseInt(number.trim());
        }
        return total;

    }
}
