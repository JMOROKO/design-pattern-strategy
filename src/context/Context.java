package context;

import strategy.DefaultStrategy;
import strategy.Strategy;

public class Context {
    private Strategy strategy = new DefaultStrategy();
    public void applyStrategy(){
        System.out.println("************** Start strategy ****************");
        strategy.apply();
        System.out.println("************** End strategy ******************");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
