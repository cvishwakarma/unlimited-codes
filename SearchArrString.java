
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
public class SearchArrString {
    
    public static void main(String[] args) {
        String input_arr[] = {"ab", "bc", "cd", "de", "ef", "ghi"};
        String toString = "cd";
        String fromString = "ghi";
        System.out.println(Arrays.toString(SearchString(input_arr, toString, fromString)));
    }
    
    private static String[] SearchString(String[] input_arr, String toString, String fromString) {
        String arr [] = Arrays.copyOfRange(input_arr,2, 6);
        for (int i = 0; i < input_arr.length; i++) {
         
        }
        return arr;
    }
    
}
