package Tasks;
import java.util.Scanner;

interface Animal {
    void feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    private String name;
    private int age;

    public Gorilla(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println(name + " is eating.");
        } else {
            System.out.println(name + " is not hungry right now.");
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println(name + " is grooming.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("You try to pet " + name + " — careful!");
    }
}

public class Task16 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gorilla name: ");
        String gName = sc.nextLine();
        System.out.print("Enter gorilla age: ");
        int gAge = sc.nextInt();
        sc.nextLine(); // consume newline

        Gorilla g = new Gorilla(gName, gAge);

        String choice;
        do {
            System.out.println("\nChoose an action:");
            System.out.println("1. Put food in the cage");
            System.out.println("2. Lather, rinse, repeat");
            System.out.println("3. Pet the gorilla");
            System.out.print("Enter your choice (1-3): ");
            int action = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (action) {
                case 1:
                    g.feed(true);
                    break;
                case 2:
                    g.groom();
                    break;
                case 3:
                    g.pet();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            choice = sc.nextLine();

        } while (!choice.equalsIgnoreCase("n"));

        System.out.println("\nGoodbye! " + g.getName() + " waves at you!");
        sc.close();
    }
}
