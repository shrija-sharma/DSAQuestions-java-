package JavaQuestions.HashMapQues;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramPairs {
    public static HashMap<Character,Integer> freq(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        return map;
    }
    //approach one
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer> map1=freq(s1);
        HashMap<Character,Integer> map2=freq(s2);
        return map1.equals(map2);
    }
    //approach two
    //here we reduce the space somplexity

    public static boolean isAnagram1(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer> mp=freq(s1);
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(!mp.containsKey(ch)) return false;
            int currfreq=mp.get(ch);
            mp.put(ch,currfreq-1);
        }
        for(int i:mp.values()){
            if(i!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        boolean result=isAnagram(s1,s2);
        // boolean result=isAnagram1(s1,s2);
        if(result){
            System.out.println("Strings are anagram");
        }
        else{
            System.out.println("Strings are not anagram");
        }
    }
}
