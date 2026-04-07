package Tasks;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.next();
        String bward = new StringBuilder(input).reverse().toString();
        String word = input.toLowerCase();   

        if (word.equals(bward.toLowerCase())){
            System.out.println("The "+input+" is Palindrome");
        }
        else{
            System.out.println("The "+input+" is not Palindrome");
        }
        sc.close();
    }
}
