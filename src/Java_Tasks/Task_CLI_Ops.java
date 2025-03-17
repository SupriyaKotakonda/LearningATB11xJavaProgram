package Java_Tasks;

public class Task_CLI_Ops {
    public static void main(String[] args) {
        // CLI Options
        //
        //Take a user input - Name, Age and Salary and print them in the end.


        String name = args[0];

        int age = Integer.parseInt(args[1]);
        int sal = Integer.parseInt(args[2]);

        System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"Salary:"+sal);

//        output
//        Name:Supriya
//        Age:28
//        Salary:50000


    }
}
