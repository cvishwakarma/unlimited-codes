/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Vishwa
 */
public class BalancedExpression {
   public  char TOKENS[][] ={{'{','}'},{'(',')'},{'[',']'}};
   public  boolean isBalancedExpr(String expr){
      Stack<Character> stack = new Stack<Character>();
      for(char ch:expr.toCharArray()){
          if(isOpenTerm(ch)){
              stack.push(ch);
          }
          else{
              if(stack.isEmpty()|| !matches(stack.pop(),ch)){
               return false;           
              }
          }
      }
      return stack.empty();
   }

    private  boolean isOpenTerm(char ch) {
    for(char [] chArr : TOKENS){
        if(chArr[0]==ch){
            return true;
        }
    }
    return false;
    }

    private  boolean matches(Character openTerm, char closeTerm) {
     for(char [] chArr:TOKENS){
        if(chArr[0]==openTerm){
            return chArr[1] == closeTerm;
        } 
     }
     return false;
    }
    public static void main(String[] args) {
        BalancedExpression be = new BalancedExpression();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter expression only use {([])}");
        String expr = input.nextLine();
        if(be.isBalancedExpr(expr)){
            System.out.println(expr+" is true");
        }else{
            System.out.println(expr+" is false");
        }
    }
}
