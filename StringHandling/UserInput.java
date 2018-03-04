/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

/**
 *
 * @author DELL
 */
public class UserInput {

    public static void main(String[] args) {
        TextInput textInput = new NumericInput();
        textInput.add('1');
        textInput.add('a');
        textInput.add('0');
        System.out.println(textInput.getValue());
    }

    private static class TextInput {

        String str = "";

        public TextInput() {
        }

        private void add(char c) {
            if (!Character.isLetter(c)) {
                str += c;
            }
        }

        public String getValue() {
            return str;
        }

    }

    private static class NumericInput extends TextInput {

        String str = "";

        public NumericInput() {

        }

        private void add(char c) {
            if (!Character.isDigit(c)) {
                str += c;
            }
        }
    }

}
