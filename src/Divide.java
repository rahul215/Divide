import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        int num1,num2,divide;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextInt();

        System.out.println("Enter second number");
        num2 = sc.nextInt();

        divide = num1 / num2;
        System.out.println(divide);
    }
}
