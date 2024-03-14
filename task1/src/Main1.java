import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int x1 = 10, x2 = 0, res = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        x2 = scanner.nextInt();

        try {
            //блок try будет выполнятся до первой возникшей исключительной ситуации
            res = x1 / x2;
        } catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
            System.out.println("------------------------");
            //toString() дает информацию о имени класса и пути к нему + сообщение
            System.out.println(exception);
            System.out.println("------------------------");
            //printStackTrace выводит информацию при помощи System.err.println
            //выводит информацию о классе исключения + сообщения + детализация
            //какая цепочка методов и в каких строках привела к исключению
            exception.printStackTrace();
            System.out.println("никто не запрещает писать свои сообщения о возникшей ситуации ");
            // а твкже писать какой либо код
            x2 = 1; //в случае ввода 0 переприсвоим на 1

        }
    }
}
