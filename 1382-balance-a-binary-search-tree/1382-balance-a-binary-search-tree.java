/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<Integer> inorderList = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);                          
        return build(0, inorderList.size() - 1); 
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        inorderList.add(node.val);
        inorder(node.right);
    }

    private TreeNode build(int l, int r) {
        if (l > r) return null;
        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(inorderList.get(mid));
        root.left = build(l, mid - 1);
        root.right = build(mid + 1, r);
        return root;
    }
}