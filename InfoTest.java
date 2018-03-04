/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhandling;

/**
 *
 * @author Vishwa
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class InfoTest {
public static void main(String args[]) {
    int nums[] = {2,4,6,7,8};
    Scanner input = new Scanner(System.in);
	int targetNum = input.nextInt();
	int result[] = twoSum(nums,targetNum);
	System.out.println(Arrays.toString(result));
}
public static int[] twoSum(int[] nums, int target) {
    if(nums==null || nums.length<2)
        return new int[]{0,0};

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i])){
            return new int[]{map.get(nums[i]), i};
        }else{
            map.put(target-nums[i], i);
        }
    }
 
    return new int[]{0,0};
}
}
