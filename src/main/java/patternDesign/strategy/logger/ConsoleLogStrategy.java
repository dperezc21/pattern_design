package patternDesign.strategy.logger;

public class ConsoleLogStrategy implements LoggerStrategy {
    @Override
    public void showLog(String message) {
        System.out.println("console log message: "+message);
    }
}
