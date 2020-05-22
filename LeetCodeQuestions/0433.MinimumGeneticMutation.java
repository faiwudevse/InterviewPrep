/*
dfs
*/
class Solution {
    int minStepCount = Integer.MAX_VALUE;

    public int minMutation(String start, String end, String[] bank) {
        dfs(new HashSet<String>(), 0, start, end, bank);
    }

    private void dfs (HashSet<String> step, int stepCount, String current, String end, String[] bank) {
        if (current.equals(end)) minStepCount = Math.min(stepCount, minStepCount);

        for(String str: bank) {
            int diff = 0;
            for (int i = 0; i < str.length(); i++) {
                if (current.charAt(i) != str.charAt(i)) {
                    if(++diff > 1) break;
                }
            }

            if (diff == 1 && ! step.contain(str)) {
                step.add(str);
                dfs(step, stepCount + 1, str, end, bank);
                step.remove(str);
            }
        }
    }
}
/*
bfs
*/
class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Queue<String> q = new LinkedList();
        Set<String> visited = new HashSet();
        Set<String> bankSet = new HashSet<String>(Arrays.asList(bank));
        for(String s: bank) bankSet.add(s);
        char[] charSet = new char[]{'A', 'C', 'G', 'T'};

        int step = 0;
        q.offer(start);
        visited.add(start);
        
        while(!q.isEmpty()) {
            int sz = q.size();
            
            for(int i = 0; i < sz; i++) {
                String curr = q.poll();
                
                if (curr.equals(end)) return step;
                
                char[] currArray = curr.toCharArray();

                for (int j = 0; j < currArray.length; j++) {
                    char old = currArray[j];
                    for (char c : charSet) {
                        currArray[j] = c;
                        String next = new String(currArray);
                        if(!visited.contains(next) && bankSet.contains(next)) {
                            visited.add(next);
                            q.offer(next);
                        }
                    }
                    currArray[j] = old;
                }
            }
            step++;
        }

        return -1;
    }
}

/*
bfs
*/
class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Queue<String> q = new LinkedList();
        HashSet<String> bankSet = new HashSet();
        for(String s: bank) bankSet.add(s);
        char[] charSet = new char[]{'A', 'C', 'G', 'T'};

        int step = 0;
        q.offer(start);
        
        while(!q.isEmpty()) {
            int sz = q.size();
            
            for(int i = 0; i < sz; i++) {
                String curr = q.poll();
                
                if (curr.equals(end)) return step;
                
                char[] currArray = curr.toCharArray();

                for (int j = 0; j < currArray.length; j++) {
                    char old = currArray[j];
                    for (char c : charSet) {
                        currArray[j] = c;
                        String next = new String(currArray);
                        
                        if(bankSet.contains(next)) {
                            q.offer(next);
                            bankSet.remove(next);
                        }
                    }
                    currArray[j] = old;
                }
            }
            step++;
        }

        return -1;
    }
}