package JavaQuestions.HashMapQues;

import java.util.HashMap;
import java.util.Scanner;

public class MaxFreq_Element {
    public static int maxElement(int n,int k,int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int el:arr){
            if(!map.containsKey(el)){
                map.put(el,1);
            }
            else{
                map.put(el,map.get(el)+1);
            }
        }
        int maxfreq=0;
        int maxans=-1;
        for(var e:map.entrySet()){
            if(e.getValue()>maxfreq){
                maxfreq=e.getValue();
                maxans=e.getKey();
            }
            else if(maxfreq==e.getValue()){
                maxans=Math.max(e.getKey(),maxans);
            }
        }
        return maxans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int result=maxElement(n,k,arr);
        System.out.println(result);
    }
}
