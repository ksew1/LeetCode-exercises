/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public IList<int> list;
    public IList<int> InorderTraversal(TreeNode root) {
        this.list = new List<int>();
        Visit(root);
        return this.list;
        
    }
    public void Visit(TreeNode node) {
        if (node == null) {
            return;
        }
        Visit(node.left);
        this.list.Add(node.val);
        Visit(node.right);
    }
}