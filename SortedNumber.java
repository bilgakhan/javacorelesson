public class SortedNumber {
    public static void main(String[] args) {
        int[] nums = { 10, 8, 5, 3, 2 };
        boolean sorted = isSorted(nums);
        if (sorted) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}