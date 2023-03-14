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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        sumNumbers(root, 0);
        return sum;
    }
    public void sumNumbers(TreeNode root, int currentNum){
        
        if(root == null) return;
        if(root.left == null && root.right == null){
            sum += currentNum * 10 + root.val;
            return;
        }
        sumNumbers(root.left, currentNum * 10 + root.val);
        sumNumbers(root.right, currentNum * 10 + root.val);
    }
}
