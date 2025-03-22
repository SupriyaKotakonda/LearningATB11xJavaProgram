package ex_10_For_Loop;

public class For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 3){
                continue;  // skip below code, move to top
            }
            System.out.println(i);
        }
    }
}
