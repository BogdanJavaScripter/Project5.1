package com.example.bookrecommendation;
import java.util.Scanner;
public class Project5part2 {

    public class Main {
        public static void main(String[] args) {
            char userChoice;

            Scanner keyboard = new Scanner(System.in);

            do {
                print("Hello If youre here, you might want advice.");
                print("Im a book guy and can recommend interesting books.");
                int age = getUserAge(keyboard);

                recommendBookAge(age);

                userChoice = getUserChoice(keyboard);
            } while (userChoice == 'Y' || userChoice == 'y');
        }

        private static int getUserAge(Scanner keyboard) {
            print("Please enter your age: ");
            return keyboard.nextInt();
        }

        private static void recommendBookAge(int age) {
            print("Book found:");
            if (age <= 6) {
                print("Trinity The History of the Creation of the Nuclear Bomb.");
            } else if (age >= 7 && age <= 13) {
                print("Superstrings and the Search for the Theory of Everything 1st Edition.");
            } else if (age >= 14 && age <= 25) {
                print("Book not found.");
                print("You're at university and you might not have much time to read Goodbye");
            } else if (age >= 26 && age <= 50) {
                print("That will be such a nice lesson for you Atomic Habits.");
            } else {
                print("You have already reached the state of bliss and genius.");
                print("I will tell you some books after I beat my grandfather in chess.");
            }
        }

        private static char getUserChoice(Scanner keyboard) {
            print("Do you want to continue Y or N ");
            return keyboard.next().charAt(0);
        }

        private static void print(String message) {
            System.out.println(message);
        }
    }
}
