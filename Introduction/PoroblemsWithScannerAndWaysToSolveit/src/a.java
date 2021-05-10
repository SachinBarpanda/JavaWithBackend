import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = false , notCorrectAge = true;
        int a = 0;
        while (!hasNextInt || notCorrectAge) {
            hasNextInt = scanner.hasNextInt();
            if(!hasNextInt){
                System.out.println("Please enter a valid integer");
                scanner = new Scanner(System.in);
            }else
            a = scanner.nextInt();
            if (a < 0 || a > 100) {
                notCorrectAge = true;
                System.out.println("Please enter the age between 1 to 100 ");
            } else {
                notCorrectAge = false;
            }

        }
        scanner.nextLine();
        System.out.println("Please enter your name");


        String s = scanner.nextLine();
        System.out.println("Thanks for registering "+ s +" Your age is " + a);
    }
}


