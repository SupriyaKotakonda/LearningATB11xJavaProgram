package Java_Tasks;

import java.util.Scanner;

public class Task_EO_If_Else {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        if (n%2==0){
            System.out.println("Entered number "+n+" is even");
        }
        else{
            System.out.println("Entered number "+n+" is odd");
        }
    }
}
