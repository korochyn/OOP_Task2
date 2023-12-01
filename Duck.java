package Task2;

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Flyable, Swimable, Speakable {
    public Duck() {
        super();
    }

    public Duck(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public void go() {
        System.out.println("Утки идут только вперед!");

    }

    @Override
    public void fly() {
        System.out.println("Утки могут и летать!");

    }

    @Override
    public void swim() {
        System.out.println("Утки могут и плавать!");

    }

    @Override
    public void speak() {
        System.out.println("Кря-Кря");

    }

}
