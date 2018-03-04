/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerearth.com/problem/algorithm/nice-arches-1/
 * Solution
 * =======
 * The problem is just one variation of classic problem check if given parentheses are balanced.
 * http://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
 */
public class NiceArches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int M = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < M; i++) {
            String a = scanner.next();
            boolean balanced = isBalanced(a);

            if (balanced) {
                result++;
            }
        }

        pw.println(result);

        scanner.close();
        pw.close();
    }

    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                if (stack.isEmpty())
                    stack.push(c);
                else {
                    Character peek = stack.peek();
                    if (peek != 'A')
                        stack.push(c);
                    else {
                        stack.pop();
                    }
                }
            } else if (c == 'B') {
                if (stack.isEmpty())
                    stack.push(c);
                else {
                    Character peek = stack.peek();
                    if (peek != 'B')
                        stack.push(c);
                    else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}