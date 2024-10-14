package JavaQuestions.HashMapQues;

import java.util.HashMap;

public class Maxfreqofelement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1,4,1};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int el : arr) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        System.out.println(freq.entrySet());
        int maxfreq = 0, anskey = 0;
        for (var e : freq.entrySet()) {
            if (anskey < e.getValue()) {
                maxfreq = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.println(anskey);
        System.out.printf("Maximum frequency of %d is %d", anskey, maxfreq);
    }
}
