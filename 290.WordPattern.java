import java.util.HashMap;
import java.util.Map;

class Solution {
    /*
    time complexity: O(n)
    space complexity: O(n)
    */
    public boolean wordPattern(String pattern, String str) {
        /*
        create an hashmap and iterate throught both pattern and str 
        as well as store their element and indexs together
        we compare the their previous value if they are not equal we return false
        */
        String[] words = str.split(" ");

        if (words.length != pattern.length()) return false;

        Map hm = new HashMap();

        for (Integer i = 0; i < pattern.length(); i++) {
            if (hm.put(pattern.charAt(i), i) != hm.put(words[i], i)) return false;
        }

        return true;
    } 
}