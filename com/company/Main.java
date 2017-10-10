package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        perfectRandom myLuckyNumber = new perfectRandom(2);
        Scanner kbInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = kbInput.nextLine();
        System.out.println("Nice to meet you "+ name + " your lucky number is " + myLuckyNumber.square(2));
    }
}
