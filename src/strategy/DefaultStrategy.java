package strategy;

public class DefaultStrategy implements Strategy {
    @Override
    public void apply() {
        System.out.println("***********************");
        System.out.println("Default strategy");
        System.out.println("***********************");
    }
}
