package Pattern;

//Write a programm to print this pattern
//         * * * * *
//         * * * *
//         * * *
//         * *
//         *

public class PatternFour {
    public static void main(String[] args){
        for(int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" "+"*");
            }
            System.out.println("");
        }
    }
}
