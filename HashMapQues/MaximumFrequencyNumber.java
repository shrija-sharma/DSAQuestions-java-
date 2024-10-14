package JavaQuestions.HashMapQues;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MaximumFrequencyNumber {
    public static int maxFrequencyNumber(int[] arr,int n){
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int maxfreq=0;
        int maxans=-1;
        for(var e:map.entrySet()){
            if(e.getValue()>maxfreq){
                maxfreq=e.getValue();
                maxans=e.getKey();
            }
        }
        return maxans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int result=maxFrequencyNumber(arr,n);
        System.out.println(result);
    }
}
