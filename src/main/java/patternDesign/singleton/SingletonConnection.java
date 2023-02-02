package patternDesign.singleton;

public class SingletonConnection {

    private static SingletonConnection instanceSingletonConnection;

    private SingletonConnection() {}

    public static SingletonConnection getInstanceSingleton() {
        if(SingletonConnection.instanceSingletonConnection == null) {
            instanceSingletonConnection = new SingletonConnection();
        }
        return instanceSingletonConnection;
    }

    public void connection() {
        System.out.println("Connecting...");
    }
}
