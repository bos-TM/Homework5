package Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    static ArrayList animals = new ArrayList();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String animal;
        for(int i = 0; i < 8; i++) {
            System.out.print("Введіть назву " + (i + 1) + " тварини: ");
            animal = input.nextLine();
            animals.add(i, animal);
        }
        System.out.println(animals);
    }
}

