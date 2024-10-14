package JavaQuestions.HashMapQues;

import java.util.HashMap;
import java.util.Scanner;

public class Frequencyofeachcharacter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s="Hello World";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            //   ch=Character.toLowerCase(ch);
            //if you want to skip the space
//            if(ch==' '){
//                continue;
//            }
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for(var e:map.entrySet()){
            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
}
