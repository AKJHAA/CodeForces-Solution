import java.util.Scanner;

public class CF_218_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the recipe string
        String recipe = scanner.nextLine();

        // Counting the number of B, S, C in the recipe
        int countB = 0, countS = 0, countC = 0;
        for (char ingredient : recipe.toCharArray()) {
            if (ingredient == 'B') countB++;
            else if (ingredient == 'S') countS++;
            else if (ingredient == 'C') countC++;
        }

        // Reading the available ingredients
        int nb = scanner.nextInt(); // Bread
        int ns = scanner.nextInt(); // Sausage
        int nc = scanner.nextInt(); // Cheese

        // Reading the prices of ingredients
        int pb = scanner.nextInt(); // Price of bread
        int ps = scanner.nextInt(); // Price of sausage
        int pc = scanner.nextInt(); // Price of cheese

        // Reading the rubles available
        long r = scanner.nextLong();

        // Binary search to find the maximum number of hamburgers
        long low = 0;
        long high = (long) 1e13; // Start with a high number to find the maximum

        while (low < high) {
            long mid = (low + high + 1) / 2;

            long neededB = Math.max(0, mid * countB - nb);
            long neededS = Math.max(0, mid * countS - ns);
            long neededC = Math.max(0, mid * countC - nc);

            long cost = neededB * pb + neededS * ps + neededC * pc;

            if (cost <= r) {
                low = mid; // Try to make more hamburgers
            } else {
                high = mid - 1; // Reduce the number of hamburgers
            }
        }

        // Output the maximum number of hamburgers
        System.out.println(low);
    }
}
