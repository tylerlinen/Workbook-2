package com.pluralsight;

public class Kata {

    public static boolean feast(String beast, String dish) {

        char a = beast.charAt(0);
        char b = dish.charAt(0);
        char c = beast.charAt(0);
        char d = dish.charAt(0);

        if(a == b & c == d){
            return true;
        } else {
            return false;
        }
    }

}

