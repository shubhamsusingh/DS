public class QuickSort {
    public static void quicksort(int arr[],int si,int ei){
        if (si>=ei) {
            return;
        }
        int piot=partisan(arr,si,ei);
        quicksort(arr, si, piot-1);
        quicksort(arr, piot+1, ei);
    }
    public static int partisan(int arr[],int si,int ei){
        int pivot=arr[ei];
        int j=si-1;
        for (int i=si;i<ei;i++){
            if (arr[i]<=pivot) {
                j++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
                j++;
                int temp=pivot;
                arr[ei]=arr[j];
                arr[j]=temp;
        return j;
    }
    public static void main(String[] args) {
        int arr[]={12,0,56,12,2,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        quicksort(arr, 0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
