import java.util.*;
public class Monotonic{
    public boolean checkMonotonic(ArrayList<Integer> list){
        boolean increase=true;
        boolean decrease=true;

            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>list.get(i+1)){
                    increase=false;
                }
                if(list.get(i)<list.get(i+1)){
                    decrease=false;
                }
            }
       return increase||decrease;
        
    }
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        Monotonic m=new Monotonic();
        list.add(1);
        list.add(3);
        list.add(2);
        //list.add(3);
        System.out.println(list);
        boolean check=m.checkMonotonic(list);
        System.out.println("is list is Monotonic"+" "+check);


    }
}