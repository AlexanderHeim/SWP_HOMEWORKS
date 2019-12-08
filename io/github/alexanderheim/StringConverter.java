package io.github.alexanderheim;

public class StringConverter {

    public static String[] convert(String text, int base){
        if(text.length() == 0) return new String[] {""};
        byte[] stringBytes = text.getBytes();
        String[] stringBits = new String[stringBytes.length];
        for(int i = 0; i < stringBytes.length; i++) {
            stringBits[i] = Integer.toString(stringBytes[i], base);
        }
        return stringBits;
    }
}
