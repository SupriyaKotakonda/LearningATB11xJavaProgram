package ex_03_java_basic_part3;

public class Constants {
    public static void main(String[] args) {
        final int a = 10;
//        a = 12; //java: cannot assign a value to final variable a

        final float PI = 3.14f;
//        PI = 5.22f; // java: cannot assign a value to final variable PI
        System.out.println(a);
        System.out.println(PI);
    }
}
