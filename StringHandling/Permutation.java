
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class Permutation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: to perform permutation");
        String str = br.readLine();
        permuteString(str);
    }

    private static void permuteString(String str) {
        int len = str.length();
        int numberOfWays = 0;
        boolean[] used = new boolean[len];
        StringBuffer sb = new StringBuffer();
        char[] in = str.toCharArray();
        System.out.println("Result are :    ");
        doPermute(in, sb, used, len, 0);

    }

    private static void doPermute(char[] in, StringBuffer sb, boolean[] used, int len, int level) {
        if (level == len) {
            System.out.println(sb.toString());
            return;
        }
        for (int i = 0; i < len; ++i) {
            if (used[i]) {
                continue;
            }
            sb.append(in[i]);
            used[i] = true;
            doPermute(in, sb, used, len, level+1);
            used[i] = false;
            sb.setLength(sb.length() - 1);
        }
    }

    
}
