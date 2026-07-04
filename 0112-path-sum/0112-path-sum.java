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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> q1=new LinkedList<>();

        q.add(root);
        q1.add(root.val);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            int sum=q1.poll();
            if(node.left==null && node.right==null && sum==targetSum){
                return true;
            }
            if(node.left!=null){
                q.add(node.left);
                q1.add(sum+node.left.val);
            }
            if(node.right!=null){
                q.add(node.right);
                q1.add(sum+node.right.val);
            }
        }
        return false;
    }
}