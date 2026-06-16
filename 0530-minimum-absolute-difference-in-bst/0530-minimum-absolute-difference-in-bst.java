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
    public int getMinimumDifference(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
         TreeNode node=q.poll();
        list.add(node.val);
        if(node.left!=null){
            q.add(node.left);
        }
        if(node.right!=null){
            q.add(node.right);
        }
        }
      Collections.sort(list);
      int min=Integer.MAX_VALUE;
      for(int i=1;i<list.size();i++){
            int diff=Math.abs(list.get(i)-list.get(i-1));
            if(diff<min){
                min=diff;
            }
      }
      return min;
    }
}