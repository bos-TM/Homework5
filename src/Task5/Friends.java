package Task5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        Friends friend = new Friends();
        friend.names.add("Микола");
        friend.names.add("Анатолій");
        friend.names.add("Оксана");
        friend.names.add("Марина");
        friend.names.add("Степан");
        System.out.println(friend.names);
        Collections.sort(friend.names);
        System.out.println(friend.names);
    }
}


