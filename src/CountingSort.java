public class CountingSort {
    void sort(int arr[]) {
        int n = arr.length;

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int count[] = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }


        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        int output[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}