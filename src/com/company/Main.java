package com.company;

import java.util.Scanner;

public class Main {

    //TODO: add ROT-5

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string: ");
            String input = reader.nextLine();
            System.out.println(encode(input));
            System.out.println();
        }

    }

    public static String encode(String input) {
        StringBuilder encodedString = new StringBuilder();
        for (int i = 0; i < input.length(); i += 1) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'm') {
                c += 13;
            } else if (c >= 'A' && c <= 'M') {
                c += 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else if (c >= 'N' && c <= 'Z') {
                c -= 13;
            }
            encodedString.append(c);
        }
        return encodedString.toString();
    }
}
