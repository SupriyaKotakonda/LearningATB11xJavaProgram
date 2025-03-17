package ex_08_If_Condition;

import java.util.Scanner;

public class If_Else_01 {
    // Allowed to vote or not
    // If age > 18 -> allowed to vote.
    // else age < >18 -> Not allowed to vote.

    public static void main(String[] args) {
        // How to take the user Input
        // 1. CLI Options
        //
//        int age = Integer.parseInt(args[0]);

        // 2. Scanner Class

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scanner.nextInt();
//        System.out.println(age);
        if (age>18){
            System.out.println("You are allowed");
        }
        else {
            System.out.println("Not allowed");
        }



    }
}
