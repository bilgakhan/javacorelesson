public class MaxMinNums {
    public static void main(String[] args) {
        int[] arr = { 78, 50, 75, 200, 150 };
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // max num
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        // min number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min && min < max) {
                min = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
