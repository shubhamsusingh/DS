import java.util.Arrays;

public class CountSort {
    public static void countsort(int arr[]){
        int max=Arrays.stream(arr).max().getAsInt();
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;;
                count[i]--;

            }
        }
    }
    public static void main(String[] args) {
        int data[]={2,7,5,2,1,4,1,2,5,4};
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+",");
        }
        countsort(data);
        System.out.println();
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+",");
        }
    }
}
