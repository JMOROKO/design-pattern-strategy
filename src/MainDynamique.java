import context.Context;
import strategy.Strategy;

import java.util.Scanner;

public class MainDynamique {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Context context = new Context();

        while(true){
            System.out.println("Quelle strategy ?");
            String strategyClassName = sc.nextLine(); //strategy.StrategyImpl1
            Strategy strategy = (Strategy) Class.forName(strategyClassName).getConstructor().newInstance();
            context.setStrategy(strategy);
            context.applyStrategy();
        }
    }
}
