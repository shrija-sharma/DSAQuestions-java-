package JavaQuestions.HashMapQues;

import java.util.HashMap;

public class TwoSum {
    public static int[] twosum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans={-1};
        for(int i=0;i<arr.length;i++){
            int partner=target-arr[i];
            if(map.containsKey(partner)){
                ans=new int[]{i,map.get(partner)};
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,5,7,-1};
        int target=12;
        int[] res=twosum(arr,target);
        System.out.println(res[0]+" "+res[1]);
    }
}
