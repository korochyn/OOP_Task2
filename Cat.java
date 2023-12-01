package Task2;

import java.time.LocalDate;

public class Cat extends Animal implements Speakable, Goable {
    public Cat() {
        super();
    }

    public Cat(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public void speak() {
        System.out.println("Мяу-Мяу");

    }

    @Override
    public void go() {
        System.out.println("Кот идет вперед!");

    }

}
