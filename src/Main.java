public class Main {
    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        QuickSort ob2 = new QuickSort();
        CountingSort ob3 = new CountingSort();
        SelectionSort ob4 = new SelectionSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int arr2[] = {10, 7, 8, 9, 1, 5};
        int arr3[] = {4, 2, 2, 8, 3, 3, 1};
        int arr4[] = {29, 10, 14, 37, 14};

        ob.bubbleSort(arr);
        ob2.sort(arr2, 0, arr2.length - 1);
        ob3.sort(arr3);
        ob4.sort(arr4);

        System.out.println("Bubble sort");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

        System.out.println("Quick Sort");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println("Counting Sort");
        for (int i = 0; i < arr3.length; ++i)
            System.out.print(arr3[i] + " ");
        System.out.println();

        System.out.println("Selection Sort");
        for (int i = 0; i < arr4.length; ++i)
            System.out.print(arr4[i] + " ");
        System.out.println();
    }
}
