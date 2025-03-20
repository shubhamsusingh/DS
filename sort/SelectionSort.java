public class SelectionSort {
    public static void selectionshort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int data[] = { 5, 3, 17, 22, 2 };
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        selectionshort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }

    }
}
