package JavaQuestions.HashMapQues;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {
    public static boolean areIsomorphic(String s1,String s2) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            Character s1ch = s1.charAt(i);
            Character s2ch = s2.charAt(i);

            if(map.containsKey(s1ch)){
                if(map.get(s1ch)!=s2ch) return false;
            }
            else if(map.containsValue(s2ch)) {
                return false;
            }
            else{
                map.put(s1ch,s2ch);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();

        boolean result=areIsomorphic(s1,s2);
        if(result){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
