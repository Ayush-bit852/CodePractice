package com.example.project;

public class StringMethod {

    public static void main(String[] args) {

        String str = "Ayush Sharma";

        int length = str.length();
        System.out.println(length);

        int occurence = str.indexOf("h");
        System.out.println(occurence);

        String replace = str.replace('A','u');
        System.out.println(replace);

        int lastOccurence = str.lastIndexOf("h");
        System.out.println(lastOccurence);

        String repeat = str.repeat(4);
        System.out.println(repeat);

        if(str.contains(" ")){
            System.out.println("Your name contains a space");
        }else {
            System.out.println("Your name Dosent contains a space");
        }
        int  occurence1  = str.indexOf("a");
        System.out.println(occurence1);

        
    }
}
