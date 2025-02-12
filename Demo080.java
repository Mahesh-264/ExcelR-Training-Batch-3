public class Demo080 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(array);
        int firstElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstElement;

        System.out.println("Array after shifting:");
        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}