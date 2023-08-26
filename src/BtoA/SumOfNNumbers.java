package BtoA;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num,sum=0;

        System.out.print("Enter a number :- ");
        num = scanner.nextInt();

        for (int i=0; i<=num; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
