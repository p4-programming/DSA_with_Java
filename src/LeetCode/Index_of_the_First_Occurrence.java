package LeetCode;

public class Index_of_the_First_Occurrence {
    public static void main(String[] args) {

        String one = "FindTheValue";
        String second = "Find";
        System.out.println(firstOccurence(one,second));
    }

    static int firstOccurence(String first, String second){
        return first.indexOf(second);
    }
}
