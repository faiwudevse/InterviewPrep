# Algorithm Questions
## Arrays


## DFS
### Recursion
```Python
visited = set()
def DFS(node, visited):
    if node in visted # terminator
        # already visited
        return
    visited.add(node)

    #process current node here
    ...
    for next_node in node.children():
        if next_node not in visted:
            DFS(next_node, visted)
```
### Stack
```Python
def DFS(self, tree):
    if tree.root is None:
        return []
    visited, stack = [] , [tree.root];

    while stack:
        node = stack.pop()
        visted.add(node)
        process (node)
        nodes = generate_related_nodes(node)
        stack.push(nodes)

    # other processing work
```

## BFS
### Queue
```Python
void BFS(graph, start, end):
    visited = set()
    queue = []
    queue.append([start])

    while queue:
        node = queue.pop()
        visited.add(node)
        process(node)
        nodes = generate_related_nodes(node)
        queue.push(nodes)
    #other processing work
```

```Java
// count from start to target the shorest distant
int BFS(Node start, Node target) {
    Queue<Node> q; // queue the core data strucure
    Set<Node> visted; // 

    q.offer(start); // 
    visted.add(start);

    int step = 0;

    while (q not empty) {
        int sz = q.size();

        for (int i = 0; i < sz; i++) {
            Node cur = q.poll();

            if (cur is target) return step;

            for (Node x : cur.addj()) {
                if (x not in visted) {
                    q.offer(x);
                    visited.add(x);
                }
           }
        }
    }
}
```
