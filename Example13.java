import java.util.Scanner;
class Example13 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter first number");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        a = inputValue.nextInt();

        System.out.println("Enter second number");
        inputValue = new Scanner(System.in);
        b = inputValue.nextInt();

        System.out.println("Enter third number");
        inputValue = new Scanner(System.in);
        c = inputValue.nextInt();


        if (a > b) {
            if (a > c) {
                System.out.println("The bigger is " + a);
            } else {
                System.out.println("The bigger is " + c);
            }
        } else if (b > c) {
            System.out.println("The bigger is " + b);
        } else {
            System.out.println("The bigger is " + c);
        }
    }
}