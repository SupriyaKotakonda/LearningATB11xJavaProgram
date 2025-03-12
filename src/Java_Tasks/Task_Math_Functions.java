package Java_Tasks;

public class Task_Math_Functions {
    public static void main(String[] args) {
        double X = 10, Y = 10, Z = 10;
        double function_value = (X*X+Y*Y-Math.abs(Z));
        double cuberoot = Math.pow(function_value,1.0/3.0);
        System.out.println(cuberoot);

        // Other way to write
//        double X = 10, Y = 10, Z = 10 , Result;
//Result= Math.cbrt(Math.pow(X,2)+Math.pow(Y,2)+Math.abs(Z));
//        System.out.println(Result);





    }
}





