import java.util.Scanner;
public class Part5 {
    public static void main(String[] args) {
        Scanner KeyBoard = new Scanner(System.in);
        int num1 = KeyBoard.nextInt();
        int num2 = KeyBoard.nextInt();
        double result1 = calculateSum(num1, num2);
        System.out.println("Sum: " + result1);

        String hello = "Hello World";
        int textLength = calculateStringLength(hello);
        System.out.println("Text length " + textLength);

        double radius = KeyBoard.nextDouble();
        double area = calculateCircleArea(radius);
        System.out.println("Circle area " + area);
    }


    public static int calculateSum(int a, int b) {

        return a + b;
    }


    public static int calculateStringLength(String str) {

        return str.length();
    }


    public static double calculateCircleArea(double radius) {

        return Math.PI * radius * radius;
    }
    }

