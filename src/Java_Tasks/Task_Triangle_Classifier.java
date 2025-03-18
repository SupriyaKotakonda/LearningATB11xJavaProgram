package Java_Tasks;

import java.util.Scanner;

public class Task_Triangle_Classifier {
    public static void main(String[] args) {

         /*
         write me program in java Write a program that classifies a triangle based on its side lengths.
         Given three input values representing the lengths of the sides,
         determine if the triangle is equilateral (all sides are equal),
         isosceles (exactly two sides are equal), or scalene (no sides are equal).
          Use an if-else statement to classify the triangle.
         */

        Scanner side1 = new Scanner(System.in);
        System.out.println("Enter first side value");
        float s1 = side1.nextFloat();
        Scanner side2 = new Scanner(System.in);
        System.out.println("Enter second side value");
        float s2 = side2.nextFloat();
        Scanner side3 = new Scanner(System.in);
        System.out.println("Enter third side value");
        float s3 = side3.nextFloat();
        if(s1 == s2 && s2 == s3 ) {
            System.out.println("Triangle is equilateral");
        } else if (s1 == s2 || s2 == s3 || s1 ==s3){
                System.out.println("isosceles triangle");
            }
            else {
                System.out.println("scalene triangle");
            }
        }
    // output
        //    Enter first side value
        //    4.56
        //    Enter second side value
        //    4.56
        //    Enter third side value
        //    6.78
        //    isosceles triangle


    }

