package month02.week03.day05.backend;

public class ArrayTransformer {
    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    static int[] reverse(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length - 1 - i];
        }
        return newArray;
    }

    static int[] filterEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count = count + 1;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArray[index++] = arr[i];
            }
        }
        return newArray;
    }

    static int[] multyplyBy(int[] arr, int factor) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= factor;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 7, 2, 9, 5 };
        printArray(arr1);
        printArray(reverse(arr1));
        printArray(filterEven(arr1));
        printArray(multyplyBy(arr1, 3));
        printArray(arr1); // call by reference
    }
}
