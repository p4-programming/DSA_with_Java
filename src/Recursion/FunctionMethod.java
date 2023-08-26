package Recursion;

public class FunctionMethod {
    public static void main(String[] args) {
        message1();
    }

    static void message1(){
        System.out.println("Msg1");
        message2();
    }

    static void message2(){
        System.out.println("Msg2");
        message3();
    }

    static void message3(){
        System.out.println("Msg3");
        message4();
    }

    static void message4(){
        System.out.println("Msg4");
        message5();
    }

    static void message5(){
        System.out.println("Msg5");
    }
}
