public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int data[]={12,15,7,10,22};
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+",");
        }
        insertionSort(data);
        System.out.println();
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+",");
        }
    }
}
