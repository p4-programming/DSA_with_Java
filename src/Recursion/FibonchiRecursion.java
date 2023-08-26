package Recursion;

public class FibonchiRecursion {
    public static void main(String[] args) {

        int output = 0;
        int nu = 5;
        for (int i=0; i<=nu ;i++) {
            output = fibo(i);
            System.out.println(output);
        }
    }

    static int fibo(int n){
        if (n == 1 || n == 0){
            return 1;
        }else {
            return  (fibo(n-1)+fibo(n-2));
        }
    }
}
