package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, what is your name?");
        Scanner keyboard = new Scanner(System.in);
        String user_name = keyboard.nextLine();
        System.out.println("Hello, " + user_name);
    }
}
