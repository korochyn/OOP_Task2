package Task2;

public interface Goable {
    //public static final String type = "goable";// так задаются поля public static final можно даже не указывать специально

    void go();
    default double getGoSpeed(){
        return 1;
    };
}
