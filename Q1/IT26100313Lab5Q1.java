import java.util.Scanner;

public class IT26100313Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int number3 = input.nextInt();

        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        System.out.println("Numbers you entered : " +number1 +" " +number2 +" " +number3);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        
    }
}