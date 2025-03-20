
public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        int data[] = { 5, 12, 3, 15, 7 };

        // System.out.println(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        bubbleSort(data);
        System.out.println("\n");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
    }
}
