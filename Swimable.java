package Task2;

public interface Swimable {
    void swim();
    default double getSwimSpeed(){
        return 1;
    };
}
