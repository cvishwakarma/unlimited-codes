/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class UserInput {
    public static void main(String[] args) {
   TextInput txtInput = new NumericInput();
    txtInput.add('1');
    txtInput.add('a');
    txtInput.add('0');
    System.out.println(txtInput.getValue());
    }
    private static class TextInput {
        String str="";
        public TextInput() {
        }

        private void add(char c) {
            if(!Character.isLetter(c))
            {
                str+=c;
                System.out.println("Insite TextInput add()");
                System.out.println(c);
                System.out.println(str);
            }
        }
        public String getValue()
        {
            return str;
        }
       
    }

    private static class NumericInput extends TextInput {
           String str="";
        public NumericInput() {
        }
         private void add(char c) {
            if(!Character.isDigit(c))
            {
              str+=c;
               System.out.println("Insite NumericInput add()");
                System.out.println(c);
                System.out.println(str);
            }
        }
    }
}
