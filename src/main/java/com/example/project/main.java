package com.example.project;



public class main {

    public static void main(String[] args) {

        int age = 23;
        int year = 2025;
        int quantity = 1;

        System.out.println("The year is " + year);


        double price = 22.9;
        double gpa = 3.5;
        double temprature = 32.5;
        char currency = '$';
        System.out.println("The Burger Costs " + currency + price);

        char grade = 'A';
        char gender = 'F';
        System.out.println("The Buyer is in grade " + grade + " and her Gender is " + gender);

        boolean isStudent = true;
        boolean isTeacher = false;
        System.out.println("Ayush is Student I hope that is " + isStudent );
        System.out.println("Ayush is Teacher I hope that is " + isTeacher);

        StringBuilder builder = new StringBuilder();
        for (char c : "Ayush".toCharArray()) {
            builder.append(c);
        }
        System.out.println(builder.reverse());


    }
}
