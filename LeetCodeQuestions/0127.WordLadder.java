class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList();
        Set<String> wordSet = new HashSet<String>(wordList);
        
        char[] alpha = new char[26];
        for(int i = 0; i < 26; i++){
            alpha[i] = (char)(97 + i);
        }
        
        int step = 1;
        queue.offer(beginWord);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            for(int i = 0; i < size; i++) {
                String curr = queue.poll();
                
                if (curr.equals(endWord)) return step;
                
                char[] currArray = curr.toCharArray();
                
                for(int j = 0; j < curr.length(); j++) {
                    char old = currArray[j];
                    for (char c : alpha) {
                        currArray[j] = c;
                        String next = new String(currArray);
                        if(wordSet.contains(next)) {
                            queue.offer(next);
                            wordSet.remove(next);
                        }
                    }
                    currArray[j] = old;
                }
            }
            step++;
        }
        return 0;
    }
}