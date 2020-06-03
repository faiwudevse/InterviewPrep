# Trie
## Trie or prefix tree is a treee data structure, which is used for retrieval of a key in a dataset of strings. There are various applications of this very efficient data structure such as: 1. Autocomplete 2. Spell checker 3.IP routing (Longest prefix matching) 4.T9 predicitive text
5. Solving word games


```java
class Trie {
    private boolean isEnd;
    private Trie[] next;

    public Trie() {
        isEnd = false;
        next = new Trie[26];
    }

    public void insert(String word) {
        if (word == null || word.length() == 0)
            return;
        Trie curr = this;

        char[] words = word.toCharArray();

        for (int i = 0; i < words.length; i++) {
            int n = words[i] - 'a';
            if (curr.next[n] == null)
                curr.next[n] = new Trie();
            curr = curr.next[n];
        }
        curr.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        Trie node = searchPrefix(prefix);
        return node != null;
    }

    private Trie searchPrefix(String word) {
        Trie node = this;
        char[] words = word.toCharArray();
        for (int i = 0; i < words.length; i++) {
            node = node.next[words[i] - 'a'];
            if (node == null) 
                return null;
        }

        return node;
    }
}
```