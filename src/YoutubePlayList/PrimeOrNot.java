package YoutubePlayList;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 0; i <= num; i++) {
            System.out.println(i+" is "+isPrime(i));
        }
    }

    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
