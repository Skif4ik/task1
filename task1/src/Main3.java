import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int x1 = 10, x2 = 0, res = 0;
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Введите число");
            x2 = scanner.nextInt();
            res = x1 / x2;

            //в catch в первую очередь отлавливаем исключения конкретных подклассов
            //в последнем catch пишем суперкласс исключения
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
        } catch (ArithmeticException e) {
            System.out.println("деление на 0");
        }catch (Exception e){
            System.out.println("произошла иная непредведенная ошибка");
            System.out.println(e);
        }
        System.out.println("res = " + res);
    }
}
