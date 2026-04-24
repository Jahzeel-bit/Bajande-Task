package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfParameters {
    private final List<Integer> numbers;

    // Constructor
    public SumOfParameters(List<Integer> numbers) {
        this.numbers = numbers;
    }
    // Method for adding for each number and to print result
    public void printResults() {
        for (int num : numbers) {
            int sum = 0;
            StringBuilder series = new StringBuilder();
            for (int j = 1; j <= num; j++) {
                series.append(j);
                sum += j;
                if (j < num) {
                    series.append("+");
                }
            }
            System.out.println(num + " = " + series + " = " + sum);
        }
    }
    public void printTotal() {
        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        System.out.println("Total of inputs = " + total);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        System.out.println("Enter numbers (stop with non-integer):");
        while (sc.hasNextInt()) {
            input.add(sc.nextInt());
        }

        SumOfParameters so = new SumOfParameters(input);
        so.printResults();
        so.printTotal();

        sc.close();
    }
}
