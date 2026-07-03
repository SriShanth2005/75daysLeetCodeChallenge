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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return list;
        }
        q.add(root);
        int depth=0;
        while(!q.isEmpty()){
            int size=q.size();
            int[] arr=new int[size];
            List<Integer> list1=new ArrayList<Integer>();
            if(depth%2==0){
                for(int i=0;i<size;i++){
                    TreeNode node=q.poll();
                    list1.add(node.val);
                    if(node.left!=null){
                        q.add(node.left);
                    }
                    if(node.right!=null){
                        q.add(node.right);
                    }
                }
            }
            else{
                for(int i=0;i<size;i++){
                    TreeNode node=q.poll();
                    arr[i]=node.val;
                    if(node.left!=null){
                        q.add(node.left);
                    }
                    if(node.right!=null){
                        q.add(node.right);
                    }
                }
                for(int i=arr.length-1;i>=0;i--){
                    list1.add(arr[i]);
                }
            }
            list.add(list1);
            depth++;
        }
        return list;
    }
}