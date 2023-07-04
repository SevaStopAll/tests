package CloneGraph;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> visited = new HashMap<>();
        return dfs(node, visited);
    }

    private Node dfs(Node node, Map<Node,Node> visited) {
        if (visited.containsKey(node)) {
            return visited.get(node);
        }
        Node copy = new Node(node.val);
        visited.put(node, copy);
        for (Node n : node.neighbors) {
            copy.neighbors.add(dfs(n, visited));
        }
        return copy;
    }
}
