package counter;

import java.util.Scanner;

/**
 * Tester for Observer of counter.
 *
 * @author Pakanon Pantisawat
 */
public class ObserverTest {
    public static void main(String[] args) {
        final Scanner console = new Scanner(System.in);
        Counter counter = new Counter();
        ConsoleView consoleView = new ConsoleView(counter);
        counter.addObserver(consoleView);

//        CounterView counterView = new CounterView(counter);
//        counterView.run();

        while (true) {
            System.out.print("Count how many? ");
            int howMany = console.nextInt();
            if (howMany == 0) return;
            counter.add(howMany);
        }
    }
}
