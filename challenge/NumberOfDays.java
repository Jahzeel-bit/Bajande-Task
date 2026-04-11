package challenge;
import java.time.*;
import java.util.Scanner;

public class NumberOfDays {
    int day;
    String month;
    NumberOfDays(LocalDate m, int n){
        LocalDate numMonth = m.plusMonths(n);
        day = numMonth.lengthOfMonth();
        month = numMonth.getMonth().name();
        
    }
    void result(){
        System.out.println(month+" has "+day +" days");
    }
    public static void main(String[] args) { 
           
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Month: ");
        int d1 = scan.nextInt();
        
        LocalDate d = LocalDate.of(2026, 1, 1);
        NumberOfDays dm = new NumberOfDays(d, d1-1);       
        if (d1<=12){
            switch (d1) {
                case 1:
                    dm.result();
                    // int numDays = d.lengthOfMonth();
                    // System.out.println("January has "+numDays +"days");
                    break;
                case 2:
                    dm.result();
                    // LocalDate numMonth = d.plusMonths(1);
                    // String month = numMonth.getMonth().name();
                    // int day = numMonth.lengthOfMonth();
                    // System.out.println(month+" has "+day +" days");
                    break;
                case 3:
                    dm.result();
                    
                    break;
                case 4:
                    dm.result();
                    break;
                case 5:
                    dm.result();
                    break;
                case 6:
                    dm.result();
                    break;
                case 7:
                    dm.result();
                    break;
                case 8:
                    dm.result();
                    break;
                case 9:
                    dm.result();
                    break;
                case 10:
                    dm.result();
                    break;
                case 11:
                    dm.result();
                    break;
                case 12:
                    dm.result();
                    break;
                default:
                    System.out.println(d1+" is invalid month");
                    break;
            }
        }
        else{
            System.out.println(d1+" is invalid number of month");
        }
        scan.close();
    }
}
