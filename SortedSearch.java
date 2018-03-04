
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
public class SortedSearch {
    public static void main(String[] args) {
        int []nums = {1,3,5,7,9,11,13,15,17,21,15,26,34,38};
        int lessThan = 20;
        System.out.println(Arrays.toString(nums));
        System.out.println(SortedSearch.countNumbers(nums,lessThan));
    }

    private static int countNumbers(int[] nums, int lessThan) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
                 
               if(nums[i]<lessThan)
                 {
                    counter+=1;
                 }
                 
        }
    return counter;
    }
 
}
