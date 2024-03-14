import java.util.Locale;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int size = -1, x1 = 10, x2 = -1, index = 0, res1 = 0, res2 = 0;
        String tmpStr, resStr = "";
        int[] arr = null;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите размерность массива");
            tmpStr = scanner.nextLine();

            try {
                size = Integer.parseInt(tmpStr);
            } catch (NullPointerException e) {
                System.out.println("Ввели что то не так");
            }
        } while (size == -1);

        arr = new int[size];

        do {
            System.out.println("Введите значение x2");
            tmpStr = scanner.nextLine();

            try {
                x2 = Integer.parseInt(tmpStr);
            } catch (NullPointerException e) {
                System.out.println("Ввели что то не так");
            }
        } while (x2 == -1);

        try {
            res1 = x1 / x2;
        }catch (ArithmeticException e) {
            System.out.println("Деление на 0!");
        }
        System.out.println("Введите индекс массива");
        index = scanner.nextInt();

        try {
            arr[index] = res1;
            res2 = arr[index] * 2;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ввели некорректный индекс массива");
        }



        if (res2 != 0) {
            resStr = "Ненулевое значение";
        }
        System.out.println(resStr.toUpperCase(Locale.ROOT));

        try {
            System.out.println(resStr.charAt(35));
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы строки");
        }
    }
}
