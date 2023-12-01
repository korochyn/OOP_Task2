package Task2;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    public Fish() {
        super();
    }

    public Fish(String name, Illness illness, String ownerName, LocalDate birthday) {
        super(name, illness, ownerName, birthday);
    }

    @Override
    public void swim() {
        System.out.println("Рыбки плавают в тишине");
    }

    @Override
    public double getSwimSpeed(){
        return 3;
    }

}
