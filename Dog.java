package Task2;

import java.time.LocalDate;

public class Dog extends Animal implements Speakable, Goable {
    public Dog() {
        super();
    }

    public Dog(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public void speak() {
        System.out.println("Гав-Гав");

    }

    @Override
    public void go() {
        System.out.println("Пес идет вперед!");

    }

}
