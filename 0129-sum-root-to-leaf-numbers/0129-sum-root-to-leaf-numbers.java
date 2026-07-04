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
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> q1=new LinkedList<>();
        q.add(root);
        q1.add(root.val);
        int sum=0;
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            int num=q1.poll();
            if(node.left==null && node.right==null){
                sum=sum+num;
            }
            if(node.left!=null){
                q.add(node.left);
                q1.add(num*10+node.left.val);
            }
            if(node.right!=null){
                q.add(node.right);
                q1.add(num*10+node.right.val);
            }
        }
        return sum;
    }
}