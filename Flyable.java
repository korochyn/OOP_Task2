package Task2;

public interface Flyable {
    void fly();
    default double getFlySpeed(){
        return 1;
    };
}
