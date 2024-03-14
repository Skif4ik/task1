import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int x1 = 10, x2 = 0, res = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        x2 = scanner.nextInt();

        try {
            res = x1 / x2;
            //можно отлавливать исключения можно через переменную суперкласса
            //однако рекомендуется отлавливать в небольших блоках кода
            // конкретные исключения, которые скорее всего могут тут возникнуть
        } catch (Exception e) {//может отловить все исключения подклассов
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
