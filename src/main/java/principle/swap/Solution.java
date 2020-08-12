package principle.swap;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();

        // primitive type
        int x = 0;
        int y = 1;
        System.out.println("x : " + x + " y : " + y);
        s.primitiveSwap(x, y);
        System.out.println("x : " + x + " y : " + y);

        // reference type
        int[] numbers = new int[]{0, 1};
        System.out.println("numbers[0] : " + numbers[0] + " numbers[1] : " + numbers[1]);
        s.referenceSwap(numbers, 0, 1);
        System.out.println("numbers[0] : " + numbers[0] + " numbers[1] : " + numbers[1]);
    }

    private void primitiveSwap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    private void referenceSwap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
