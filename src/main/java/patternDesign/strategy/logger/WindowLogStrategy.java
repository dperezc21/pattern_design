package patternDesign.strategy.logger;

public class WindowLogStrategy implements LoggerStrategy {
    @Override
    public void showLog(String message) {
        System.out.println("window log message: " + message);
    }
}
