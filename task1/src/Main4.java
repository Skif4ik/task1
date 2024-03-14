import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int x1 = 10, x2 = 0, res = 0;
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Введите число");
            x2 = scanner.nextInt();
            res = x1 / x2;

           //отловит одну или другую ошибку
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e);
            System.out.println("Выввели не число или деление на ноль");
        }

        System.out.println("res = " + res);
    }

}
