package Java_Tasks;

public class Task_In_De_Op_01 {
    public static void main(String[] args) {
            int a = 10;
            System.out.println(++a + a++ + a++);
            System.out.println(a);

//            Line | a | Exp
//              5 | 10 | NA
        //      6 | 11 | 11 (Exp1)
        //      6 | 11 | 11 (Exp2)
        //      6 | 12 | 12 (Exp3)
        //      7 | 13 | NA
        //  Exp1 +Exp2+Exp3 = 11+11+12 = 34
        //  a = 13


        }
    }

