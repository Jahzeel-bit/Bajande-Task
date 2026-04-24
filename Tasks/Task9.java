package Tasks;

import java.util.Scanner;

public class Task9 {
    public static int add(int a, int b){
        return Math.addExact(a,b);
    }
    public static int subtract(int a, int b){
        return Math.subtractExact(a,b);
    }
    public static int multiply(int a, int b){
        return Math.multiplyExact(a,b);
    }
    public static int divide(int a, int b){
        return Math.floorDiv(a,b);
    }

    static void main() {
        System.out.println("Enter two number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = add(num1,num2);
        int sub = subtract(num1,num2);
        int mul = multiply(num1,num2);
        int div = divide(num1,num2);
        System.out.println(num1+" + "+num2+" = "+ sum);
        System.out.println(num1+" - "+num2+" = "+ sub);
        System.out.println(num1+" * "+num2+" = "+ mul);
        System.out.println(num1+" / "+num2+" = "+ div);
    }
}
