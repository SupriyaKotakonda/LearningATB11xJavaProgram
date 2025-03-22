package ex_10_For_Loop;

public class For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 3){
                break;  // break - it is used to come out of the loop
            }
            System.out.println(i);
        }
    }
}
