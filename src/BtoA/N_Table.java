package BtoA;

import java.util.Scanner;

public class N_Table {
    public static void main(String[] args) {

        int num,tab=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        num = scanner.nextInt();

        for (int i=1; i<=10; i++){
            tab = num*i;
            System.out.println(tab);
        }
    }
}
