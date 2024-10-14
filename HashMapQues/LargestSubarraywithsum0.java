package JavaQuestions.HashMapQues;

import java.util.HashMap;

public class LargestSubarraywithsum0 {
    public static int maxlength(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefxsum=0;
        int maxlength=0;
        for(int i=0;i<arr.length;i++){
            prefxsum+=arr[i];
            if(map.containsKey(prefxsum)){
                maxlength=Math.max(maxlength,i-map.get(prefxsum));
            }else{
                map.put(prefxsum,i);
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10,23};
        int result=maxlength(arr);
        System.out.println(result);
    }
}
