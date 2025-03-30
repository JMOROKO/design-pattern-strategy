import context.Context;
import strategy.StrategyImpl1;
import strategy.StrategyImpl2;

public class Main {
    public static void main(String[] args) {
        // utilisation du contexte
        Context context = new Context();
        // utilisation de la strategie par defaut
        context.applyStrategy();

        // détermination de la strategie à utiliser
        context.setStrategy(new StrategyImpl1());
        context.applyStrategy();
        // détermination de la strategie à utiliser
        context.setStrategy(new StrategyImpl2());
        context.applyStrategy();
    }
}