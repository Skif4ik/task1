//исключительные ситуации

import model.A;
import model.B;

import java.util.Locale;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
//        int x1 = 5, x2 = 0;
//        int res = x1 / x2; //throw new ArithmeticException
//        //деление на 0

//                int[] arr1 = new int[-5]; //trow new NegativeArraySizeException
//        попытка выделить отрицательное количество памяти

//        Object[] arr2 = new String[10];
//        arr2[0] = new Character('+'); //trow new ArrayStoreException
        //неверное содержимое массива

//        int[] arr3 = new int[5];
//        arr3[5] = 100; //trow new ArrayIndexOutOfBoundsException
//        //попытка использовать несуществующий индекс (выход за пределы массива)

//        String str1 = "Igor";
//        System.out.println(str1.charAt(8));//trow new StringIndexOutOfBoundsException
//        //выход за пределы строки

//        String str2 = null;
//        str2.toUpperCase();//trow new NullPointerException
//        //попытка вызвать метод или обьратиться к обьекту по ссылке, которая не указывает на обьект

//        B b1 = (B) new A(); //downcast без проверки
        ////trow new ClassCastException

//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Введите число");
//        int y1 = scanner1.nextInt();
//        // trow new InputMismatchException при вводе в консоли строки вместо ожидаемого int

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите число");
        String str3 = scanner2.nextLine();
        int y2 = Integer.parseInt(str3); // trow new NumberFormatException
        //ошибка преобразованиея String в int


   }
}
