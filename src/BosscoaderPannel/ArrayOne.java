package BosscoaderPannel;

public class ArrayOne {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for (int a:arr){
            System.out.println("Arr :- "+a);
        }
        for (int i=0; i<arr.length; i++){
            System.out.println("Array :- "+arr[i]);
        }
    }
}
