public class Multiply {

    public static long mul(int[] arr, int idx) {
        if(idx == arr.length - 1) return arr[idx];
        return arr[idx] * mul(arr, idx + 1);
    }
}
