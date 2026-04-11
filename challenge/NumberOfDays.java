package challenge;
import java.time.*;
import java.util.Scanner;

public class NumberOfDays {
    
    public void daysOfMonth(LocalDate m, int d3){
        LocalDate m1 = m.plusMonths(d3);
        int day = m1.lengthOfMonth();
    }
    void monthName(LocalDate name){
        
    }
    public static void main(String[] args) { 
        NumberOfDays dm = new NumberOfDays();    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Month: ");
        int d1 = scan.nextInt();

        LocalDate d = LocalDate.of(2026, 1, 1);      
        if (d1<=12){
            switch (d1) {
                case 1:
                    int numDays = d.lengthOfMonth();
                    System.out.println("January has "+numDays +"days");
                    break;
                case 2:
                    // LocalDate numMonth = d.plusMonths(1);
                    // String month = numMonth.getMonth().name();
                    // int day = numMonth.lengthOfMonth();
                    // System.out.println(month+" has "+day +" days");
                    break;
                case 3:
                    dm.daysOfMonth(d, 3);
                    int days = day.daysOfMonth();
                    System.out.println(month+" has "+ days +" days");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                default:
                    break;
            }
        }
        
        scan.close();
    }
}
