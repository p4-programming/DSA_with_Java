package Pattern;

//Write a program to print this pattern
// 5 5 5 5 5
// 4 4 4 4
// 3 3 3
// 2 2
// 1

public class PatternSix {
    public static void main(String[] args){
        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" "+i);
            }
            System.out.println("");
        }
    }
}
