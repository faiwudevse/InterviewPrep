# Graph Search

## DFS (Depth - first search)
### It is a algorithm for traversing or searching tree or graph data structures. The algorithm starts at the root node (selecting some arbitrary node as the root node in the case of a graph) and explores as far as posible along each branch before backtracking. 

### The java dfs implementation below is the pesudocode to traverse all the node in the graph. Note that pre-order4 and other form of tree traversal are a form of DFS. The key difference is that when implementing this algorithm for a graph, we must check if the node has been visted. If we don't, we risk getting stuck in an infinite loop.
``` Java 
Set<Node> visited = new LinkedList();
void dfs(Node root) {
    if (root == null) return;
    visted.add(root);
    for(Node node: root.adjacent()) {
        if (!visted.contain(node))
            dfs(node);
    }
}
```
### BFS
### It is an algorithm for traversing or searching tree or graph data structures. It starts at the tree root (or some arbitarary node or a graph), and explores all of the neighbor nodes at the present depth prior to moving on to the nodes at the next depth level.

### The java bfs implementation below is the pesudocode to traverse all the node in the graph
``` Java 
void bfs(Node root) {
    if (root == null) return;
    Queue<Node> queue = new LinkedList();
    Set<Node> visted = new LinkedList();

    queue.offer(root);
    visted.add(root);

    while(!queue.isEmpty()) {
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            Node r = queue.poll();
            for(Node node: r.adjacent()) {
                if(!visted.contain(node)) {
                    queue.offer(node);
                    visited.add(node);
                }
            }
        }
    }
}
```

### The java bfs implementation below is the pseudocode to the short distance between source and target.
``` Java 
int bfs(Node source, Node target) {
    Queue<Node> queue = new LinkedList();
    Set<Node> visited = new LinkedList();

    queue.offer(source);
    visted.add(source);

    int level = 0;

    while(!queue.isEmpty()) {
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            Node root = queue.poll();

            if (root.equals(target))
                return level;

            for (Node node: root.adjacent()) {
                if (!visited.contain(node)) {
                    queue.offer(node);
                    visited.add(node);
                }
            } 
        }
        level++;
    }
} 
```