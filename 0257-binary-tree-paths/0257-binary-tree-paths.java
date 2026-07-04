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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        Queue<String> q1=new LinkedList<>();
        q.add(root);
        q1.add(root.val + "");
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            String path=q1.poll();
            if(node.left==null && node.right==null){
                list.add(path);
            }
            if(node.left!=null){
                q.add(node.left);
                q1.add(path+"->"+node.left.val);
            }
            if(node.right!=null){
                q.add(node.right);
                q1.add(path+"->"+node.right.val);
            }
        }
        return list;
    }
}