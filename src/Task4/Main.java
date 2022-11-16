package Task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(21);
        arrayList.add(32);
        arrayList.add(7);
        arrayList.add(3);

        ListIterator iter = arrayList.listIterator();
        for(int i = 0; iter.hasNext();iter.next(), i++) {
           if(i > 0)
            iter.set(arrayList.get(i-1)+1);
        }
        iter.set(arrayList.get(arrayList.size()-1)+1);
        System.out.println(arrayList);
    }
}
