package JavaQuestions.HashMapQues;

import java.util.HashMap;
import java.util.Scanner;

public class Majorityelement {
    public static int findMajority(int[] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        int majno=n/2;
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i] )+ 1);
            }
        }
        for(var e:map.entrySet()) {
            if (e.getValue() > majno) {
                return e.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        int result=findMajority(arr,n);
        System.out.println(result);
    }
}
