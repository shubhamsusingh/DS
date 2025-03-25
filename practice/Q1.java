
// Find the Missing Number (Array):

// Question: Given an array of size 
// 𝑁
// N containing elements from 1 to 
// 𝑁
// +
// 1
// N+1 with one element missing, find the missing element.

// Example: Input: [1, 2, 4, 5, 6], Output: 3.
public class Q1 {
    public static int findMissing(int arr[]){
       int n=arr.length+1;
       int sum=n*(n+1)/2;
       int arrSum=0;
        for(int num:arr){
            arrSum+=num;
        }
        int data=sum-arrSum;
        return data;
    }
    public static void moveZeroes(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int data[]={1, 2, 4, 5, 6};
        System.out.println(data.length);
        int missingNumber=findMissing(data);
        System.out.println(missingNumber);
        int data1[]={0,1,2,0,5};
        moveZeroes(data1);
        for(int num:data1){
            System.out.println(num);
        }
    }
}
