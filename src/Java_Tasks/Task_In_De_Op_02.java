package Java_Tasks;

public class Task_In_De_Op_02 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

     //         Line | a | Exp
//              5 | 20 | NA
        //      6 | 19 | 19 (Exp1)
        //      6 | 19 | 19 (Exp2)
        //      6 | 20 | 20 (Exp3)
        //      7 | 19 | NA
        //  Exp1 +Exp2+Exp3 = 19+19+20 = 58
        //  a = 19




    }
}
