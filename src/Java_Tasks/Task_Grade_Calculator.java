package Java_Tasks;

public class Task_Grade_Calculator {
    public static void main(String[] args) {
        String g1 = args[0];
        System.out.println(g1);
//        System.out.println(g1 instanceof String);

        int G = Integer.parseInt(g1);

        String result = (G>=90) ? "A" : (G>=80) ? "B" : (G>=70) ? "C" : (G>=60) ? "D" : "F";
        System.out.println(result);


    }
}
