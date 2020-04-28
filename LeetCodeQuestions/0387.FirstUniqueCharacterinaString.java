class Solution {
    public int firstUniqChar(String s) {
        char[] charArr = s.toCharArray();
        
        int[] arr = new int[256];
        
        for (int i = 0; i < charArr.length; i++) {
            arr[charArr[i]] += 1;
        }
        
        for (int i = 0; i < charArr.length; i++) {
            if (arr[charArr[i]] == 1) {
                return i;
            }
            
        }
        return -1;
    }
}