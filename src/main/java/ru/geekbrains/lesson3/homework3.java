package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class homework3 {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        game();

    }
    public static void game(){
        System.out.println("Please enter your name to continue.");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");
        do {
            int counter = 3;
            int gamer = -1;
            int number = random.nextInt(10);
            while (counter > 0 && gamer != number) {
                System.out.println("Guess the number from 0 to 9.");
                gamer = scanner.nextInt();
                if (gamer != number) {
                    counter--;
                    System.out.println("Your number is " + (gamer < number ? "Your number is less" : "Your number is greater"));
                }
            }
            System.out.println("You " + (gamer == number ? "Winner" : "Lose"));
            System.out.println("Repeat game? Yes - 1, No - 0");
        } while (scanner.nextInt() == 1);
    }
}
