public class AllOccurance {
    public static void allOcuurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        allOcuurance(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 7, 2, 6, 2, 2, 2, 5 };
        allOcuurance(arr, 0, 2);
    }
}
