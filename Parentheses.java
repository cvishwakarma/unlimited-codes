/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.util.*;

/**
 * Check for balanced parentheses in an expression
 * Given an expression string exp, write a program to examine
 * whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
 * <p/>
 * For example, the program should print true for exp = “[()]{}{[()()]()}” and false for exp = “[(])”
 */
public class Parentheses {

    public boolean check(String exp) {
        Map<Character, Character> charMap = new HashMap<Character, Character>();
        charMap.put('{', '}');
        charMap.put('[', ']');
        charMap.put('(', ')');

        if (exp.length() == 1) return false;
        LinkedList<Character> characters = new LinkedList<Character>();
        characters.add(exp.charAt(0));

        for (int i = 1; i < exp.length(); ++i) {
            char c = exp.charAt(i);
            if (c == '[' || c == '(' || c == '{') characters.add(c);
            else if (c == ']' || c == ')' || c == '}') {
                Character peek = characters.peekLast();
                if (charMap.get(peek).equals(Character.valueOf(c))) characters.removeLast();
                else
                    return false;
            }
        }
        return characters.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Parentheses().check("[()]{}{[()()]()}"));
        System.out.println(new Parentheses().check("[(])"));
    }

}
