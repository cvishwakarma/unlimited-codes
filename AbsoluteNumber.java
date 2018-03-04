
import static java.lang.Math.abs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class AbsoluteNumber {
    public static void main(String[] args) {
        int arr[] = {2,-9,3,7,-8,3};
        System.out.println(getPosNum(arr));
    }

    private static int getPosNum(int[] arr) {
       int counter = 0;
       
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >=0)
            {
                
                counter++;
            }
           
        }
        return counter;
        
    }
}
