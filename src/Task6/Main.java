package Task6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers= new ArrayList<>();
        teachers.add("Кочеткова Ніна Миколаївна");
        teachers.add("Столярик Ганна Михайлівна");
        teachers.add("Василенко Тетяна Марківна");
        teachers.add("Оніщук Галина Степанівна");
        teachers.add("Клевака Віта Василівна");
        System.out.println(teachers);
        System.out.println("Індекс найкращого вчителя: " + teachers.indexOf("Василенко Тетяна Марківна"));
        System.out.println("Індекс найгіршого вчителя: " + teachers.indexOf("Клевака Віта Василівна"));
    }
}
