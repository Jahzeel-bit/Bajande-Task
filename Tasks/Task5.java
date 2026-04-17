package Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter Three Number: ");
       List <Integer> en = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            int input = sc.nextInt();
            en.add(input);
        }  
        int l = Collections.max(en);
        System.out.println("The Largest number is: "+l);
    }
}
