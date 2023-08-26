package BosscoaderPannel;


import java.util.ArrayList;

public class ArrayListOne {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        System.out.println(arrayList.get(3));
        arrayList.set(2,45);
        System.out.println(arrayList);

        for (int a:arrayList){
            System.out.println("ForEach : "+a);
        }

        for (int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(2);
        arrayList.remove(1);
        System.out.println(arrayList.size());

    }
}
