public class Main8 {
    public static void main(String[] args) {

        try {
            A();
        } catch (ArithmeticException e) {

            System.out.println("в методе Main");
        }
        System.out.println("Программа завершена успешно");
    }

    static void C() {
        try {
            int p = 0 / 0;
        } catch (ArithmeticException e) {
            System.out.println("в методе C");
            throw e; //пробрасываем дальше
        }
    }

    static void B() {
        try {
            C();
        } catch (ArithmeticException e) {
            System.out.println("в методе B");
            throw e;
        }
    }

    static void A() {
        try {
            B();
        } catch (ArithmeticException e) {
            System.out.println("в методе A");
            throw e;
        }
    }
}