package JavaQuestions.HashMapQues;
import java.util.*;
public class CountEvenOdd {
    public static int[] countevenodd(int[] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int oddcount=0;
        int evencount=0;
        for(int val:map.values()){
            if(val%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        return new int[]{oddcount,evencount};
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int[] res=countevenodd(arr,n);
        System.out.println(res[0]+" "+res[1]);
    }
}
