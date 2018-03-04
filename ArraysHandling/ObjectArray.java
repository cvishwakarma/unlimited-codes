/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ObjectArray {

    String name;
    int emp_id;
    int salary;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void get_data() {
        try {
            System.out.println("Enter Name");
            name = br.readLine();
            System.out.println("Enter Emp Id");
            emp_id = Integer.parseInt(br.readLine());
            System.out.println("Enter Salary");
            salary = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(ObjectArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Emp ID: " + emp_id);
        System.out.println("Salary: " + salary);

    }
    public static void main(String[] args) {
        int i;
        ObjectArray ob [] = new ObjectArray[3];
        for (int j = 0; j < ob.length; j++) {
            ob[j] = new ObjectArray();
            
        }
        for (int j = 0; j < ob.length; j++) {
            System.out.println("Enter Emp Info");
            ob[j].get_data();
            
        }
        
        for (int j = 0; j < ob.length; j++) {
            System.out.println("Emp Info "+ob[j]);
            ob[j].display();
            
        }
    }
}
