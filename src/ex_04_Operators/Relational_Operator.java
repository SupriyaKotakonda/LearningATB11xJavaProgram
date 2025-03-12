package ex_04_Operators;

public class Relational_Operator {

    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);

        int age_k = 33;
        int age_s = 34;
        boolean result = age_s >= age_k;
        System.out.println(result);
    }
}