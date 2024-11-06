package strategy;

public class StrategyImpl2 implements Strategy {
    @Override
    public void apply() {
        System.out.println("========================");
        System.out.println("Second strategy");
        System.out.println("========================");
    }
}
