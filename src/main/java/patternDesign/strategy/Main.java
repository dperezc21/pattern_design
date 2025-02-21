package patternDesign.strategy;

import patternDesign.strategy.logger.ConsoleLogStrategy;
import patternDesign.strategy.logger.LoggerStrategy;
import patternDesign.strategy.logger.WindowLogStrategy;

public class Main {
    public static void main(String[] args) {
        LoggerStrategy loggerStrategy = new WindowLogStrategy();
        loggerStrategy.showLog("hola");
    }
}
