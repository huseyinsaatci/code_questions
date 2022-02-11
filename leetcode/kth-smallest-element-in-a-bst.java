//Definition for a binary tree node.
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
    int count = 0;
    int val = 0;

    public int kthSmallest(TreeNode root, int k) {
        inOrderTraverse(root, k);
        return val;
    }

    public void inOrderTraverse(TreeNode root, int k) {
        if (root.left != null)
            inOrderTraverse(root.left, k);
        count++;
        if (count == k) {
            val = root.val;
            return;
        }
        if (root.right != null)
            inOrderTraverse(root.right, k);
    }
}