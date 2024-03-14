import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main3 {
    public static void main(String[] args) {

        try {//внутр конструкции try описываем код, который потонцеально может привести к выбросу исключения
            FileReader fr1 = new FileReader("1.txt");
            //FileNotFoundException e = new FileNotFoundException()
            //при возникновении первой же исключительной ситуации выполнение блока try будет прекращено
            //и начнется выполнения блока catch в котором мы можем описать действия случая
            // возникновения исключительной ситуации
            //по ссылке e будем иметь доступ к обьекту исключения

        } catch (FileNotFoundException e) {
            System.out.println("Нет такого файла");
        }


    }
}
