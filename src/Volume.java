import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.1415;

        System.out.println("Input r:");
        float r = input.nextFloat();

        System.out.println("Input h:");
        float h = input.nextFloat();

        double V = PI * r * r * h;

        double S = 2 * PI * r * (r + h);
        System.out.println(V);
        System.out.println(S);

//        System.out.println("Введите дробное число: ");
//        float b = input.nextFloat();
//
//
//        System.out.println("Введите строку с пробелами: ");
//        String c = input.next();
//
//        input = new Scanner(System.in);
//
//        System.out.println("Введите строку: ");
//        String d = input.nextLine();
//
//        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);

    }
}
