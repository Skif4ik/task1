public class Main6 {
    public static void main(String[] args) {

        int[] arr1 ={4, 5, 6, 7};
        int[] arr2 ={};
        int[] arr3 = null;

        System.out.println("arr1: " +arrayAvg(arr1));
        System.out.println("arr2: " +arrayAvg(arr2));
        System.out.println("arr3: " +arrayAvg(arr3));
    }

    //пример обработки исключений внутри метода
    //не всегда удобно если метод возвращает какое либо значение или результат
    public static int arrayAvg(int[] arr) {
        int avg = 0;
        try {
            avg = 0;
            for (int elem : arr) {
                avg += elem;
            }
            avg /= arr.length;
        } catch (NullPointerException  e) {
            System.out.println("Массив null");
        }catch (ArithmeticException e){
            System.out.println("Деление на 0");
        }

        return avg;
    }
}
