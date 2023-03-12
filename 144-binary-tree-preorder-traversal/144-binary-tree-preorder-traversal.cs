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
    public IList<int> PreorderTraversal(TreeNode root) {
        this.list = new List<int>();
        Visit(root);
        return this.list;
        
        
    }
    public void Visit(TreeNode node) {
        if (node == null) {
            return;
        }
        list.Add(node.val);
        Visit(node.left);
        Visit(node.right);
        
    }
}