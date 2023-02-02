package patternDesign.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonConnection singletonConnection = SingletonConnection.getInstanceSingleton();
        SingletonConnection singletonConnection1 = SingletonConnection.getInstanceSingleton();
    }
}