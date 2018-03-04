/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysHandling;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.sort;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class DuplicateRemoverArray {
    public static void main(String[] args) {
        int [] intArr = {1,2,4,6,7,1,2,6,5};
        sortArr(intArr);
    }
    public static void sortArr(int [] arr)
    {
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i:arr)
        {
            list.add(i);
        }
        Set <Integer> set = new LinkedHashSet(list);
        for(Integer integer:set)
        {
            System.out.println(integer+" ");
            
            
        }
    }
}
