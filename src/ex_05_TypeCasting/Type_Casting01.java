package ex_05_TypeCasting;

public class Type_Casting01 {
    public static void main(String[] args) {
        byte b = 20;
        int a = b; // Valid syntax -> smaller data into the bigger data type
        // Implicit - Casting - Widening
        //int a = (int)b; // Explicit Casting - Widening( doesn't require)
        System.out.println(a);

        int c = 200;
        //byte e = c; // Invalid - Narrowing - Implicit Casting is not allowed.
        byte d = (byte)c;  // Valid - Narrowing - Explicit Casting - Allowed.
        // Data Loss.
        System.out.println(d);


        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit Casting - Narrowing
        System.out.println(s);
    }
}
