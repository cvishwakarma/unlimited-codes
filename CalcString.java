
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class CalcString {

    public static void main(String[] args) {
        String str = "20 30 40";
        String strCalc = "2*3";
        System.out.println(addToNum("20 30"));
        System.out.println(calcNum(strCalc));

    }

    private static Integer addToNum(String str) {
        String[] numbers = str.split(" ");
        int total = 0;
        for (String number : numbers) {
            total += Integer.parseInt(number.trim());
        }
        return total;
    }

    private static Integer calcNum(String strCalc) {
        int total = 0;
        String arr[] = strCalc.split("[+*/-]");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length; i++) {
            int first = Integer.parseInt(arr[i]);
            int second = Integer.parseInt(arr[i]);
            System.out.println(first);
            System.out.println(second);
            if (strCalc.charAt(i) == '+') {
                total = first+second;
            }
            if (strCalc.charAt(i) == '-') {
                total = first-second;
                System.out.println(total);

            }
            if (strCalc.charAt(i) == '*') {
                total = first*second;
                System.out.println(total);

            }
            if (strCalc.charAt(i) == '/') {
                total = first/second;
                System.out.println(total);


            }

        }
        return total;
    }
}
