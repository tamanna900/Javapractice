import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Initialize and assign values to the array
        int[] arr = new int[10];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        // Print elements of the array
        System.out.println("Element at index 0 = " + arr[0]);
        System.out.println("Element at index 1 = " + arr[1]);
        System.out.println("Element at index 2 = " + arr[2]); // Default value: 0

        // Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Reverse an array
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Print reversed array
        System.out.println("Reversed array: " + Arrays.toString(numbers)); // Output: [5, 4, 3, 2, 1]
    }
}
