package Java_Tasks;

public class Task_CLI_Maxfind_Ternary {
    public static void main(String[] args) {

        //Take a user input 2 numbers from the arguments and calculate the maximum
        // in between with ternary operator.

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        String n = n1>n2 ? ("Max is "+n1) : ("Max is "+n2);
        System.out.println(n);




    }
}
