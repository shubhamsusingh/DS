import java.util.*;
public class SwapIndex{
	public void swap(ArrayList<Integer> list,int indx1,int index2){
		int temp=list.get(indx1);
		list.set(indx1,list.get(index2));
		list.set(index2,temp);
	}
	public void reverse(ArrayList<Integer> list){
		int size=list.size();
		System.out.println(size);
		// first method
		// Collections.reverse(list);
		int i=0;
		int j=size-1;
		while(i<j){
			int temp=list.get(i);
			list.set(i,list.get(j));
			list.set(j,temp);
			i++;j--;
		}
		return;
	}
	public int findMax(ArrayList<Integer> list){
		int max = Integer.MIN_VALUE;
		for (int i=0;i<list.size() ;i++ ) {
			max=Math.max(max,list.get(i));
		}
		return max;
	}
	public void pair(ArrayList<Integer> list){
		for (int i=0;i<list.size()-1 ;i++ ) {
			for (int j=i+1;j<list.size() ;j++ ) {
				System.out.println(list.get(i)+","+list.get(j));
				
			}
			System.out.println('\n');
			
		}
	}
	public boolean pairSum(ArrayList<Integer>list,int target){
		boolean flag=false;
		for (int i=0;i<list.size()-1 ;i++ ) {
			for (int j=i+1;j<list.size() ;j++ ) {
				if (i+j==target) {
					flag=true;
					break;
				}
			}
		}
		return flag;
	}
	public boolean pairSum1(ArrayList<Integer> list,int target){
		boolean flag=false;
		int i=0;
		int j=list.size()-1;
		while(i<j){
				int sum=list.get(i)+list.get(j);
				if(sum==target){
					flag=true;
					break;
				}else if(sum<target){
					i++;
				}else{
					j--;
				}
			}
		return flag;
	}
	public static void main(String[] args) {
		ArrayList <Integer> list=new ArrayList<>();
		SwapIndex s= new SwapIndex();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		 System.out.println(list);
		// s.swap(list,2,3);
		// System.out.println(list);
		// s.swap(list,3,2);
		// System.out.println(list);
		// s.reverse(list);
		// System.out.println(list);
		// int max=s.findMax(list);
		// System.out.println(max);
		// s.pair(list);
		// boolean isPair=s.pairSum(list,11);
		// System.out.println(isPair);
		boolean isPair=s.pairSum1(list,9);
		System.out.println(isPair);
		
	}
}