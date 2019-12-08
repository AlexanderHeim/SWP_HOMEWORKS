package io.github.alexanderheim;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Scanner myObj = new Scanner(System.in);
        System.out.println("Enter String to convert:");

        String input = myObj.nextLine();
        System.out.println("String to convert: " + input);
        byte[] stringBytes = input.getBytes();
        String[] stringBits = new String[stringBytes.length];
        for(int i = 0; i < stringBytes.length; i++) {
            stringBits[i] = Integer.toString(stringBytes[i], 2);
            System.out.println(i + " -> " + stringBits[i]);
        }*/

        UserInputScanner s = new UserInputScanner("------------------------------");
        try{
            String input = s.getText();
            for(String str : StringConverter.convert(input, 2)){
                System.out.println(str);
            }
        } catch (IOException | TooManyCharsException e){
            e.printStackTrace();
        }

    }
}
