import java.util.List;


// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    int count = 0;

    public int maxDepth(Node root) {
        traverse(root, 0);
        return count;
    }

    void traverse(Node n, int depth) {
        if(n ==null) return;
        if (!n.children.isEmpty()) {
            depth++;
            for (Node nx : n.children) {
                traverse(nx, depth);
            }
        } else {
            depth++;
        }
        if (depth > count) {
            count = depth;
        }
    }
}
