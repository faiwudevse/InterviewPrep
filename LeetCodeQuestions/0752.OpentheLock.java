/*
bfs with  2 ends 
*/
class Solution {
    private String plusOne(String s, int j) {
        char[] ch = s.toCharArray();
        
        if (ch[j] == '9')
            ch[j] = '0';
        else
            ch[j] += 1;
        
        return new String(ch);
    }

    private String minusOne(String s, int j) {
        char[] ch = s.toCharArray();

        if (ch[j] == '0')
            ch[j] = '9';
        else
            ch[j] -= 1;
        
        return new String(ch);
    }

    public int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet();
        for(String s : deadends) deads.add(s);

        
        Set<String> q1 = new HashSet();
        Set<String> q2 = new HashSet();
        Set<String> visited = new HashSet();

        int step = 0;
        q1.add("0000");
        q2.add(target);

        while(!q1.isEmpty() && !q2.isEmpty()) {
            
            Set <String> temp = new HashSet();

            for (String combo: q1) {
                if (deads.contains(combo))
                    continue;
                if (q2.contains(combo)) 
                    return step;

                visited.add(combo);

                for (int j = 0; j < 4; j++) {
                    String up = plusOne(combo, j);
                    if (!visited.contains(up)) 
                        temp.add(up);
                    String down = minusOne(combo, j);
                    if (!visited.contains(down))
                        temp.add(down);
                }
            }
            step++;

            q1 = q2;
            q2 = temp;
        }

        return -1;
    }
}

/*
bfs with 2-end with improvement 
*/

class Solution {
    private String plusOne(String s, int j) {
        char[] ch = s.toCharArray();
        
        if (ch[j] == '9')
            ch[j] = '0';
        else
            ch[j] += 1;
        
        return new String(ch);
    }

    private String minusOne(String s, int j) {
        char[] ch = s.toCharArray();

        if (ch[j] == '0')
            ch[j] = '9';
        else
            ch[j] -= 1;
        
        return new String(ch);
    }

    public int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet();
        for(String s : deadends) deads.add(s);

        
        Set<String> q1 = new HashSet();
        Set<String> q2 = new HashSet();
        Set<String> visited = new HashSet();

        int step = 0;
        q1.add("0000");
        q2.add(target);
        
        Set <String> temp;
        
        while(!q1.isEmpty() && !q2.isEmpty()) {
            
            if (q1.size() > q2.size()) {
                temp = q1;
                q1 = q2;
                q2 = temp;
            }
            
            temp = new HashSet<>();
            
            for (String combo: q1) {
                if (deads.contains(combo))
                    continue;
                if (q2.contains(combo)) 
                    return step;

                visited.add(combo);

                for (int j = 0; j < 4; j++) {
                    String up = plusOne(combo, j);
                    if (!visited.contains(up)) 
                        temp.add(up);
                    String down = minusOne(combo, j);
                    if (!visited.contains(down))
                        temp.add(down);
                }
            }
            step++;
            q1 = temp;
        }

        return -1;
    }
}