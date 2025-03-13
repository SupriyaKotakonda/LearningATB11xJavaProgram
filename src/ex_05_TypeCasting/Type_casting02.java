package ex_05_TypeCasting;

public class Type_casting02 {
    public static void main(String[] args) {

    int course = 100;
    float GST = 18.45f;
    //        int total = course+GST; // Narrow - Implicit
    int t1 = course + (int) GST; // Narrow - Explict
        System.out.println(t1);

    float t2 = course + GST; // Widening - auto - implicit
    float t3 = (float) course + GST; // Widening  - Explicit
        System.out.println(t2);
        System.out.println(t3);

    }
}
