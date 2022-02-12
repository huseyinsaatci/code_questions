class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  int max = Integer.MAX_VALUE;

  public int minDepth(TreeNode root) {
    dfs(root, 1);
    if (max == Integer.MAX_VALUE)
      return 0;
    return max;
  }

  void dfs(TreeNode n, int depth) {
    if (n == null) {
      return;
    }
    if (n.left == null && n.right == null) {
      if (depth < max)
        max = depth;
      return;
    }
    dfs(n.left, depth + 1);
    dfs(n.right, depth + 1);
  }
}