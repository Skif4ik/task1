import model.B;

public class Main2 {
    //throws CloneNotSupportedException
    //мы отказываемся от обработки этого исключения в текушем методе
    //и передаем обработку другим разработчикам
    //пробрасывание исключений из метода мейн является очень плохим тоном
    public static void main(String[] args) throws CloneNotSupportedException {
        B b1 = new B();
        B b2 = (B) b1.clone();
    }
}
