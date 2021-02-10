package singleton_pattern;

public class ConditionallySynchronizedSingleton {

    private static volatile ConditionallySynchronizedSingleton instance;

    private ConditionallySynchronizedSingleton() {}

    public static ConditionallySynchronizedSingleton getInstance() {
        if (instance == null) {
            synchronized (ConditionallySynchronizedSingleton.class) {
                if (instance == null) {
                    instance = new ConditionallySynchronizedSingleton();
                }
            }

        }
        return instance;
    }
}
