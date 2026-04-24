package Tasks;

import java.util.Scanner;

public class Operator {
    private final int num1;
    private final int num2;
    public Operator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add(){
        return num1+num2;
    }
    private int sub() {
        return num1 - num2;
    }
    private int multiply() {
        return num1*num2;
    }
    private double div() {
        return (double) num1/num2;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Operator arithmetic = new Operator(num1,num2);
        System.out.println("Addition: "+num1+" + "+num2+" = "+arithmetic.add());
        System.out.println("Subtraction: "+num1+" - "+num2+" = "+arithmetic.sub());
        System.out.println("Multiplication: "+num1+" x "+num2+" = "+arithmetic.multiply());
        double result = arithmetic.div();
        String prod = String.format("%.2f", arithmetic.div());
        if(result == (int)result){
            System.out.println("Division: "+num1+" / "+num2+" = "+(int)result);
        }else {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + prod);
            sc.close();
        }
    }
}
