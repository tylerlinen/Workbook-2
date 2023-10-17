package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your full name");
        String name = myObj.nextLine();


        String [] fullName = name.split(" ");

        String firstName = fullName[0];
        String middleName = fullName[1];
        String lastName = fullName[2];


        if(fullName.length == 2){
            System.out.println(firstName + " " + lastName);
        } else if(fullName.length == 3) {
            System.out.println(firstName + " " + middleName + " " + lastName);
        } else {
            System.out.println("error");
        }




    }
}
