import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int status = 1;
        while (status == 1) {
            System.out.println(
                    "Press:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. Increment\n7. Decrement");
            int choice = scan.nextInt(), temp = 0, num1, num2;
            switch (choice) {
                case 1: // Addition
                    System.out.print("Enter number of elements: ");
                    int limit = scan.nextInt();
                    System.out.println("Enter " + limit + " numbers:");
                    temp = 0;
                    for (int i = 0; i < limit; i++) {
                        int num = scan.nextInt();
                        temp += num;
                    }
                    System.out.println("Addition: " + temp);
                    break;
                case 2: // Subtraction
                    System.out.print("Enter number of elements: ");
                    limit = scan.nextInt();
                    System.out.println("Enter " + limit + " numbers:");
                    temp = scan.nextInt();
                    for (int i = 1; i < limit; i++) {
                        int num = scan.nextInt();
                        temp -= num;
                    }
                    System.out.println("Subtraction: " + temp);
                    break;
                case 3: // Multiplication
                    System.out.print("Enter number of elements: ");
                    limit = scan.nextInt();
                    System.out.println("Enter " + limit + " numbers:");
                    temp = 1;
                    for (int i = 0; i < limit; i++) {
                        int num = scan.nextInt();
                        temp *= num;
                    }
                    System.out.println("Multiplication: " + temp);
                    break;
                case 4: // Division
                    System.out.println("Enter two numbers:");
                    num1 = scan.nextInt();
                    num2 = scan.nextInt();
                    System.out.println("Division: " + (num1 / num2));
                    break;
                case 5: // Modulus
                    System.out.println("Enter two numbers:");
                    num1 = scan.nextInt();
                    num2 = scan.nextInt();
                    System.out.println("Modulus: " + (num1 % num2));
                    break;
                case 6: // Increment
                    System.out.println("Enter a number:");
                    temp = scan.nextInt();
                    System.out.println("Pre-increment: " + (++temp));
                    System.out.println("Post-increment: " + (temp++));
                    System.out.println("After post-increment: " + temp);
                    break;
                case 7: // Decrement
                    System.out.println("Enter a number:");
                    temp = scan.nextInt();
                    System.out.println("Pre-decrement: " + (--temp));
                    System.out.println("Post-decrement: " + (temp--));
                    System.out.println("After post-decrement: " + temp);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.print("Do you want to continue? Press 1 for Yes: ");
            status = scan.nextInt();
        }
        scan.close();
    }
}