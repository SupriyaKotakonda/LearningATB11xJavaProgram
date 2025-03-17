package ex_08_If_Condition;

public class If_Con_02 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age>18){
            System.out.println("You are allowed");
        }
        else {
            System.out.println("Not allowed");
        }
    }
}
