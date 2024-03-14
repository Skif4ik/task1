public class Main7 {
    public static void main(String[] args) {
        int[] arr1 ={4, 5, 6, 7};
        int[] arr2 ={};
        int[] arr3 = null;

        try {
            System.out.println("arr1: " +arrayAvg(arr1));
        } catch (NullPointerException e) {
            System.out.println("arr1 null");
        } catch (ArithmeticException e) {
            System.out.println("arr1 empty");
        }
        try {
            System.out.println("arr2: " +arrayAvg(arr2));
        } catch (NullPointerException e) {
            System.out.println("arr2 null");
        } catch (ArithmeticException e) {
            System.out.println("arr2 empty");
        }
        try {
            System.out.println("arr3: " +arrayAvg(arr3));
        } catch (NullPointerException e) {
            System.out.println("arr3 null");
        } catch (ArithmeticException e) {
            System.out.println("arr3 empty");
        }
    }

    public static int arrayAvg(int[] arr) throws NullPointerException, ArithmeticException {
        int avg = 0;
            avg = 0;
            for (int elem : arr) {
                avg += elem;
            }
            avg /= arr.length;

        return avg;
    }

}
