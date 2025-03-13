package ex_06_Ternary_Operator;

public class Nested_Ternary_Operator {
    public static void main(String[] args) {
        int n = 10;
        String s = n>5 ? (n>=10 ? "Yes" : "No") : "Nope";
        System.out.println(s);

        int n1 = -5;
        String s1 = n1>5 ? (n1>=10 ? "Yes" : "No") : (n1<-6 ? "Correct" : "Wrong" );
        System.out.println(s1);

        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println(max);

        int num = 10;
        String result = (num%2==0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
