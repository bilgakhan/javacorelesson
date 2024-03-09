public class SecondMax {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 5, 7 };
        int max = findSecondLargest(nums);
        System.out.println("Ikkinchi eng katta element: " + max);
    }

    public static int findSecondLargest(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
}