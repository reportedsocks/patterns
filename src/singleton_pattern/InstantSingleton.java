package singleton_pattern;

public class InstantSingleton {

    private static InstantSingleton instance = new InstantSingleton();

    private InstantSingleton() {}

    public static InstantSingleton getInstance() {
        return instance;
    }
}
