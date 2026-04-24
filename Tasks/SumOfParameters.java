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
    // Method to compute cumulative sum for a single number
    public int cumulativeSum(int n) {
        int sum= 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    // Method for adding for each number and to print result for each parameter
    public void printResults() {
        for (int num : numbers) {
            int sum =cumulativeSum(num);
            StringBuilder series = new StringBuilder();
            for (int j = 1; j <= num; j++) {
                series.append(j);
                if (j < num) {
                    series.append("+");
                }
            }
            System.out.println(num + " = " + series + " = " + sum);
        }
    }
    //Method to compute the sum of all input numbers
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
        System.out.println("Enter numbers (Enter non-integer to Stop):");
        while (sc.hasNextInt()) {
            input.add(sc.nextInt());
        }
        SumOfParameters so = new SumOfParameters(input);
        so.printResults();
        so.printTotal();
        sc.close();
    }
}
